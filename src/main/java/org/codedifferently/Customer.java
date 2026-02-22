package org.codedifferently;

public class Customer {

    private static int nextId = 1;

    private int id;
    private String name;
    private boolean checkedIn;

    public Customer(String name) {
        this.id = nextId++;
        this.name = name;
        this.checkedIn = false;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public boolean isCheckedIn() {
        return checkedIn;
    }

    public void checkIn() {
        checkedIn = true;
    }

    @Override
    public String toString() {
        String status = checkedIn ? "Checked In" : "Not Checked In";
        return "ID: " + id + " | Name: " + name + " | " + status;
    }
}