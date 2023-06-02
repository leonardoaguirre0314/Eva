package com.example.evaluacion.controlador;

import com.example.evaluacion.entidad.ventas;
import com.example.evaluacion.servicio.servicioventas;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
@RestController
public class controladorventas {

    public servicioventas serv_estu;

    public controladorventas(servicioventas serv_estu){
        this.serv_estu = serv_estu;
    }


    @GetMapping("/listarventas")
    public ArrayList<ventas> listarventas(){
        return serv_estu.listarventas();
    }

    @GetMapping("/buscarventas/{doc}")
    public ventas buscarventas(@PathVariable("cod") String cod){
        return serv_estu.buscarventas(cod);
    }

    @PostMapping("/agregarventas")
    public String agregarventas(@RequestBody ventas ven){
        return serv_estu.agregarventas(ven);
    }

    @PutMapping("/actualizarventas")
    public String actualizarventas(ventas ven){
        return serv_estu.actualizarventas(ven);
    }

    @DeleteMapping("/eliminarventas/{cod}")
    public String eliminarventas(@PathVariable("cod") String cod){
        return serv_estu.eliminarventas(cod);
    }
}
