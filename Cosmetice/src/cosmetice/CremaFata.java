/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cosmetice;

/**
 *
 * @author nh114
 */
public class CremaFata extends Cosmetice{
      String ingrediente;
    boolean tenfin;
    int procentaloevera;
    
    CremaFata()
    {
        ingrediente="";
        tenfin=false;
        procentaloevera=0;
    }
    
    CremaFata(String nume,int gramaj,int bucati,boolean mostra ,String ingrediente,boolean antimatreata,boolean anticaderepar)
    {
        super(nume,gramaj,bucati,mostra);
    this.ingrediente=ingrediente;
    this.tenfin=tenfin;
    this.procentaloevera=procentaloevera;
    }
    
      public String toString()
{
     return super.toString()+"\n Ingrediente: "+ingrediente+"Anti matreata: "+tenfin+"Anti caderea parului: "+procentaloevera;
}

   CremaFata(CremaFata copy)
   {
    super(copy);
    this.ingrediente=copy.ingrediente;
    this.tenfin=copy.tenfin;
    this.procentaloevera=copy.procentaloevera;
 
   }
}
