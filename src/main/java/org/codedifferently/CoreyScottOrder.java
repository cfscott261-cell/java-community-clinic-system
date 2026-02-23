package org.codedifferently;

public class CoreyScottOrder {

    private String customer;
    private int pickupSlot;
    private boolean completed;
    private String drink;

    public CoreyScottOrder(String customer, int pickupSlot, String drink) {
        this.customer = customer;
        this.pickupSlot = pickupSlot;
        this.drink = drink;
        this.completed = false;
    }

    public int getPickupSlot() {
        return pickupSlot;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void markCompleted() {
        completed = true;
    }

    @Override
    public String toString() {
        String status = completed ? "Order Ready" : "Preparing Order";
        return "Slot: " + pickupSlot +
                " | " + drink +
                " for " + customer +
                " | " + status;
    }
}