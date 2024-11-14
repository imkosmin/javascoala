/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cosmetice;

/**
 *
 * @author nh114
 */
public class GelDeDus extends Cosmetice{
    String ingrediente;
    boolean spuma;
    boolean  gel3in1;
    
    GelDeDus()
    {
        ingrediente="";
        spuma=false;
        gel3in1=false;
    }
    
    GelDeDus(String nume,int gramaj,int bucati,boolean mostra ,String ingrediente,boolean antimatreata,boolean anticaderepar)
    {
        super(nume,gramaj,bucati,mostra);
    this.ingrediente=ingrediente;
    this.spuma=spuma;
    this. gel3in1= gel3in1;
    }
    
      public String toString()
{
     return super.toString()+"\n Ingrediente: "+ingrediente+"Anti matreata: "+spuma+"Anti caderea parului: "+  gel3in1;//modifica asta
}

   GelDeDus(GelDeDus copy)
   {
    super(copy);
    this.ingrediente=copy.ingrediente;
    this.spuma=copy.spuma;
    this. gel3in1=copy.gel3in1;
 
   }
}
