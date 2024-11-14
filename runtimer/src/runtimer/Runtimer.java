/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package runtimer;
import java.lang.Runtime;
/**
 *
 * @author nh114
 */

public class Runtimer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           Runtime run=Runtime.getRuntime(); 
           System.out.println(run.availableProcessors());
           
           System.out.println(run.freeMemory());
           System.out.println(run.maxMemory());
           System.out.println(run.totalMemory());
           
                   
          
    }
    public static void ramura()
    {
      /*  if(check=0)
            System.out.println("exit cu 0");
    else*/
    }
    
}
