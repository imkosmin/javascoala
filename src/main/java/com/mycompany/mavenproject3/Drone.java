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
public class Drone {                   
                   
    int id;
    String brand;
    String model;
    int year;
    Color color;
    int price;
    int weight;
    int engineCycles;
    //Engine engine;
    ImageIcon photo;//adaugata pt ca nu era

    Drone() {
        brand = "brand necunoscut";
        model = "model necunoscut";
        year = 0;
        color = null;
        price = 0;
        weight = 0;
        engineCycles = 0;
        photo = new ImageIcon();
    }



    Drone(int id, String brand, String model, int year, Color color, int price, int weight, int engineCycles, /*Engine engine;*/ ImageIcon photo) 
    {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.color = color;
        this.price = price;
        this.weight = weight;
        this.engineCycles = engineCycles;
        this.photo=new ImageIcon(photo.getImage());
    }

    @Override
    public String toString() 
    {
        return "Id: "+id+" Brand: "+" Model:"+model+" An de fabricatie: "+year+" Culoare: "+color+" Pret: "+price+" Greutate: "+weight+" kg "+" Cicluri Motor : "+engineCycles+" Motor: " ;/*se adauga Engine*/ 
    }
    
    
    public int getId() { return id; }
    public void setId(int id) { this.id = id; } 
    public String getBrand() { return brand; } 
    public void setBrand(String brand) { this.brand = brand; } 
    public String getModel() { return model; } 
    public void setModel(String model) { this.model = model; } 
    public int getYear() { return year; } 
    public void setYear(int year) { this.year = year; } 
    public Color getColor() { return color; } 
    public void setColor(Color color) { this.color = color; } 
    public int getPrice() { return price; } 
    public void setPrice(int price) { this.price = price; } 
    public int getWeight() { return weight; } 
    public void setWeight(int weight) { this.weight = weight; } 
    public int getEngineCycles() { return engineCycles; } 
    public void setEngineCycles(int engineCycles) { this.engineCycles = engineCycles; }
            /*se adauga Engine*/ 
}
