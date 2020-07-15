package com.frankricker.move;

public class Movie {
    //Variables
    private String name;
    private Boolean festival;
    private int age;
    private int time;
    private int price;
    private int total;


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
    //variable set / get statments
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {

        if(this.festival)



        this.price = price;
    }

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
    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        

        this.total = total;
    }

}
