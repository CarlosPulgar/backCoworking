package com.coworking.coworking.service;

import com.coworking.coworking.model.Salas;

import java.util.List;

public interface SalasService {
    public Salas saveSalas(Salas salas);
    public List<Salas> getAllSalas();
}
