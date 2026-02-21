package org.codedifferently;
import java.util.ArrayList;

public class CoreyScottCoffeeShopSystem {

    private ArrayList<CoreyScottOrder> appointments;
    private ArrayList<Main> waitlist;
    private String[] timeSlots;

    public CoreyScottCoffeeShopSystem() {
        appointments = new ArrayList<>();
        waitlist = new ArrayList<>();

        timeSlots = new String[]{
                "8am", "9am", "10am", "11am", "12pm", "2pm", "3pm", "4pm"

        };
    }


}
