package org.codedifferently;

import java.util.ArrayList;

public class CoreyScottCoffeeShopSystem {

    private ArrayList<CoreyScottOrder> orders;
    private ArrayList<String> waitlist;
    private String[] pickupSlots;

    public CoreyScottCoffeeShopSystem() {
        orders = new ArrayList<>();
        waitlist = new ArrayList<>();

        pickupSlots = new String[]{
                "8am", "9am", "10am", "11am", "12pm", "2pm"
        };
    }

    public void viewSchedule() {
        for (int i = 0; i < pickupSlots.length; i++) {

            boolean booked = false;

            for (CoreyScottOrder order : orders) {
                if (order.getPickupSlot() == i) {
                    System.out.println(pickupSlots[i] + " - " + order);
                    booked = true;
                    break;
                }
            }

            if (!booked) {
                System.out.println(pickupSlots[i] + " - Available");
            }
        }
    }

    public void scheduleOrder(String customer, int slot, String drink) {

        if (slot < 0 || slot >= pickupSlots.length) {
            System.out.println("Invalid slot!");
            return;
        }

        for (CoreyScottOrder order : orders) {
            if (order.getPickupSlot() == slot) {
                System.out.println("Slot full — added to waitlist.");
                waitlist.add(customer);
                return;
            }
        }

        orders.add(new CoreyScottOrder(customer, slot, drink));
        System.out.println("Order scheduled!");
    }

    public void completeOrder(int slot) {

        for (CoreyScottOrder order : orders) {

            if (order.getPickupSlot() == slot) {

                if (order.isCompleted()) {
                    System.out.println("Already completed!");
                    return;
                }

                order.markCompleted();
                System.out.println("Order completed!");
                return;
            }
        }

        System.out.println("No order found.");
    }

    public void dailyReport() {

        int completed = 0;

        for (CoreyScottOrder order : orders) {
            if (order.isCompleted()) {
                completed++;
            }
        }

        System.out.println("\n--- Daily Coffee Shop Report ---");
        System.out.println("Total orders: " + orders.size());
        System.out.println("Completed orders: " + completed);
        System.out.println("Pending orders: " + (orders.size() - completed));
        System.out.println("Waitlist size: " + waitlist.size());
    }
}