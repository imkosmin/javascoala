/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cosmetice;


public class Sampon extends Cosmetice {//conf. articolului  https://destepti.ro/samponul-produs-pentru-igiena-sanatate-si-frumusete/ samponul,crema de fata si restul sunt cosmetice.
    String ingrediente;
    boolean antimatreata;
    boolean anticaderepar;
    
    Sampon()
    {
        ingrediente="";
        antimatreata=false;
        anticaderepar=false;
    }
    
    Sampon(String nume,int gramaj,int bucati,boolean mostra ,String ingrediente,boolean antimatreata,boolean anticaderepar)
    {
        super(nume,gramaj,bucati,mostra);
    this.ingrediente=ingrediente;
    this.antimatreata=antimatreata;
    this.anticaderepar=anticaderepar;
    }
    
      public String toString()
{
     return super.toString()+"\n Ingrediente: "+ingrediente+"Anti matreata: "+antimatreata+"Anti caderea parului: "+anticaderepar;
}

   Sampon(Sampon copy)
   {
             super(copy);
       ingrediente=copy.ingrediente;
       antimatreata=copy.antimatreata;
       anticaderepar=copy.anticaderepar;
 
   }
    
      
        
    
}
