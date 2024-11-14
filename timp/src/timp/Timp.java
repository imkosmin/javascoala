/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package timp;

import java.util.Date;

/**
 *
 * @author nh114
 */
public class Timp {

  public static void main(String[] args) {
        int ora1;
        int ora2;
        System.out.println(convertorOra(2, 4, 6, 3, 5, 7));//calcul data, merge si pentru adunare si scadere
     
    }

    public static String convertorOra(int ora, int min1, int sec1, int grad2, int min2, int sec2) {
        int grad3;
        int min3;
        int sec3;
        long total3scadere;
         long total3adunare;
        long total1 = ora*60*60 + min1 * 60 + sec1 ;
        long total2 = grad2*60*60 + min2 * 60 + sec2;
        
        if (ora > grad2 || (ora == grad2 && min1 > min2) || (ora == grad2 && min1 > min2 && sec1 > sec2)) 
             total3scadere = total1 - total2;
        else
             total3scadere=total2-total1;                  
        total3adunare=total1+total2;
        
        return "\n adunare: "+convertor(total3adunare) +"\n scadere: "+ convertor(total3scadere);
    }

    public static String convertor(long total)
    {
        
                int ore;
                int minute;
                int secunde;
                long totalcalculat=total;

    
          
              ore=((int)(total/(60*60)));
             minute=(((int)((int)total)-ore*(60*60))/60);
             secunde=((int)total)%60;
             
             
         
            //   for(;(total/60)!=0;total/=60)
               //    minute++;

            return ore+" "+minute+" "+secunde;
        
    }
   
}
