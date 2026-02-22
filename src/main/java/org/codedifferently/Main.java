package masonbrown;

import java.util.Scanner;

public class MasonBrownCoffeeShopApp {

    public static void main(String[] args) {

        MasonBrownCoffeeShopSystem system =
                new MasonBrownCoffeeShopSystem();

        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n=== Coffee Shop Pickup System ===");
            System.out.println("1. Add Customer");
            System.out.println("2. View Customers");
            System.out.println("3. Check In Customer");
            System.out.println("4. Schedule Pickup");
            System.out.println("5. View Schedule");
            System.out.println("6. Complete Order");
            System.out.println("7. Daily Summary");
            System.out.println("0. Exit");
            System.out.print("Choose an option: ");

            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();

                    System.out.print("Enter phone number: ");
                    String phone = scanner.nextLine();

                    system.addCustomer(name, phone);
                    break;

                case 2:
                    system.viewAllCustomers();
                    break;

                case 3:
                    System.out.print("Enter Customer ID: ");
                    int checkId = scanner.nextInt();
                    scanner.nextLine();
                    system.checkInCustomer(checkId);
                    break;

                case 4:
                    System.out.print("Enter Customer ID: ");
                    int custId = scanner.nextInt();
                    System.out.print("Enter Pickup Slot (0-7): ");
                    int slot = scanner.nextInt();
                    scanner.nextLine();
                    system.scheduleOrder(custId, slot);
                    break;

                case 5:
                    system.viewSchedule();
                    break;

                case 6:
                    System.out.print("Enter Order ID: ");
                    int orderId = scanner.nextInt();
                    scanner.nextLine();
                    system.completeOrder(orderId);
                    break;

                case 7:
                    system.dailySummary();
                    break;

                case 0:
                    System.out.println("Exiting system...");
                    break;

                default:
                    System.out.println("Invalid option.");
            }

        } while (choice != 0);

        scanner.close();
    }
}

