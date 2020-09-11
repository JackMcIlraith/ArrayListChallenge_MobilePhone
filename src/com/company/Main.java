package com.company;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone newPhone = new MobilePhone();

    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;

        printInstructions();
        while (!quit) {
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    newPhone.printContacts();
                    break;
                case 2:
                    addContactToPhone();
                    break;
                case 3:
                    //modifyItem();
                    break;
                case 4:
                    //removeItem();
                    break;
                case 5:
                    searchContactorNumber();
                    break;
                case 6:
                    //processArrayList();
                case 7:
                    quit = true;
                    break;

            }
        }
    }


        public static void printInstructions() {
            System.out.println("\nPress ");
            System.out.println("\t 0 - To print choice options.");
            System.out.println("\t 1 - To print all contacts.");
            System.out.println("\t 2 - To add a contact.");
            System.out.println("\t 3 - To modify an existing contact.");
            System.out.println("\t 4 - To remove a contact.");
            System.out.println("\t 5 - To search for a contact.");
            System.out.println("\t 6 - To quit the application.");
        }

        public static void addContactToPhone(){
            System.out.print("Please a Name:");
            String name = scanner.nextLine();
            System.out.println("Please enter a number for " + name);
            String number =  scanner.nextLine();
            newPhone.addContact(name, number);
            System.out.println("Contact: " + name + " has been added");
            printInstructions();
        }

        public static void searchContactorNumber(){
            System.out.print("Please enter a name or number to find:");
            String search = scanner.nextLine();
            int position = newPhone.findContact(search);
            System.out.println(search + " was found in contact number: " + position);
            printInstructions();

        }











    }

