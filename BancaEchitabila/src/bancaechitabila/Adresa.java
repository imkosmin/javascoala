package bancaechitabila;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author nh114
 */
public class Adresa {
    String adress;

    public Adresa() {
        adress = "nu avem adresa";
    }

    public Adresa(String adress) {
        this.adress = adress;
    }

    public Adresa(Adresa copy) {
        this.adress = copy.adress;
    }
  
        
}
