package com.company.repositories.interfaces;

import com.company.entities.Membership;

import java.util.ArrayList;

public interface IMembershipRepository {
    ArrayList<Membership> showMemberships();
    boolean addMembership(Membership membership);
    boolean deleteMembership(int id);
    Membership getMembership(int id);
}