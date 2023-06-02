package com.example.evaluacion.repositorio;

import com.example.evaluacion.entidad.vehiculo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface repositoriovehiculo extends JpaRepository<vehiculo, String> {
}
