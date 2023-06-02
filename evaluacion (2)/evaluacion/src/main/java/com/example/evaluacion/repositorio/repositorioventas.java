package com.example.evaluacion.repositorio;

import com.example.evaluacion.entidad.ventas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface repositorioventas  extends JpaRepository<ventas, String> {

}
