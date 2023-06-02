package com.example.evaluacion.repositorio;

import com.example.evaluacion.entidad.cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface repositoriocliente  extends JpaRepository<cliente, String> {
}
