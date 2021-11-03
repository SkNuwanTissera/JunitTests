package com.company;

import java.util.Scanner;

public class CheckNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the DIN: ");
        String dinNumber = sc.nextLine();

        // Performing some checks
        if(dinNumber.startsWith("G") && dinNumber.endsWith("3") && dinNumber.length() == 19) {
            System.out.println("Your DIN is valid");
            String first3Digits = dinNumber.substring(2,5);
            System.out.println(first3Digits);
            String facilityType = "null";
            switch (first3Digits) {
                case "312" : facilityType = "Colombo"; break;
                case "415" : facilityType = "Kandy"; break;
                case "796" : facilityType = "Jaffna"; break;
            }
            System.out.println("Your blood donation facilityType is " +facilityType);
        } else {
            System.out.println("Invalid DIN number");
        }
    }
}
