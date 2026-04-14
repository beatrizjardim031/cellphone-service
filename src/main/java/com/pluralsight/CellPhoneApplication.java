package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {
        CellPhone cellPhone = new CellPhone();

        Scanner input = new Scanner(System.in);

        System.out.print("What is the serial number?: ");
        cellPhone.setSerialNumber(input.nextLong());
        input.nextLine();

        System.out.print("What model is the phone?: ");
        cellPhone.setModel(input.nextLine());

        System.out.print("Who is the carrier?: ");
        cellPhone.setCarrier(input.nextLine());

        System.out.print("What is the phone number?: ");
        cellPhone.setPhoneNumber(input.nextLine());

        System.out.print("Who is the owner of the phone?: ");
        cellPhone.setOwner(input.nextLine());

        System.out.println("\nSerial number: " + cellPhone.getSerialNumber());
        System.out.println("Model phone: " + cellPhone.getModel());
        System.out.println("Carrier: " + cellPhone.getCarrier());
        System.out.println("Phone number: " + cellPhone.getPhoneNumber());
        System.out.println("Owner: " + cellPhone.getOwner());

        input.close();
    }


}
