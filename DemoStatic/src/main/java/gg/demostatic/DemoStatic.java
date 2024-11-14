/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package gg.demostatic;

/**
 *
 * @author nh114
 */
public class DemoStatic {
//exemplu de utilizare a campurilor si metodelor statice si nestatice

    public int nestaticInteger = 0;

    public int nestaticMethod() {
        return nestaticInteger;
    }
    public static int staticInteger = 100;

    public static int staticMethod() {
        return staticInteger;
    }

    public static void main(String[] args) {
        DemoStatic instanta1 = new DemoStatic();
        DemoStatic instanta2 = new DemoStatic();
//referinta catre membri nestatici
        instanta1.nestaticInteger = 1;
        instanta2.nestaticInteger = 2;
        System.out.println("instanta1.nestaticInt=" + instanta1.nestaticMethod());
        System.out.println("instanta2.nestaticInt=" + instanta2.nestaticMethod());
//nu se pot referi direct membrii nestatici dintr-o metoda a clasei
        //System.out.println(nestaticMethod()); //ilegal
        //System.out.println(nestaticInteger); //ilegal
        //referinta la membrii statici
        DemoStatic.staticInteger = 3;
        System.out.println("staticInteger=" + staticMethod());
        System.out.println("instanta1.staticInteger=" + instanta1.staticMethod());
//instante diferite au aceeasi valoare a datelor statice
        instanta1.staticInteger = 4;
        System.out.println("\ndupa atribuire \n instanta1.staticInteger=" + instanta1.staticMethod());
        System.out.println("instanta2.staticInteger=" + instanta2.staticMethod());
    }
}
