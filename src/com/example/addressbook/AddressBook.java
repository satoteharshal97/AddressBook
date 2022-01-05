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
            System.out.println("1.Add Contact\n" + "2.Edit Contact\n" + "3.Remove Contact\n"+
                    "4.Exit Loop\n");
            System.out.println("*----------------------------*");
            System.out.print("Choose option:");
            int option = Integer.parseInt(scanner.nextLine());
            switch (option) {
                case 1:
                    addressBook.addContact();
                    break;
                case 2:
                    addressBook.editContact();
                    break;
                case 3:
                    addressBook.removeContact();
                    break;
                case 4:
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
    public void editContact() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the contact firstName to edit: ");
        String name = scanner.nextLine();
        for (Person person : phoneBook) {

            if (name.equalsIgnoreCase(person.getFirstName())) {
                System.out.println("Which field you want to edit:");
                System.out.println("1.First Name\n" + "2.Last Name\n" + "3.Email address\n" +
                        "4.Phone Number\n" + "5.City\n" + "6.Zip Code\n" + "7.State\n" + "8.Exit Loop\n");
                int field = Integer.parseInt(scanner.nextLine());
                switch (field) {
                    case 1:
                        System.out.println("Enter first name:");
                        person.setFirstName(scanner.nextLine());
                        break;
                    case 2:
                        System.out.println("Enter last name:");
                        person.setLastName(scanner.nextLine());
                        break;
                    case 3:
                        System.out.println("Enter email address:");
                        person.setEmailId(scanner.nextLine());
                        break;
                    case 4:
                        System.out.println("Enter phone number:");
                        person.setPhoneNumber(Long.parseLong(scanner.nextLine()));
                        break;
                    case 5:
                        System.out.println("Enter city:");
                        person.setCity(scanner.nextLine());
                        break;
                    case 6:
                        System.out.println("Enter zip code:");
                        person.setZipcode(Long.parseLong(scanner.nextLine()));
                        break;
                    case 7:
                        System.out.println("Enter state:");
                        person.setState(scanner.nextLine());
                        break;
                    case 8:
                        System.exit(0);
                        break;

                }
            }
        }
    }
    public void removeContact() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the contact firstName to remove: ");
        String fName = scanner.nextLine();
        phoneBook.removeIf(person -> person.getFirstName().equalsIgnoreCase(fName));
        System.out.println("Succesfully Deleted!");
    }
}


