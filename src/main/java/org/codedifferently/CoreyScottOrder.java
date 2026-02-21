package org.codedifferently;

public class CoreyScottOrder {
    private CustomerName customer;
    private int pickupSlot;
    private boolean completed;
    private String drink;

    public CoreyScottOrder(CustomerName, int pickupSlot, String drink) {
        this.customer = customer;
        this.pickupSlot = pickupSlot;
        this.drink = drink;
        this.completed = false;
    }

    public int getPickupSlot() {
        return pickupSlot;
    }

    public String getDrink() {
        return drink;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void markCompleted(){
        completed = true;
    }

    public String toString() {
        String status = completed ? "Order Ready" : "Preparing Order";
        return "Slot: " + pickupSlot + " | " + drink + " for " + customer + " | " + status;
    }
}

