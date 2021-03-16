package com.company.repositories.interfaces;

import com.company.entities.Client;
import java.util.ArrayList;

public interface IClientRepository {
    boolean addClient(Client client);
    ArrayList<Client> showClients();
    Client getClient(int id);
}