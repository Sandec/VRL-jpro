/* 
 * FilterComments.java
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

package eu.mihosoft.vrl.lang;


/**
 *
 * @author Michael Hoffer <info@michaelhoffer.de>
 */
public class FilterComments{


    public String process(String code) {
        
        StringBuilder result = new StringBuilder();

        String[] lines = code.split("\n");

        boolean multiLineComment = false;
        boolean insideComment = false;

        for (String l : lines) {

            char lastChar = 0;
            boolean doubleQuotes = false;
            boolean singleLineComment = false;
            boolean multiLineCommentStop = false;

            for (int i = 0; i < l.length(); i++) {

                char ch = l.charAt(i);

                // find double quotes (handles encapsulated quotes correctly)
                if (ch == '\"' && lastChar != '\\') {
                    doubleQuotes = !doubleQuotes;
                }

                // single-line comment
                if (ch == '/' && lastChar == '/') {
                    singleLineComment = !doubleQuotes || singleLineComment;
                }

                // multi-line comment start
                if (lastChar == '/' && ch == '*') {
                    multiLineComment = (!doubleQuotes || multiLineComment)
                            && !multiLineCommentStop;
                }

                // multi-line comment stop
                if (lastChar == '*' && ch == '/') {
                    multiLineComment = doubleQuotes && multiLineComment;
                    multiLineCommentStop = true && !doubleQuotes;
                }

                insideComment = singleLineComment || multiLineComment;

                // if we are in a single-line comment there is nothing to check,
                // we can break
                if (singleLineComment) {
                    break;
                }

                // if we are not inside of a comment, we write characters
                if (!insideComment) {
                    // we did read ahead last time to check whether we are
                    // inside of a comment. as we were not, we write the
                    // last char now.
                    if (lastChar == '/' && !multiLineCommentStop) {
                        result.append(lastChar);
                    }
                    // if the current character is a '/' we do not write this
                    // character as we do not know if this is the beginning of
                    // a comment
                    if (ch != '/') {
                        multiLineCommentStop = false;
                        result.append(ch);
                    }
                }

                lastChar = ch;
            }

            if (!insideComment && lastChar!='/') {
                result.append('\n');
            }

        } // end for lines

        return result.toString();
    }

}
