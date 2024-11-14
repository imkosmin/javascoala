/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cosmetice;


public class AfterShave extends Cosmetice{
       String ingrediente;
    boolean alcool;
    String zonealepielii;
    
    AfterShave()
    {
        ingrediente="";
        alcool=false;
        zonealepielii="";
    }
    
    AfterShave(String nume,int gramaj,int bucati,boolean mostra ,String ingrediente,boolean antimatreata,boolean anticaderepar)
    {
        super(nume,gramaj,bucati,mostra);
    this.ingrediente=ingrediente;
    this.alcool=alcool;
    this.zonealepielii=zonealepielii;
    }
    
      public String toString()
{
     return super.toString()+"\n Ingrediente: "+ingrediente+"Anti matreata: "+alcool+"Anti caderea parului: "+ zonealepielii;
}

   AfterShave(AfterShave copy)
   {
    super(copy);
    this.ingrediente=copy.ingrediente;
    this.alcool=copy.alcool;
    this.zonealepielii=copy.zonealepielii;
 
   }
}
