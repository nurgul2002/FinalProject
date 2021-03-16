package com.company.repositories;

import com.company.data.interfaces.IDBManager;
import com.company.entities.Bill;
import com.company.repositories.interfaces.IBillRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class BillRepository implements IBillRepository {
    private final IDBManager dbManager;

    public BillRepository(IDBManager dbManager) {
        this.dbManager = dbManager;
    }

    @Override
    public boolean addBill(Bill bill) {
        try{
            Connection connection = null;
            connection = dbManager.getConnection();
            String sql = "INSERT INTO Bill(client_id, Membership_id, month, price) VALUES (?,?,?,?)";
            PreparedStatement stat = connection.prepareStatement(sql);
            stat.setInt(1, bill.getClient_id());
            stat.setInt(2, bill.getMembership_id());
            stat.setString(3, bill.getMonth());
            stat.setDouble(4, bill.getPrice());
            stat.executeUpdate();
            connection.close();
        } catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }
}
