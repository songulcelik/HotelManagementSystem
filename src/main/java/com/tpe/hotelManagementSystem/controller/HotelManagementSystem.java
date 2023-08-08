package com.tpe.hotelManagementSystem.controller;

import java.util.Scanner;

public class HotelManagementSystem {
   private static Scanner scanner;
    public static void displayMenuHotelManagementSystem(){
        scanner=new Scanner(System.in);
        boolean exit=false;
        while (!exit){
            System.out.println("==== Hotel Management System  Menu ====");
            System.out.println("1. Hotel Operations");
            System.out.println("2. Room Operations");
            System.out.println("3. Guest Operations");
            System.out.println("4. Reservation Operations");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice=scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 1:
                    disPlayHotelOperationsMenu();
                    break;
                case 2:
                    disPlayRoomOperationsMenu();
                    break;
                case 3:
                    disPlayGuestOperationsMenu();
                    break;
                case 4:
                    disPlayReservationOperationsMenu();
                    break;
                case 5:
                    System.out.println("Good bye");
                    exit=true;
                    break;
                default:
                    System.out.println("Invalid choise. Please try again");
                    break;
            }
        }

    }
private static void disPlayHotelOperationsMenu(){
    System.out.println("Hotel Operation Menu");
    System.out.println("==== Hotel Management System  Menu ====");
    System.out.println("1. Hotel Operations");
    System.out.println("2. Room Operations");
    System.out.println("3. Guest Operations");
    System.out.println("4. Reservation Operations");
    System.out.println("5. Exit");
    System.out.print("Enter your choice: ");
}
    private static void disPlayRoomOperationsMenu(){
        System.out.println("Room Operation Menu");
        System.out.println("==== Room Operations ====");
        System.out.println("1. Add a new room");
        System.out.println("2. Find Room By ID");
        System.out.println("3. Delete Room By ID");
        System.out.println("4. Find All Rooms");
        System.out.println("5. Return to Main Menu");
        System.out.print("Enter your choice: ");
    }

    private static void disPlayGuestOperationsMenu(){
        System.out.println("Guest Operation Menu");
        System.out.println("==== Guest Operations ====");
        System.out.println("1. Add a new guest");
        System.out.println("2. Find Guest By ID");
        System.out.println("3. Delete Guest By ID");
        System.out.println("4. Find All Guests");
        System.out.println("5. Return to Main Menu");
        System.out.print("Enter your choice: ");
    }
    private static void disPlayReservationOperationsMenu(){
        System.out.println("Reservation Operation Menu");
        System.out.println("==== Reservation Operations ====");
        System.out.println("1. Add a new reservation");
        System.out.println("2. Find Reservation By ID");
        System.out.println("3. Find All Reservations");
        System.out.println("4. Delete Reservation By ID");
        System.out.println("5. Return to Main Menu");
        System.out.print("Enter your choice: ");
    }



}
