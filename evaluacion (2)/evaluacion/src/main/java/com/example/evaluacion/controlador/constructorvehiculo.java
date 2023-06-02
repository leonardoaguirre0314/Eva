package com.example.evaluacion.controlador;

import com.example.evaluacion.entidad.vehiculo;
import com.example.evaluacion.servicio.serviciovehiculo;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
@RestController
public class constructorvehiculo {





    public serviciovehiculo serv_estu;

    public constructorvehiculo(serviciovehiculo serv_estu) {
        this.serv_estu = serv_estu;
    }


    @GetMapping("/listarvehiculo")
    public ArrayList<vehiculo> listarvehiculo() {
        return serv_estu.listarvehiculo();
    }

    @GetMapping("/buscarvehiculo/{doc}")
    public vehiculo buscarvehiculo(@PathVariable("cod") String cod) {
        return serv_estu.buscarvehiculo(cod);
    }

    @PostMapping("/agregarvehiculo")
    public String agregarvehiculo(@RequestBody vehiculo ven) {
        return serv_estu.agregarvehiculo(ven);
    }

    @PutMapping("/actualizarvehiculo")
    public String actualizarvehiculo(vehiculo ven) {
        return serv_estu.actualizarvehiculo(ven);
    }

    @DeleteMapping("/eliminarvehiculo/{cod}")
    public String eliminarvehiculo(@PathVariable("cod") String cod) {
        return serv_estu.eliminarvehiculo(cod);
    }


}
