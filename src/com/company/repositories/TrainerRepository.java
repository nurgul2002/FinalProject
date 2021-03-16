package com.company.repositories;

import com.company.data.interfaces.IDBManager;
import com.company.entities.Trainer;
import com.company.repositories.interfaces.ITrainerRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class TrainerRepository implements ITrainerRepository {
    private final IDBManager dbManager;


    public TrainerRepository(IDBManager dbManager) {
        this.dbManager = dbManager;
    }
    @Override
    public ArrayList<Trainer> showTrainer() {
        try{
            Connection connection = null;
            connection = dbManager.getConnection();
            String sql = "SELECT * FROM Trainer";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            ArrayList<Trainer> list = new ArrayList<Trainer>();

            while(resultSet.next()){
                Trainer trainer = new Trainer(resultSet.getInt("id"),
                        resultSet.getString("fullname"),
                        resultSet.getInt("salary"));
                list.add(trainer);
            }
            return list;

        } catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public ArrayList<Trainer> getTrainerId(int id) {
        try{
            Connection connection = null;
            connection = dbManager.getConnection();
            String sql = "SELECT * FROM Trainer WHERE id = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            ArrayList<Trainer> list = new ArrayList<Trainer>();

            while(resultSet.next()){
                Trainer trainer = new Trainer(resultSet.getInt("id"),
                        resultSet.getString("fullname"),
                        resultSet.getInt("salary"));
                list.add(trainer);
            }
            return list;

        } catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}