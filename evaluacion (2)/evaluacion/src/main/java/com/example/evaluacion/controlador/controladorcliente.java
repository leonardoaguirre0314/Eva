package com.example.evaluacion.controlador;


import com.example.evaluacion.entidad.cliente;
import com.example.evaluacion.servicio.serviciocliente;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
@RestController
public class controladorcliente {



        public serviciocliente serv_estu;

        public controladorcliente(serviciocliente serv_estu) {
            this.serv_estu = serv_estu;
        }


        @GetMapping("/listarcliente")
        public ArrayList<cliente> listarcliente() {
            return serv_estu.listarcliente();
        }

        @GetMapping("/buscarcliente/{doc}")
        public cliente buscarcliente(@PathVariable("cod") String cod) {
            return serv_estu.buscarcliente(cod);
        }

        @PostMapping("/agregarcliente")
        public String agregarcliente(@RequestBody cliente cli) {
            return serv_estu.agregarcliente(cli);
        }

        @PutMapping("/actualizarcliente")
        public String actualizarcliente(cliente cli) {
            return serv_estu.actualizarcliente(cli);
        }

        @DeleteMapping("/eliminarcliente/{cod}")
        public String eliminarcliente(@PathVariable("cod") String cod) {
            return serv_estu.eliminarcliente(cod);
        }
    }


