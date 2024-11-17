package com.mycompany.mavenproject3;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import javax.swing.ImageIcon;
import java.awt.Color;
/**
 *
 * @author hcosm
 */
public class Scooter {
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

    Scooter() {  //se adauga Engine+ Transmission
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

    Scooter(int id, String brand,String model,int year,Color color,int price,int weight,int mileage/*se adauga Engine+ Transmission*/,ImageIcon photo) 
    {
        this.id = id;
        this.brand=brand;
        this.model=model;
        this.year=year;
        this.color=color;
        this.price=price;
        this.weight=weight;
        this.mileage=mileage;
        //se adauga Engine+ Transmission
        this.photo=new ImageIcon(photo.getImage());//not sure 100%
    }

    Scooter(Scooter copy) { 
        
        
          this.id = copy.id;
        this.brand=copy.brand;
        this.model=copy.model;
        this.year=copy.year;
        this.color=copy.color;
        this.price=copy.price;
        this.weight=copy.weight;
        this.mileage=copy.mileage;
        //se adauga Engine+ Transmission 
        this.photo=new ImageIcon(copy.photo.getImage());//not sure 100%
    }

    @Override
    public String toString() {
        
        return "Id: "+id+" Brand: "+" Model:"+model+" An de fabricatie: "+year+" Culoare: "+color+" Pret: "+price+" Greutate: "+weight+" kg "+" Kilometraj: "+mileage+" Motor: "+"Transmisie" /*se adauga Engine+ Transmission*/ ;
    }
    public int getId() 
    { return id; } 
    public void setId(int id) 
    { this.id = id; }
    
    public String getBrand() 
    { return brand; } 
    public void setBrand(String brand) 
    { this.brand = brand; } 
    
    public String getModel() 
    { return model; } 
    public void setModel(String model) 
    { this.model = model; } 
    
    public int getYear() 
    { return year; } 
    public void setYear(int year)
    { this.year = year; } 
    
    public Color getColor() 
    { return color; } 
    public void setColor(Color color) 
    { this.color = color; }
    
    public int getPrice() 
    { return price; } 
    public void setPrice(int price) 
    { this.price = price; }
    
    public int getWeight() 
    { return weight; } 
    public void setWeight(int weight) 
    { this.weight = weight; }
    
    public double getMileage()
    { return mileage; } 
    public void setMileage(int mileage) 
    { this.mileage = mileage; } 
    
    public ImageIcon getPhoto() 
    { return photo; } 
    public void setPhoto(ImageIcon photo) 
    { this.photo = photo; }

}
