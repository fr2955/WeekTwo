package com.frankricker.move;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Boolean run = Boolean.TRUE;
        String booCon;
        Scanner scanner = new Scanner(System.in);
        Movie movie = new Movie();
            do{
                movie.genTicket();
                System.out.print("Would You Like to generate another ticket? ");
                booCon = scanner.next();
                if(booCon.trim().toLowerCase().startsWith("f") ||booCon.trim().toLowerCase().startsWith("n")) {
                    run = Boolean.FALSE;
                }
                else if(booCon.trim().toLowerCase().startsWith("t") || booCon.trim().toLowerCase().startsWith("y")) {
                    run = Boolean.TRUE;
                }
                else{
                    System.out.print("Error!");
                    System.exit(2);
                }
            }while(run);
        }
}
