/* global comment*/

package my.testpackage;

/**
 * class MyFileClass
 */
@eu.mihosoft.vrl.instrumentation.VRLVisualization
public class MyFileClass {
    
    public static void main(String[] args) {
        
        int a = 2+3*2;
        int b = 5-a;
        
        if (b<a) {
            println("a<b: " + (b < a));
        }
    }
}