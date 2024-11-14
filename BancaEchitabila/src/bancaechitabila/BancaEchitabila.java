/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bancaechitabila;

/**
 *
 * @author nh114
 */
public class BancaEchitabila {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Data dataInceput=new Data(4,"septembrie",2023);
        Data dataSfarsit=new Data(10,"noiembrie",2024);
        Adresa adresa1=new Adresa("Strada 1 Decembrie");
        Banca banca1=new Banca("Romaneasca",adresa1);
        ContBancar cont1=new ContBancar(434,banca1,"Ion Costel",350000);
        Depozit unu=new Depozit(1,cont1,20, dataInceput,dataSfarsit,20000,25000);
        System.out.println(unu.toString());
        // int numarDepozit, ContBancar cont,long dobanda, Data dataInceput,Data dataSfarsit,long sumaInitiala,long sumaFinala
    }
    
}
