package com.company.controllers;

import com.company.entities.Bill;
import com.company.repositories.interfaces.IBillRepository;

public class BillController {
    private final IBillRepository iBillRepository;

    public BillController(IBillRepository iBillRepository) {
        this.iBillRepository = iBillRepository;
    }

    public String addBill(int client_id, int Membership_id, String month, double price){
        boolean added = iBillRepository.addBill(new Bill(client_id, Membership_id, month, price));

        if (added) return "Bill was added!";
        return "Bill was not added!";

    }
}