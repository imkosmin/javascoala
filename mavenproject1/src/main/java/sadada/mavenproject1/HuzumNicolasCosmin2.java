/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package sadada.mavenproject1;
import java.util.Scanner;

public class HuzumNicolasCosmin2 {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
       
        int n = scan.nextInt();

        float sum = 0;

        for (int i = 0; i < n; i++) {
            
            sum += 1/Math.pow(2, i);
        }

        System.out.println(sum);
    }
}
