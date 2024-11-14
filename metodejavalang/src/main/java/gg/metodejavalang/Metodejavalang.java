/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package gg.metodejavalang;
import java.lang.Class.*;
/**
 *
 * @author nh114
 */
public class Metodejavalang {

    public static void main(String[] args) {
        Exemplu patru=new Exemplu();
        Exemplu unu=new Exemplu("A",12,7);
        ExempluAdv doi=new ExempluAdv("B",15,5,true);
        Exemplu trei=(Exemplu)doi;
        System.out.println(doi.toString());
        Class clasa=ExempluAdv.class;
        System.out.println(clasa.getName());
        System.out.println(clasa.getClasses());
        System.out.println(clasa.getAnnotations());
        System.out.println(clasa.getConstructors());
        System.out.println(clasa.getFields());
        System.out.println(clasa.getSigners());	
       //   System.out.println(clasa.);
        System.out.println(clasa.getSuperclass());	
        System.out.println((clasa.getSuperclass()).getSuperclass());	
          System.out.println(clasa.isArray());
          try{
          System.out.println(clasa.newInstance());
          }
          catch(Exception e)
          {
                 System.out.println(clasa.getSuperclass());
          }
    }
}
