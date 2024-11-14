/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package gg.random1;

import java.util.Scanner;

/**
 * s
 *
 * @author nh114
 */
public class Random1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int lungime;
        do {
            System.out.println("Introdu lungime ");
            lungime = scan.nextInt();
        } while (lungime > 100 || lungime < 0);

      System.out.println(lungime);
        lungime/=2;
        
        /*cititm de la tastatura n<100 lungimea si latime 
       sa fac o clepsidra cu x-uri
         */
        for (int i =0 ; i < lungime; i++) {
            System.out.println("");

            for (int k = 0; k < i; k++) {
                System.out.print(" ");
            }

            for (int j = 0; j < (lungime - i); j++) {

                System.out.print("X");
            }
            
            
                for (int j = 0; j < (lungime - i); j++) {

                System.out.print("X");
            }

        }
        
        
        for (int i = 0; i < lungime+1; i++) {
            if(i!=0)
            System.out.println("");

       
                      
            for (int k = lungime; k >i; k--) {
                System.out.print(" ");
            }

            for (int j = lungime; j > (lungime-i ); j--) {

                System.out.print("X");
            }
            for (int j = lungime; j > (lungime-i ); j--) {

                System.out.print("X");
            }
            
            
                    

        }
    }
}
/*
XXX
 X
xxx

xxxxx
 xxx
  x
 xxx
xxxxx
*/
