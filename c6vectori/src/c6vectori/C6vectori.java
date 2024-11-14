/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package c6vectori;
import java.lang.reflect.Array;
/**
 *
 * @author nh114
 */
public class C6vectori {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] vi1 = {3, 2, 4, 2};
        int[] vi2 = {3, 3, 4, 9};
        double[] vd1 = {3, 4, 2, 2, 7};
        double[] vd2 = {5, 3.2, 2, 5};
        String[] vs = {"3", "3", "3", "4"};
        Object[] vo1 = new Object[4];
        Object[] vo2 = new Object[4];
        Object ro1;
        Object ro2 = new Object[4];

        vo1 = vs;
        ro1 = vi1;
        ro2 = vd1;
        vd2 = (double[]) ro2; //altfel nu e posibil
            int length = Array.getLength(ro2);//se poate si asta daca folosim java.lang.reflect.Array pt a afla cat de lung e un Object Array
            System.out.println(length);
        for (Object i : vo1) {
            System.out.print(i + " ");
        }
        System.out.println("");
        for (Object i : vo2) {
            System.out.println(i + " ");
        }
        System.out.println("");
        for (int i = 0; i < vi2.length; i++) {
            System.out.println(vi2[i] + " ");
        }
        System.out.println("");
        for (int i = 0; i < vd1.length; i++) {
            System.out.println(vd1[i] + " ");
        }
        System.out.println("");
        for (int i = 0; i < vd2.length; i++) {
            System.out.println(vd2[i] + " ");
        }

        System.out.println("");
        for (int i = 0; i < vi1.length; i++) {
            System.out.println(vi1[i]+" ");
        }
        System.out.println("");
        for (Object i : (int[]) ro1) {
            System.out.println(i+" ");
        }
        System.out.println("");
        for (Object i : (double[]) ro2) {
            System.out.println(i+" ");
        }
        System.out.println("");
        for (String i : vs) {
            System.out.println(i+" ");
        }

    }

}
