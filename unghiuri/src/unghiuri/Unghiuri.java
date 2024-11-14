/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package unghiuri;
import java.util.Date;
/**
 *
 * @author nh114
 */
public class Unghiuri {


    public static void main(String[] args) {
        int unghi1;
        int unghi2;
        System.out.println(unghera(2, 4, 6, 3, 5, 7));//calcul unghi, merge si pentru adunare si scadere
                                                                                                                // System.out.println(unghera(1, 2, 3, 1, 2, 3));
                                                                                                               //        System.out.println(convertor(18553));
                                                                                                               //        Date date1=new Date(6055);
                                                                                                               //        Date date2=new Date(4);
                                                                                                               //        System.out.println(dating(date1,date2));
     
    }

    public static String unghera(int grad1, int min1, int sec1, int grad2, int min2, int sec2) {
        int grad3;
        int min3;
        int sec3;
        long total3scadere;
         long total3adunare;
        long total1 = grad1*60*60 + min1 * 60 + sec1 ;
        long total2 = grad2*60*60 + min2 * 60 + sec2;
        
        if (grad1 > grad2 || (grad1 == grad2 && min1 > min2) || (grad1 == grad2 && min1 > min2 && sec1 > sec2)) 
             total3scadere = total1 - total2;
        else
             total3scadere=total2-total1;                  
        total3adunare=total1+total2;
        
        return "\n adunare: "+convertor(total3adunare) +"\n scadere: "+ convertor(total3scadere);
    }

    public static String convertor(long total)
    {
        
                int grade;
                int minute;
                int secunde;
                long totalcalculat=total;

    
          
              grade=((int)(total/(60*60)));
             minute=(((int)((int)total)-grade*(60*60))/60);
             secunde=((int)total)%60;
             
             
         
            //   for(;(total/60)!=0;total/=60)
               //    minute++;

            return grade+" "+minute+" "+secunde;
        
    }
 
}
