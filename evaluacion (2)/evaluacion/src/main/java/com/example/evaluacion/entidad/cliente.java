package com.example.evaluacion.entidad;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "cliente")
public class cliente {

    @Id
    @Column(length = 25)
    private String id_cliente;

    @Column(nullable = false, length = 50)
    private String nombre;

    @Column(nullable = false, length = 50)
    private String telefono;

    @Column(nullable = false, length = 50)
    private String direccion;

    //@OneToMany(mappedBy = "id_cliente", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    //private Set<ventas> ventabs;

    public cliente(String id_cliente, String nombre, String telefono, String direccion) {
        this.id_cliente = id_cliente;
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    public cliente() {
    }

    public String getId_cliente() {
        return id_cliente;
    }

    public String getId_clnombreiente() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setId_cliente(String id_cliente) {
        this.id_cliente = id_cliente;
    }

    public void setId_clnombreiente(String id_clnombreiente) {
        this.nombre = id_clnombreiente;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "cliente{" +
                "id_cliente=" + id_cliente +
                ", id_clnombreiente='" + nombre + '\'' +
                ", telefono='" + telefono + '\'' +
                ", direccion='" + direccion + '\'' +
                '}';
    }
}
