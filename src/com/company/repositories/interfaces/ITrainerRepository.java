package com.company.repositories.interfaces;

import com.company.entities.Trainer;
import java.util.ArrayList;

public interface ITrainerRepository {
    ArrayList<Trainer> showTrainer();
    ArrayList<Trainer> getTrainerId(int id);
}