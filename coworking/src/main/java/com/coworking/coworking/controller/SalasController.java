package com.coworking.coworking.controller;

import com.coworking.coworking.model.Salas;
import com.coworking.coworking.service.SalasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/salas")
@CrossOrigin
public class SalasController {
    @Autowired
    private SalasService salasService;

    @PostMapping("/add")
    public String add(@RequestBody Salas salas){
        salasService.saveSalas(salas);
        return "new Sala is added";
    }

    @GetMapping("/getAll")
    public List<Salas> getAllSalas(){
        return salasService.getAllSalas();
    }
}
