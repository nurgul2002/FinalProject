package com.company.repositories;

import com.company.data.interfaces.IDBManager;
import com.company.entities.Client;
import com.company.repositories.interfaces.IClientRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;

public class ClientRepository implements IClientRepository {

    private final IDBManager dbManager;

    public ClientRepository(IDBManager dbManager) {
        this.dbManager = dbManager;
    }

    @Override
    public boolean addClient(Client client) {
        try{
            Connection connection = null;
            connection = dbManager.getConnection();
            String sql = "INSERT INTO client(id, name, surname, phone_number, TrainerId) VALUES (?,?,?,?,?)";
            PreparedStatement stat = connection.prepareStatement(sql);
            stat.setInt(1, client.getId());
            stat.setString(2, client.getName());
            stat.setString(3, client.getSurname());
            stat.setString(4, client.getPhone_number());
            stat.setInt(5, client.getTrainerId());
            stat.executeUpdate();
            connection.close();
        } catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public ArrayList<Client> showClients() {
        return null;
    }

    @Override
    public Client getClient(int id) {
        return null;
    }
}