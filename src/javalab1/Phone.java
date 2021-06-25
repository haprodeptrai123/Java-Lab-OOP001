/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalab1;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Phone implements Comparable<Phone>{
    public String model;
    public String cpu;
    public String ram;
    public String primCam;
    public String screenSize;
    public String color;
    public String brand;
    public int price;

    public Phone() {
    }

    public Phone(String model, String cpu, String ram, String primCam, String screenSize, String color, String brand, int price) {
        this.model = model;
        this.cpu = cpu;
        this.ram = ram;
        this.primCam = primCam;
        this.screenSize = screenSize;
        this.color = color;
        this.brand = brand;
        this.price = price;
    }
    

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getPrimCam() {
        return primCam;
    }

    public void setPrimCam(String primCam) {
        this.primCam = primCam;
    }

    public String getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(String screenSize) {
        this.screenSize = screenSize;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
    @Override
    public int compareTo(Phone o) {
        return this.model.compareTo(o.model);
    }

    @Override
    public String toString() {
        return  model +"\t| "+  cpu+ "\t| " +  ram+" \t|" +  primCam+"      \t| "  + screenSize+"     \t| " + color+"\t| " + brand+"\t| " + price ;
    }
    

    void inputModel() {
        System.out.println("Please input Model:");
        Scanner sc=new Scanner(System.in);
        this.model=sc.nextLine();
        System.out.println("Successfully added");
    }
public void inputPhoneInformation(){
    Scanner sc=new Scanner(System.in);
    System.out.println("Please input CPU: ");
    this.cpu=sc.nextLine();
    System.out.println("Input RAM:");
    this.ram=sc.nextLine();
    System.out.println("Input primary camera:");
    this.primCam=sc.nextLine();
    System.out.println("Input screen size");
    this.screenSize=sc.nextLine();
    System.out.println("Input Color");
    this.color=sc.nextLine();
    System.out.println("Input price");
    this.price=sc.nextInt();
    
}

    
}