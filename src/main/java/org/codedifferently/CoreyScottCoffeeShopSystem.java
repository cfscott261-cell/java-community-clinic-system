package org.codedifferently;
import java.util.ArrayList;

public class CoreyScottCoffeeShopSystem {

    private ArrayList<CoreyScottOrder> orders;
    private ArrayList<Main> waitlist;
    private String[] pickupSlots;

    public CoreyScottCoffeeShopSystem() {
        orders = new ArrayList<>();
        waitlist = new ArrayList<>();

        pickupSlots = new String[]{
                "8am", "9am", "10am", "11am", "12pm", "2pm"

        };

        public void scheduleOrder(Main customer, int slot) {

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

            orders.add(new CoreyScottOrder(customer, slot));
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
        public void cancelOrder(int slot) {

            for (int i = 0; i < orders.size(); i++) {

                if (orders.get(i).getPickupSlot() == slot) {

                    if (orders.get(i).isCompleted()) {
                        System.out.println("Cannot cancel completed order!");
                        return;
                    }

                    orders.remove(i);
                    System.out.println("Order canceled.");

                    if (!waitlist.isEmpty()) {
                        CoreyScottCustomer next = waitlist.remove(0);
                        orders.add(new CoreyScottOrder(next, slot));
                        System.out.println("Waitlist order scheduled!");
                    }

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



}
