/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eu.mihosoft.vrl.lang.model;

/**
 *
 * @author Michael Hoffer &lt;info@michaelhoffer.de&gt;
 */
public class ContinueInvocationImpl extends InvocationImpl implements ContinueInvocation {

    public ContinueInvocationImpl(String id, Scope parent) {

        super(parent, id, ObjectProvider.empty(), "continue", Type.VOID, false, true);

        getNode().setTitle("continue");
    }

}
