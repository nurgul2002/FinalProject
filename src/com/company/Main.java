package com.company;

import com.company.controllers.*;
import com.company.data.DBManager;
import com.company.data.interfaces.IDBManager;
import com.company.repositories.*;
import com.company.repositories.interfaces.*;

public class Main {

    public static void main(String[] args) {
        IDBManager dbManager = new DBManager();

        IMembershipRepository membershipRepository = new MembershipRepository(dbManager);
        MembershipController membershipController = new MembershipController(membershipRepository);

        IBillRepository billRepository = new BillRepository(dbManager);
        BillController billController = new BillController(billRepository);

        IClientRepository clientRepository = new ClientRepository(dbManager);
        ClientController clientController = new ClientController(clientRepository);

        ITrainerRepository TrainerRepository = new TrainerRepository(dbManager);
        TrainerController trainerController = new TrainerController(TrainerRepository);

        System.out.println("Welcome to the Fitness center!");
        System.out.println(trainerController.showTrainer());

        Start start = new Start(trainerController, membershipController, billController, clientController);
        start.start();

    }
}