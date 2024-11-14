/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package gg.stringuri;

/**
 *
 * @author nh114
 */
public class Stringuri {

    public static void main(String[] args) {
        String s1 = "Acesta este primul SIR";
        String s2 = "cel de-al doilea sir de caractere";

        System.out.println(s1);
        System.out.println(s2);

        System.out.println("Caracter :" + s1.charAt(4) + "Codepoint s1: " + s1.codePointAt(4) + "Caracter :" + s1.charAt(14) + "Codepoint s1: " + s1.codePointAt(14));
        System.out.println("Caracter :" + s2.charAt(4) + "Codepoint s2: " + s2.codePointAt(4) + "Caracter :" + s1.charAt(14) + "Codepoint s2: " + s2.codePointAt(14));
        System.out.println(s1.equals(s2));
        System.out.println(s1.toLowerCase());
        System.out.println("Lungime:" + s1.length());
        System.out.println(s1.replace("SIR", "string"));
        System.out.println("");
        
        for(int i=s1.length()-1;i>=0;i--)
        {
            System.out.print(s1.charAt(i));
        }
        double a=20.2;
       
        int x=42;
        int y=32;
        double sign=23;
        double magnitude=-32;
                System.out.println("");
        System.out.println(Math.abs(x));
        System.out.println(Math.acos(x));
        System.out.println(Math.cos(x));
        System.out.println(Math.cosh(x));
        System.out.println(Math.addExact(x,y));
        System.out.println(Math.asin(a));
	System.out.println(Math.atan(a));
        System.out.println(Math.atan2(x,y));
        System.out.println(Math.cbrt(a));  
        System.out.println(Math.floor(a));
        System.out.println(Math.ceil(a));  
        System.out.println(Math.copySign(magnitude, sign));//copiaza semnul unei alteia
        System.out.println(Math.decrementExact(x));// x++
        System.out.println(Math.exp(a));
        System.out.println(Math.log(a));
        System.out.println(Math.max(x,y));
        System.out.println(Math.pow(x,y));
        System.out.println("random number:"+Math.random());
        System.out.println(Math.round(a));
        System.out.println(Math.sqrt(a));
        System.out.println(Math.tan(a));
        int angle=30;//degrees
        System.out.println(Math.toRadians(angle));
        
        
        
        
        
        
    }
}
