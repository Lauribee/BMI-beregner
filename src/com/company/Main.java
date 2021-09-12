package com.company;

import java.util.Scanner;

public class Main {

        public static void main(String[] args) {
            //velkomst
            System.out.print("Velkommen til BMI-beregneren :)");

            //variabler
            int userWeight;
            double userHeight;
            double bmi;
            //user imput
            Scanner in = new Scanner(System.in);
            System.out.print("\nIndtast venligst din vægt i kg. ");
            userWeight = in.nextInt();
            System.out.print("\nIndtast nu også din højde.");
            userHeight = in.nextDouble();
            userHeight = userHeight / 100;
            bmi = userWeight / (userHeight * userHeight);
            System.out.print("\nDin BMI blev beregnet til ");
            System.out.print(bmi);


    }
}
