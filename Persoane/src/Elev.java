/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author nh114
 */
public class Elev extends Persoane
{
    boolean esteelev;
    String liceu;
    int anul;
    
    
    Elev()
    {
    super();
    esteelev=false;
    liceu="";
    anul=0;
    }
    Elev(String n, String pn, int an,boolean esteelev,String liceu,int anul)
    {
        super(n,pn,an);
    
      this.esteelev=esteelev;
      this.liceu=liceu;
      this.anul=anul;
    }
    public Elev(Elev constructor) 
     {
      this.nume=constructor.nume;
      this.prenume=constructor.nume;
      this.anNastere=constructor.anNastere;
      this.esteelev=constructor.esteelev;
      this.liceu=constructor.liceu;
      this.anul=constructor.anul;
     }
    public boolean getEsteElev()
    {
        return this.esteelev;
    }

     public String toString()
     {
         
         return "Instanta:" +nume+" "+prenume+" "+anNastere+" "+esteelev+" "+liceu+" "+anul;
     }
     
}
