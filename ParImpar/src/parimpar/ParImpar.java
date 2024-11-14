/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package parimpar;

/**
 *
 * @author nh114
 */
public class ParImpar {

    public static void main(String[] args) {
        if (args[0] != null) {
            paritate(Integer.parseInt(args[0]));
            nrPrimitate(Integer.parseInt(args[0]));
        }
    }

    public static void paritate(int n) {
        if (n % 2 == 0) {
            System.out.println("este numar par");
        } else {
            System.out.println("este numar impar");
        }
    }

    public static void nrPrimitate(int n) {
        int suma = 0;
        for (int i = 0; i < n; i++) {

            if (0 == n % (i + 1) ) 
            {
                suma++;
            }

            if (suma > 2 || n == 1) {
                System.out.println("nu este numar prim");
                return;
            }
        }
        System.out.println("este numar prim");

    }
}
