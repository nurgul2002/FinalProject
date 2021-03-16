package com.company.entities;

public class Membership {
    private int id;
    private String definition;
    private double price;
    private int RoomId;

    public Membership() {
    }

    public Membership(int id, String definition, double price, int RoomId) {
        this.id = id;
        this.definition = definition;
        this.price = price;
        this.RoomId = RoomId;
    }

    public int getId() {

        return id;
    }

    public void setId(int id) {

        this.id = id;
    }

    public String getDefinition() {

        return definition;
    }

    public void setDefinition(String definition) {

        this.definition = definition;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getRoomId() {
        return RoomId;
    }

    public void setRoomId(int RoomId) {
        this.RoomId = RoomId;
    }

    @Override
    public String toString() {
        System.out.println("id: " + id + "\n" +
                "definition: " + definition + "\n" +
                "price: " + price + "\n" +
                "RoomId: " + RoomId + "\n");
        return "";
    }
}