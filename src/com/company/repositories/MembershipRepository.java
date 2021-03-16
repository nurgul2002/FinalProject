package com.company.repositories;

import com.company.data.interfaces.IDBManager;
import com.company.entities.Membership;
import com.company.repositories.interfaces.IMembershipRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;



public class MembershipRepository implements IMembershipRepository {
    private final IDBManager dbManager;

    public MembershipRepository(IDBManager dbManager) {
        this.dbManager = dbManager;
    }

    @Override
    public ArrayList<Membership> showMemberships() {
        return null;
    }

    @Override
    public boolean addMembership(Membership membership) {
        try{
            Connection connection = null;
            connection = dbManager.getConnection();
            String sql = "INSERT INTO memberships(id, definition, price, RoomId) VALUES (?,?,?,?)";
            PreparedStatement stat = connection.prepareStatement(sql);
            stat.setInt(1, membership.getId());
            stat.setString(2, membership.getDefinition());
            stat.setDouble(3, membership.getPrice());
            stat.setInt(4, membership.getRoomId());
            stat.executeUpdate();
            connection.close();
        } catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean deleteMembership(int id) {
        return false;
    }

    @Override
    public Membership getMembership(int id) {
        return null;
    }
}