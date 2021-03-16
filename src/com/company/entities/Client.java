package com.company.entities;

public class Client {
    private int id;
    private String name;
    private String surname;
    private String phone_number;
    private int TrainerId;

    public Client(String name, String surname, String phone_number) {
    }

    public Client(int id, String name, String surname, String phone_number, int TrainerId) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.phone_number = phone_number;
        this.TrainerId = TrainerId;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String Phone_number) {
        phone_number = phone_number;
    }

    public int getTrainerId() {
        return TrainerId;
    }

    public void setTrainerId(int id) {
        this.TrainerId = TrainerId;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", phone_number='" + phone_number + '\'' +
                ", TrainerId='" + TrainerId + '\'' +
                '}';
    }
}