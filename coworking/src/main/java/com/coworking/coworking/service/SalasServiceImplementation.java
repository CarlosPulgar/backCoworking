package com.coworking.coworking.service;


import com.coworking.coworking.model.Salas;
import com.coworking.coworking.repository.SalasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SalasServiceImplementation implements SalasService {

    @Autowired
    private SalasRepository salasRepository;
    @Override
    public Salas saveSalas(Salas salas){
        return  salasRepository.save(salas);
    }

    @Override
    public List<Salas> getAllSalas() {
        return salasRepository.findAll();
    }
}
