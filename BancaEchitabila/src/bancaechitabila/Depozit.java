package bancaechitabila;

public class Depozit {

    int numarDepozit;
    ContBancar cont;
    long dobanda;
    Data dataInceput;
    Data dataSfarsit;
    long sumaInitiala;
    long sumaFinala;

    public Depozit() {
        numarDepozit = 0;
        cont = null;
        dobanda = 0;
        dataInceput = null;
        dataSfarsit = null;
        sumaInitiala = 0;
        sumaFinala = 0;

    }

    public Depozit(int numarDepozit, ContBancar cont,long dobanda, Data dataInceput,Data dataSfarsit,long sumaInitiala,long sumaFinala) 
    {
        this.numarDepozit = numarDepozit;
        this.cont=new ContBancar(cont);
        this.dobanda=dobanda;
        this.dataInceput=new Data(dataInceput);
        this.dataSfarsit=new Data(dataSfarsit);
        this.sumaInitiala=sumaInitiala;
        this.sumaFinala=sumaFinala;
       
    }
    
    public String toString()
    {
        return "Numarul depozitului: "+numarDepozit+ "\n Numar: " +cont.numar+" Titular: "+cont.titular+" Suma: "
                +cont.suma+" Banca: "+cont.banca.nume+" "+cont.banca.adressbanca.adress+"\n Dobanda: "+dobanda+" Data: "+dataInceput.zi+" "+dataInceput.luna+" "+dataInceput.an
                +"\n Suma initiala: "+sumaInitiala+" sumaFinala: "+sumaFinala;
 
    }


}
