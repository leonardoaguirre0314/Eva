package com.example.evaluacion.servicio;

import com.example.evaluacion.entidad.consecionarios;
import com.example.evaluacion.repositorio.repositorioconsecionario;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
@Service
public class servicioconsecionario {

    private repositorioconsecionario repo;

    public servicioconsecionario(repositorioconsecionario repo) {
        this.repo = repo;
    }

    public ArrayList<consecionarios> listarconse(){

        return (ArrayList<consecionarios>) repo.findAll();
    }

    public consecionarios buscarconse(String id){

        if (repo.findById(id).isPresent()){
            return repo.findById(id).get();
        }else {
            return null;
        }
    }


    public String agregarconse(consecionarios entEstu){

        if (repo.findById(entEstu.getNit()).isPresent()){
            return "El ventas ya se encuentra registrado";
        }else {
            repo.save(entEstu);
            return "El ventas se registro correctamente";
        }
    }

    public String actualizarconse(consecionarios entEst){

        if (repo.findById(entEst.getNit()).isPresent()){
            repo.save(entEst);
            return "El ventas se actualizo correctamente";
        }else {
            return "El ventas no se encuentra registrado";
        }
    }

    public String eliminarconce(String documento){

        if (repo.findById(documento).isPresent()){
            repo.deleteById(documento);
            return "El ventas fue eliminado con exito";
        }else {
            return "ventas ya eliminado o no existe";
        }
    }


}
