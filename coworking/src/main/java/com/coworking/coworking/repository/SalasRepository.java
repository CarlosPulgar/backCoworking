package com.coworking.coworking.repository;

import com.coworking.coworking.model.Salas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface SalasRepository extends JpaRepository<Salas,Integer> {
}
