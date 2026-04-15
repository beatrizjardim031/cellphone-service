package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        CellPhone cellPhone1 = new CellPhone();
        CellPhone cellPhone2 = new CellPhone();


        System.out.print("What is the serial number?: ");
        cellPhone1.setSerialNumber(input.nextLong());
        input.nextLine();

        System.out.print("What model is the phone?: ");
        cellPhone1.setModel(input.nextLine());

        System.out.print("Who is the carrier?: ");
        cellPhone1.setCarrier(input.nextLine());

        System.out.print("What is the phone number?: ");
        cellPhone1.setPhoneNumber(input.nextLine());

        System.out.print("Who is the owner of the phone?: ");
        cellPhone1.setOwner(input.nextLine());



        System.out.print("What is the serial number?: ");
        cellPhone2.setSerialNumber(input.nextLong());
        input.nextLine();

        System.out.print("What model is the phone?: ");
        cellPhone2.setModel(input.nextLine());

        System.out.print("Who is the carrier?: ");
        cellPhone2.setCarrier(input.nextLine());

        System.out.print("What is the phone number?: ");
        cellPhone2.setPhoneNumber(input.nextLine());

        System.out.print("Who is the owner of the phone?: ");
        cellPhone2.setOwner(input.nextLine());


        display(cellPhone1);
        display(cellPhone2);
        cellPhone1.dial(cellPhone2.getPhoneNumber());
        cellPhone2.dial(cellPhone1.getPhoneNumber());

        input.close();
    }

    public static void display(CellPhone cellPhone) {
        System.out.println("\nSerial number: " + cellPhone.getSerialNumber());
        System.out.println("Model phone: " + cellPhone.getModel());
        System.out.println("Carrier: " + cellPhone.getCarrier());
        System.out.println("Phone number: " + cellPhone.getPhoneNumber());
        System.out.println("Owner: " + cellPhone.getOwner());
    }


}
