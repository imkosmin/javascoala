package bancaechitabila;


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
