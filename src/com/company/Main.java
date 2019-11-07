package com.company;

public class Main {

    public static void main(String[] args) {
	System.out.println("Hello kacke");

	for (int i = 0; i <= 100; i++){
        System.out.println("ergebnis: " + sum(i, (i-1)));
    }
    }


    private static int sum (int a, int b) {
        return a+b;
    }
}
