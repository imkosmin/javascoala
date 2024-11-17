/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject3;

import javax.swing.ImageIcon;
import java.awt.Color;

/**
 *
 * @author hcosm
 */
public class Atv { //clasa se numeste ATV sau Atv, who knows

    int id;
    String brand;
    String model;
    int year;
    Color color;
    int price;
    int weight;
    int mileage;
    //Engine motor; trb clasa
    // Transmission transmisie;
    ImageIcon photo;

    Atv() {  //se adauga Engine+ Transmission
        id = 0;
        brand="brand necunoscut";
        model="model necunoscut";
        year=0;
        color=null;
        price=0;
        weight=0;
        mileage=0;
        photo=new ImageIcon();
    }

    Atv(int id, String brand,String model,int year,Color color,int price,int weight,int mileage/*se adauga Engine+ Transmission*/,ImageIcon photo) 
    {
        this.id = id;
        this.brand=brand;
        this.model=model;
        this.year=year;
        this.color=color;
        this.price=price;
        this.weight=weight;
        this.mileage=mileage;
        this.photo=new ImageIcon(photo.getImage());//not sure 100%
    }

    Atv(Atv copy) { //se adauga Engine+ Transmission 
        
        
          this.id = copy.id;
        this.brand=copy.brand;
        this.model=copy.model;
        this.year=copy.year;
        this.color=copy.color;
        this.price=copy.price;
        this.weight=copy.weight;
        this.mileage=copy.mileage;
        this.photo=new ImageIcon(copy.photo.getImage());//not sure 100%
    }

    @Override
    public String toString() {
        
        return "Id: "+id+" Brand: "+" Model:"+model+" An de fabricatie: "+year+" Culoare: "+color+" Pret: "+price+" Greutate: "+weight+" kg "+""+mileage ;//se adauga Engine+ Transmission
    }
//Setters/Getters
}
