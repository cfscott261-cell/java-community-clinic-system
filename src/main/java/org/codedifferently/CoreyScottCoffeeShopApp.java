package org.codedifferently;

import java.util.Scanner;

public class CoreyScottCoffeeShopApp {

    public static void main(String[] args) {

        CoreyScottCoffeeShopSystem system =
                new CoreyScottCoffeeShopSystem();

        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n=== Coffee Shop System ===");
            System.out.println("1. Schedule Order");
            System.out.println("2. View Schedule");
            System.out.println("3. Complete Order");
            System.out.println("4. Daily Report");
            System.out.println("0. Exit");
            System.out.print("Choose: ");

            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Customer name: ");
                    String name = scanner.nextLine();

                    System.out.print("Drink: ");
                    String drink = scanner.nextLine();

                    System.out.print("Slot (0-5): ");
                    int slot = scanner.nextInt();
                    scanner.nextLine();

                    system.scheduleOrder(name, slot, drink);
                    break;

                case 2:
                    system.viewSchedule();
                    break;

                case 3:
                    System.out.print("Slot to complete: ");
                    int completeSlot = scanner.nextInt();
                    scanner.nextLine();

                    system.completeOrder(completeSlot);
                    break;

                case 4:
                    system.dailyReport();
                    break;

                case 0:
                    System.out.println("Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 0);

        scanner.close();
    }
}

