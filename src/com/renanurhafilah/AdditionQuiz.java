package com.renanurhafilah;

import java.util.Scanner;

public class AdditionQuiz {
    public static void main(String[] args) {

        double timeNow = System.currentTimeMillis();
        System.out.println("Waktu sekarang adalah " + timeNow + " milisecond");

        int number1 = (int) (System.currentTimeMillis() % 7);
        System.out.println(number1);
        int number2 = (int) (System.currentTimeMillis() / 5 % 8);
        System.out.println(number2);

        // Create a Scanner
        Scanner input = new Scanner(System.in);

        System.out.print("What is " + number1 + " + " + number2 + "?");

        int answer = input.nextInt();

        System.out.println(number1 + " + " + number2 + " = " +
                answer + " is " + (number1 + number2 == answer));


    }
}
