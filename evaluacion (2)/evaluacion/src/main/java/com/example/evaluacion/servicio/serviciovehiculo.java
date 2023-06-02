package com.example.evaluacion.servicio;

import com.example.evaluacion.entidad.vehiculo;
import com.example.evaluacion.repositorio.repositoriovehiculo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
@Service
public class serviciovehiculo {






    private repositoriovehiculo repo;

    public serviciovehiculo(repositoriovehiculo repo) {
        this.repo = repo;
    }

    public ArrayList<vehiculo> listarvehiculo(){

        return (ArrayList<vehiculo>) repo.findAll();
    }

    public vehiculo buscarvehiculo(String id){

        if (repo.findById(id).isPresent()){
            return repo.findById(id).get();
        }else {
            return null;
        }
    }


    public String agregarvehiculo(vehiculo entEstu){

        if (repo.findById(entEstu.getCodigo_veiculo()).isPresent()){
            return "El ventas ya se encuentra registrado";
        }else {
            repo.save(entEstu);
            return "El ventas se registro correctamente";
        }
    }

    public String actualizarvehiculo(vehiculo entEst){

        if (repo.findById(entEst.getCodigo_veiculo()).isPresent()){
            repo.save(entEst);
            return "El ventas se actualizo correctamente";
        }else {
            return "El ventas no se encuentra registrado";
        }
    }

    public String eliminarvehiculo(String documento){

        if (repo.findById(documento).isPresent()){
            repo.deleteById(documento);
            return "El ventas fue eliminado con exito";
        }else {
            return "ventas ya eliminado o no existe";
        }
    }


}
