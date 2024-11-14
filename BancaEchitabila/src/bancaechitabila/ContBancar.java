package bancaechitabila;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author nh114
 */
public class ContBancar {

    long numar;
    Banca banca;
    String titular;
    double suma;

    public ContBancar() {
        numar = 0;
        suma = 0;
        banca = null;
        titular = "";

    }

    public ContBancar(long numar, Banca banca, String titular, long suma) {
        this.numar = numar;
        this.titular = titular;
        this.suma = suma;
        this.banca = new Banca(banca);//copy constructor pt banca
    }

    public ContBancar(ContBancar cont) {
        this.numar = cont.numar;
        this.titular = cont.titular;
        this.suma = cont.suma;
        this.banca = new Banca(cont.banca);//copy constructor pt banca 
    }
}
