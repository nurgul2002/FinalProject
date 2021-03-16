package com.company.controllers;

import com.company.entities.Membership;
import com.company.repositories.interfaces.IMembershipRepository;

public class MembershipController {
    private final IMembershipRepository iMembershipRepository;

    public MembershipController(IMembershipRepository iMembershipRepository) {
        this.iMembershipRepository = iMembershipRepository;
    }

    public String showMemberships(){
        String result = iMembershipRepository.showMemberships().toString();
        return result;
    }

    public String addMembership(int id, String definition, double price, int RoomId){
        boolean added = iMembershipRepository.addMembership(new Membership(id, definition, price, RoomId));

        if (added) return "Membership was added!";
        return "Membership was not added!";
    }

    public String deleteMembership(int id){
        boolean deleted = iMembershipRepository.deleteMembership(id);

        if (deleted) return "Membership was deleted!";
        return "Membership was not deleted!";

    }

    public String getMembership(int id){
        String result = iMembershipRepository.getMembership(id).toString();
        return result;
    }

}