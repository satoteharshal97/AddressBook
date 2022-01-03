package com.example.addressbook;

import java.util.Scanner;

public class AddressBook {

    public static void main(String[] args) {

        System.out.println("Welcome to address book system");
        AddressBook createContact = new AddressBook();
        System.out.println("Enter  following credentials to create contact in address book:");
        createContact.createContact();
    }
    public void createContact(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first name: ");
        String firstName = scanner.nextLine();
        System.out.println("Enter last name: ");
        String lastName = scanner.nextLine();
        System.out.println("Enter address : ");
        String address = scanner.nextLine();
        System.out.println("Enter city name: ");
        String city = scanner.nextLine();
        System.out.println("Enter state name: ");
        String state = scanner.nextLine();
        System.out.println("Enter zip code: ");
        long zipcode = scanner.nextLong();
        System.out.println("Enter phone number: ");
        long phoneNumber = scanner.nextLong();
        System.out.println("Enter email  address : ");
        String emailAddress = scanner.next();
    }

}
