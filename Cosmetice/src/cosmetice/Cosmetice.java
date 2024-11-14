/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cosmetice;


public class Cosmetice {
   String nume;
   int gramaj;
   int bucati;
   boolean mostra;
   
   
   Cosmetice()
   {
       nume="";
       gramaj=0;
       bucati=0;
       mostra=false;
   }
   
   Cosmetice(String nume,int gramaj,int bucati,boolean mostra)
   {
       this.nume=nume;   
       this.gramaj=gramaj;
       this.bucati=bucati;
       this.mostra=mostra;
  
       
   }
   
   public String toString()
   {
       return "Nume: "+nume+" Gramaj: "+gramaj+" Numar bucati: "+bucati+"Mostra: "+mostra;
   }
   
   
   Cosmetice(Cosmetice copy)
   {
       gramaj=copy.gramaj;
       bucati=copy.bucati;
       mostra=copy.mostra;
       nume=copy.nume;
   }
   
    public static void main(String[] args) 
    
    {
        Cosmetice unu=new Cosmetice();
        Cosmetice doi=new Cosmetice("Dormeo",500,2,true);
        Cosmetice trei=new Cosmetice("Maggy",100,1,false);
             System.out.println(unu.toString());
               System.out.println(doi.toString());
        Sampon sampon1=new Sampon("Maggy",100,1,false,"seminte de susan",true,false);
        System.out.println(sampon1.toString());
       
    }
    
}
