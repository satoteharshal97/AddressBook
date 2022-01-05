package com.example.addressbook;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {

    ArrayList<Person> phoneBook = new ArrayList<>();

    public static void main(String[] args) {
        AddressBook addressBook = new AddressBook();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Address book");
        int i = 0;
        while (i == 0) {
            System.out.println("\n*------------Menu------------*");
            System.out.println("1.Add Contact\n" + "2.Exit Loop\n");
            System.out.println("*----------------------------*");
            System.out.print("Choose option:");
            int option = Integer.parseInt(scanner.nextLine());
            switch (option) {
                case 1:
                    addressBook.addContact();
                    break;

                case 2:
                    i = 1;
                    break;
                default:
                    System.out.println("Compile again!");
            }
        }

    }

    public void addContact() {
        Person person = new Person();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter following contact credentials:");
        System.out.println("Enter first name:");
        person.setFirstName(scanner.nextLine());
        System.out.println("Enter last name:");
        person.setLastName(scanner.nextLine());
        System.out.println("Enter email address:");
        person.setEmailId(scanner.nextLine());
        System.out.println("Enter phone number:");
        person.setPhoneNumber(Long.parseLong(scanner.nextLine()));
        System.out.println("Enter state:");
        person.setState(scanner.nextLine());
        System.out.println("Enter city:");
        person.setCity(scanner.nextLine());
        System.out.println("Enter zip code:");
        person.setZipcode(Long.parseLong(scanner.nextLine()));
        phoneBook.add(person);
    }

}


