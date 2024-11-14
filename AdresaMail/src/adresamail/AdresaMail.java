/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package adresamail;

/**
 *
 * @author nh114
 */
public class AdresaMail {
    
    String denumire;
    boolean contBusiness;
    
        AdresaMail()
    {
        denumire="nu avem adresa mail";
        contBusiness=false;
    }
        
    AdresaMail(String denumire,boolean contBusiness)
    {
        this.denumire=denumire;
        this.contBusiness=contBusiness;
    }
    
  
    
    
    
    

    public static void main(String[] args) 
    {
        Mail bun=new Mail();
        AdresaMail adresa1=new AdresaMail("dragonu@gmail.com",true);
        AdresaMail adresa2=new AdresaMail("aka47@yahoo.com",false);
        
        System.out.println(bun.toString());
        Mail bun2=new Mail(adresa1,adresa2,"Salut,sunt eu,un prieten");
        
        System.out.println(bun2.toString());
    }
    
}
