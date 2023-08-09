package com.assignment;

import java.util.Scanner;

public class Submit {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Please input your weight : ");
            int weight = sc.nextInt();
            System.out.print("Please input your height : ");
            double height = sc.nextDouble();
            double BMI = weight / (height*height);
            // Weight is in Kg while height is in meter.

            if (BMI >= 25.0) {
                System.out.println("your BMI is " + String.format("%.01f",BMI) + " and you are OVERWEIGHT");
            } else if ((BMI >= 18.5 && BMI <= 24.9)) {
                System.out.println("your BMI is " + String.format("%.01f",BMI) + " and you are 'NORMAL'");
            }
            else
                System.out.println("your BMI is " + String.format("%.01f",BMI) + " and you are 'UNDERWEIGHT'");
        }
    }


