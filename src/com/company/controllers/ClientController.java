package com.company.controllers;

import com.company.entities.Client;
import com.company.repositories.interfaces.IClientRepository;

public class ClientController {
    private final IClientRepository iClientRepository;

    public ClientController(IClientRepository iClientRepository) {
        this.iClientRepository = iClientRepository;
    }

    public String addClient(int id, String name, String surname, String phone_number, int TrainerId){
        boolean added = iClientRepository.addClient(new Client(id, name, surname, phone_number, TrainerId));
        if (added) return "Client was added!";
        return "Client was not added!";

    }

    public String showClients(){
        String result = iClientRepository.showClients().toString();
        return result;
    }

    public String getClient(int id){
        String result = iClientRepository.getClient(id).toString();
        return result;

    }

    public void addClient(String name, String surname, String phone_number) {
        boolean added = iClientRepository.addClient(new Client(name, surname, phone_number));
    }
}