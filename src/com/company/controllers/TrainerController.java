package com.company.controllers;

import com.company.entities.Trainer;
import com.company.repositories.interfaces.ITrainerRepository;

import java.util.ArrayList;

public class TrainerController {
    private final ITrainerRepository iTrainerRepository;

    public TrainerController(ITrainerRepository iTrainerRepository) {

        this.iTrainerRepository = iTrainerRepository;
    }

    public String showTrainer(){
        String result = iTrainerRepository.showTrainer().toString();
        return result;
    }

    public String getTrainerId(int id){
        String result = iTrainerRepository.getTrainerId(id).toString();
        return result;
    }
    public ArrayList<Trainer> getTrainer(int id){
        ArrayList<Trainer> trainer = iTrainerRepository.getTrainerId(id);
        return trainer;
    }
}