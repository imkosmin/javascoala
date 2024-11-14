/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cosmetice;

/**
 *
 * @author nh114
 */
public class CremaCorp extends Cosmetice{
    String ingrediente;
    boolean hidratanta;
    String tipuridepiele;
    
    CremaCorp()
    {
        ingrediente="";
        hidratanta=false;
        tipuridepiele="";
    }
    
    CremaCorp(String nume,int gramaj,int bucati,boolean mostra ,String ingrediente,boolean antimatreata,boolean anticaderepar)
    {
        super(nume,gramaj,bucati,mostra);
    this.ingrediente=ingrediente;
    this.hidratanta=hidratanta;
    this.tipuridepiele=tipuridepiele;
    }
    
      public String toString()
{
     return super.toString()+"\n Ingrediente: "+ingrediente+"Anti matreata: "+hidratanta+"Anti caderea parului: "+ tipuridepiele;
}

   CremaCorp(CremaCorp copy)
   {
    super(copy);
    this.ingrediente=copy.ingrediente;
    this.hidratanta=copy.hidratanta;
    this.tipuridepiele=copy.tipuridepiele;
 
   }
}
