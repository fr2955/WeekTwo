package com.frankricker.move;

import java.util.Scanner;

public class Movie {
    //Variables
    private String name;
    private Boolean festival;
    private int age;
    private int time;
    private double price;
    private double total;


    //Constructor with Input
    public Movie(String name, Boolean festival, int age, int time){
        this.name = name;
        this.festival = festival;
        this.age = age;
        this.time = time;
    }
    //Constructer with Name
    public Movie(String name){
        this.name = name;
    }
    //No args Constructor
    public Movie(){

    }
    public void genTicket(){
        String booCon;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Movie Name: ");
        this.name = scanner.next();
        System.out.print("Is this part of a festival? ");
        booCon = scanner.next();


        if(booCon.trim().toLowerCase().startsWith("n") == true) {
            this.festival = Boolean.FALSE;
        }
        else if(booCon.trim().toLowerCase().startsWith("y") == true) {
            this.festival = Boolean.TRUE;
        }
        else{
            System.out.print("Error!");
            System.exit(2);
        }
        System.out.print("Enter the viewers age: ");
        this.age = scanner.nextInt();

        System.out.print("Enter the viewing time: (24Hr)");
        this.time = scanner.nextInt();
        this.setPrice();
        this.total = this.total + this.getPrice();

        if(this.festival)
            System.out.printf("The Festival ticket for " + this.name + " at %4d will cost for a person %3d " + ConsoleColors.GREEN + "$%2.2f \n" + ConsoleColors.RESET,this.time, this.age, this.getPrice());
        else
            System.out.printf("The Non-Festival ticket for " + this.name + " at %4d will cost for a person %3d " + ConsoleColors.GREEN + "$%2.2f \n" + ConsoleColors.RESET,this.time, this.age, this.getPrice());
        System.out.printf("Your total will be" + ConsoleColors.GREEN + " $%4.2f\n\n" + ConsoleColors.RESET, this.total);

    }
    //variable set / get statments
    public double getPrice() {
        return this.price;
    }

    public void setPrice() {

        if(this.festival)
            this.price = 15;
        else if(this.age <= 12)
            this.price = 10;
        else if(time >= 1800) {
            this.price = 18;
            if (this.age >= 60)
                this.price = this.price - (this.price * .1);
        }else{
        this.price = 12;
            if (this.age >= 60)
                this.price = this.price - (this.price * .1);

    }}

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setFestival(Boolean festival) {
        this.festival = festival;
    }

    public Boolean getFestival() {
        return festival;
    }

    public int getTime() {
        return time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTime(int time) {
        this.time = time;
    }
    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {


        this.total = total;

        int[] temperature = new int[7];
        temperature[0] = 5;
        
    }

}
