package org.eclipse.che.examples;

public class HelloWorld {
    
    static String hw = "Hello World !";
    
    
    public String getHello(){
        return hw;
    }
 
    public static void main(String... argvs) {
        System.out.println(hw);
    }
}
