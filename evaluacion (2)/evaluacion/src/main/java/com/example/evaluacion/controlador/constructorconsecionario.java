package com.example.evaluacion.controlador;

import com.example.evaluacion.entidad.consecionarios;
import com.example.evaluacion.servicio.servicioconsecionario;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class constructorconsecionario {




    public servicioconsecionario serv_estu;

    public constructorconsecionario(servicioconsecionario serv_estu) {
        this.serv_estu = serv_estu;
    }


    @GetMapping("/listarconse")
    public ArrayList<consecionarios> listarconse() {
        return serv_estu.listarconse();
    }

    @GetMapping("/buscarconse/{doc}")
    public consecionarios buscarconse(@PathVariable("cod") String cod) {
        return serv_estu.buscarconse(cod);
    }

    @PostMapping("/agregarconse")
    public String agregarconse(@RequestBody consecionarios ven) {
        return serv_estu.agregarconse(ven);
    }

    @PutMapping("/actualizarconse")
    public String actualizarconse(consecionarios ven) {
        return serv_estu.actualizarconse(ven);
    }

    @DeleteMapping("/eliminarconce/{cod}")
    public String eliminarconce(@PathVariable("cod") String cod) {
        return serv_estu.eliminarconce(cod);
    }
}



