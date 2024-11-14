package bancaechitabila;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author nh114
 */
public class Banca {

    String nume;
    Adresa adressbanca;

    public Banca() {
        nume = "nu avem nume";
        adressbanca = null;
    }

    public Banca(String nume, Adresa adress) {
        this.nume = nume;
        this.adressbanca = new Adresa(adress);//copy constructor

    }
        public Banca(Banca copy) {
        this.adressbanca = copy.adressbanca;
        this.nume = copy.nume;
      
    }
}
