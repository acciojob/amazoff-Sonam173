package com.driver;

public class Order {

    private String id;
    private String deliveryTime;

    public Order(String id, String deliveryTime) {

        // The deliveryTime has to converted from string to int and then stored in the attribute
        //deliveryTime  = HH*60 + MM
       // this.id = id;
       // String[] time = deliveryTime.split(":");
       // int hours = Integer.parseInt(time[0]);
        //int minutes = Integer.parseInt(time[1]);
       // this.deliveryTime = hours * 60 + minutes;
        this.id = id;
        this.deliveryTime = String.valueOf(Integer.parseInt(deliveryTime));
    }

    public String getId() {
        return id;
    }

    public int getDeliveryTime() {return Integer.parseInt(deliveryTime);}
}
