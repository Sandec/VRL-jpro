/* 
 * Type.java
 *
 * Copyright (c) 2009–2014 Steinbeis Forschungszentrum (STZ Ölbronn),
 * Copyright (c) 2006–2014 by Michael Hoffer
 * 
 * This file is part of Visual Reflection Library (VRL).
 *
 * VRL is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License version 3
 * as published by the Free Software Foundation.
 * 
 * see: http://opensource.org/licenses/LGPL-3.0
 *      file://path/to/VRL/src/eu/mihosoft/vrl/resources/license/lgplv3.txt
 *
 * VRL is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * This version of VRL includes copyright notice and attribution requirements.
 * According to the LGPL this information must be displayed even if you modify
 * the source code of VRL. Neither the VRL Canvas attribution icon nor any
 * copyright statement/attribution may be removed.
 *
 * Attribution Requirements:
 *
 * If you create derived work you must do three things regarding copyright
 * notice and author attribution.
 *
 * First, the following text must be displayed on the Canvas or an equivalent location:
 * "based on VRL source code".
 * 
 * Second, the copyright notice must remain. It must be reproduced in any
 * program that uses VRL.
 *
 * Third, add an additional notice, stating that you modified VRL. In addition
 * you must cite the publications listed below. A suitable notice might read
 * "VRL source code modified by YourName 2012".
 * 
 * Note, that these requirements are in full accordance with the LGPL v3
 * (see 7. Additional Terms, b).
 *
 * Publications:
 *
 * M. Hoffer, C.Poliwoda, G.Wittum. Visual Reflection Library -
 * A Framework for Declarative GUI Programming on the Java Platform.
 * Computing and Visualization in Science, in press.
 */
package eu.mihosoft.vrl.lang.model;

import eu.mihosoft.vrl.base.VClassLoaderUtil;
import eu.mihosoft.vrl.lang.VLangUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author Michael Hoffer <info@michaelhoffer.de>
 */
public final class Type implements IType {

    private final String packageName;
    private final String shortName;
    private final boolean isReturnOrParamType;

    private final IType componentType;

    public static final IType VOID = new Type("void");
    public static final IType INT = new Type("int");
    public static final IType LONG = new Type("long");
    public static final IType SHORT = new Type("short");
    public static final IType FLOAT = new Type("float");
    public static final IType DOUBLE = new Type("double");
    public static final IType BOOLEAN = new Type("boolean");
    public static final IType CHAR = new Type("char");
    public static final IType BYTE = new Type("byte");
    public static final IType STRING = new Type("java.lang.String");
    public static final IType OBJECT = new Type("java.lang.Object");
    
    private static final List<IType> primitives = 
            new ArrayList<>(
                    Arrays.asList(new IType[]{
                        INT,LONG,SHORT,FLOAT,DOUBLE,BOOLEAN,CHAR, BYTE}));

//    public Type(String packageName, String shortName, boolean isReturnOrParamType) {
//        this.packageName = packageName;
//        this.shortName = shortName;
//
//        validate();
//    }
//
    public Type(String packageName, String shortName) {
        this(packageName + "." + shortName, false);

        validate();
    }

    public Type(String fullName) {
        this(fullName, false);
    }

    @Deprecated
    public Type(String fullName, boolean isReturnOrParamType) {

        // check for array type
        int arrayDimension = VClassLoaderUtil.arrayDimension(fullName);
        if (arrayDimension > 0) {
            componentType = new Type(VClassLoaderUtil.elementClassName(fullName), isReturnOrParamType);
        } else {
            componentType = this;
        }

        boolean isPackageNameSpecified = arrayDimension == 0;

        if (isPackageNameSpecified) {
            isPackageNameSpecified = !VLangUtils.isShortName(fullName);
        }

        if (isPackageNameSpecified) {
            this.packageName = VLangUtils.slashToDot(
                    VLangUtils.packageNameFromFullClassName(fullName));
            this.shortName = VLangUtils.shortNameFromFullClassName(fullName);
        } else {
            this.packageName = "";
            this.shortName = fullName;
        }

        this.isReturnOrParamType = isReturnOrParamType;

        validate();
    }

    private void validate() {

        // we use local package and short name as in array case they represent
        // the element type
        String packageName = this.packageName;
        String shortName = this.shortName;

        if (isArray()) {
            shortName = shortName.replaceFirst("^\\[+", "");
            if (shortName.startsWith("L") && shortName.endsWith(";")) {
                shortName = shortName.substring(1, shortName.length() - 1);
            }
            packageName = VLangUtils.slashToDot(
                    VLangUtils.packageNameFromFullClassName(shortName));
            shortName = VLangUtils.shortNameFromFullClassName(shortName);
        }

        if (!VLangUtils.isPackageNameValid(VLangUtils.slashToDot(packageName))) {
            throw new IllegalArgumentException("Specified package is invalid: " + getPackageName());
        }
        if (!isReturnOrParamType) {
            if (!VLangUtils.isClassNameValid(shortName)) {
                throw new IllegalArgumentException("Specified classname is invalid: " + getShortName());
            }
        } else {
            if (!VLangUtils.isIdentifierValid(shortName, true)) {
                throw new IllegalArgumentException("Specified classname is invalid: " + getShortName());
            }
        }
    }

    /**
     * @return the packageName
     */
    @Override
    public String getPackageName() {
        return packageName;
    }

    /**
     * @return the shortName
     */
    @Override
    public String getShortName() {
        return shortName;
    }

    @Override
    public String getFullClassName() {
        if (packageName.isEmpty()) {
            return shortName;
        } else {
            return packageName + "." + shortName;
        }
    }

    @Override
    public String toString() {
        return "[pck: " + packageName + ", name: " + shortName + "]";
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + Objects.hashCode(this.packageName);
        hash = 71 * hash + Objects.hashCode(this.shortName);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Type other = (Type) obj;
        if (!Objects.equals(this.packageName, other.packageName)) {
            return false;
        }
        if (!Objects.equals(this.shortName, other.shortName)) {
            return false;
        }
        return true;
    }

    public static Type fromObject(Object o) {

        return new Type(o.getClass().getName());

    }

    public static Type fromClass(Class<?> cls) {

        return new Type(cls.getName());

    }

    @Override
    public boolean isArray() {
        return shortName.startsWith("[");
    }

    @Override
    public IType getComponentType() {
        return componentType;
    }

    @Override
    public String getClassNameAsCode() {
        if (isArray()) {
            return VClassLoaderUtil.arrayClass2Code(shortName).replace("java.lang.", "");
        } else {
            if (getPackageName().equals("java.lang")) {
                return getShortName();
            } else {
                return getFullClassName();
            }
        }
    }

    @Override
    public boolean isPrimitive() {
        return primitives.contains(this);
    }

}
