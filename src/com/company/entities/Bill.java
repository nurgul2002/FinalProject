package com.company.entities;

public class Bill {
    private int client_id;
    private int Membership_id;
    private String month;
    private double price;

    public Bill() {
    }

    public Bill(int client_id, int Membership_id, String month, double price) {
        this.client_id = client_id;
        this.Membership_id = Membership_id;
        this.month = month;
        this.price = price;
    }

    public int getClient_id() {
        return client_id;
    }

    public void setClient_id(int client_id) {
        this.client_id = client_id;
    }

    public int getMembership_id() {
        return Membership_id;
    }

    public void setMembership_id(int Membership_id) {
        Membership_id = Membership_id;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String name) {
        this.month = month;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }



    @Override
    public String toString() {
        return "Bill{" +
                "client_id='" + client_id + '\'' +
                ", Membership_id=" + Membership_id +
                ", month=" + month +
                ", price=" + price +
                '}';
    }
}