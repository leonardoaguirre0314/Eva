package com.example.evaluacion.servicio;

import com.example.evaluacion.entidad.ventas;
import com.example.evaluacion.repositorio.repositorioventas;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class servicioventas {




    private repositorioventas repo;

    public servicioventas(repositorioventas repo) {
        this.repo = repo;
    }

    public ArrayList<ventas> listarventas(){

        return (ArrayList<ventas>) repo.findAll();
    }

    public ventas buscarventas(String id){

        if (repo.findById(id).isPresent()){
            return repo.findById(id).get();
        }else {
            return null;
        }
    }


    public String agregarventas(ventas entEstu){

        if (repo.findById(entEstu.getId_venta()).isPresent()){
            return "El ventas ya se encuentra registrado";
        }else {
            repo.save(entEstu);
            return "El ventas se registro correctamente";
        }
    }

    public String actualizarventas(ventas entEst){

        if (repo.findById(entEst.getId_venta()).isPresent()){
            repo.save(entEst);
            return "El ventas se actualizo correctamente";
        }else {
            return "El ventas no se encuentra registrado";
        }
    }

    public String eliminarventas(String documento){

        if (repo.findById(documento).isPresent()){
            repo.deleteById(documento);
            return "El ventas fue eliminado con exito";
        }else {
            return "ventas ya eliminado o no existe";
        }
    }
}
