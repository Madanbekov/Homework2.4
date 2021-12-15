package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        ArrayList<String> SpisokA = new ArrayList<>();
        ArrayList<String> SpisokB = new ArrayList<>();
        ArrayList<String> SpisokC = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("SpisokA :");
        for (int i = 0; i <5 ; i++) {
            SpisokA.add(scanner.nextLine());


        }
        System.out.println(SpisokA);

        System.out.println("Spisok B :");
        for (int i = 0; i < 5; i++) {
            SpisokB.add(scanner.nextLine());

        }
        System.out.println(SpisokB);
        System.out.println("--------------------");

        Collections.reverse(SpisokB);
        int x = 0;
        while (SpisokC.size() < SpisokA.size() + SpisokB.size()){
            SpisokC.add(SpisokA.get(x));
            SpisokC.add(SpisokB.get(x));
            x++;
        }
        System.out.println(SpisokC);
        System.out.println("-----------------------");


        Collections.sort(SpisokC, Comparator.comparingInt(String::length));
        System.out.println(SpisokC);
    }
}