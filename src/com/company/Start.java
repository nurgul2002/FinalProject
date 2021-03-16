package com.company;

import com.company.controllers.*;
import com.company.entities.Bill;
import com.company.entities.Trainer;

import java.util.ArrayList;
import java.util.Scanner;

public class Start {
    TrainerController trainerController;
    MembershipController membershipController;
    BillController billController;
    ClientController clientController;
    Scanner scan = new Scanner(System.in);
    int memberships;
    double price;
    int clients;
    String name;
    String phone_number;



    public Start(TrainerController trainerController, MembershipController membershipController, BillController billController, ClientController clientController) {
        this.trainerController = trainerController;
        this.membershipController = membershipController;
        this.billController = billController;
        this.clientController = clientController;
        memberships = 1;
        price = 0;
        clients = 1;
        name = "";
        phone_number = "";
    }

    public void addMembership(){
            System.out.println("Enter ID of gym membership. (Enter 0 if you want to confirm gym membership).");
            int Membership_id = scan.nextInt();
        if (Membership_id == 0) {
            System.out.println("The price of this Fitness membership: ");
            System.out.println (price);
        }
    }


    public void addClient(){
        System.out.println("Please enter your name: ");
        String name = scan.next();
        System.out.println("Please enter your surname: ");
        String surname = scan.next();
        System.out.println("Please enter your phone number: ");
        String phone_number = scan.next();
        clientController.addClient(name, surname, phone_number);
    }

}