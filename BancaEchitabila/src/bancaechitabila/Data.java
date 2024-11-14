package bancaechitabila;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author nh114
 */
public class Data {

    String luna;
    int an;
    int zi;

    public Data() {
        luna = "nu stiu luna";
        an = 1866;
        int zi = 0;
    }

    public Data(int zi, String luna, int an) {
        this.zi = zi;
        this.luna = luna;
        this.an = an;

    }

    public Data(Data copy) {
        this.zi = copy.zi;
        this.luna = copy.luna;
        this.an = copy.an;
    }
}
