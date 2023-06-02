package com.example.evaluacion.servicio;

import com.example.evaluacion.entidad.cliente;
import com.example.evaluacion.repositorio.repositoriocliente;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class serviciocliente {



    private repositoriocliente repo;

    public serviciocliente(repositoriocliente repo) {
        this.repo = repo;
    }

    public ArrayList<cliente> listarcliente(){

        return (ArrayList<cliente>) repo.findAll();
    }

    public cliente buscarcliente(String id){

        if (repo.findById(id).isPresent()){
            return repo.findById(id).get();
        }else {
            return null;
        }
    }


    public String agregarcliente(cliente entEstu){

        if (repo.findById(entEstu.getId_cliente()).isPresent()){
            return "El ventas ya se encuentra registrado";
        }else {
            repo.save(entEstu);
            return "El ventas se registro correctamente";
        }
    }

    public String actualizarcliente(cliente entEst){

        if (repo.findById(entEst.getId_cliente()).isPresent()){
            repo.save(entEst);
            return "El ventas se actualizo correctamente";
        }else {
            return "El ventas no se encuentra registrado";
        }
    }

    public String eliminarcliente(String documento){

        if (repo.findById(documento).isPresent()){
            repo.deleteById(documento);
            return "El ventas fue eliminado con exito";
        }else {
            return "ventas ya eliminado o no existe";
        }
    }


}
