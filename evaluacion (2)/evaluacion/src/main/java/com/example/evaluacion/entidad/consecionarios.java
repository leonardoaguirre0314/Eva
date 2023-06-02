package com.example.evaluacion.entidad;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "consecionarios")
public class consecionarios {

    @Id
    @Column(length = 25)
    private String nit;

    @Column(nullable = false, length = 50)
    private String nombre;

    @Column(nullable = false, length = 50)
    private String telefono;

    @Column(nullable = false, length = 50)
    private String direccion;

    @Column(nullable = false, length = 50)
    private String vehiculo;


    //foraneo
    // @OneToMany(mappedBy = "nit", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    //private Set<ventas> ventas;




    public consecionarios(String nit, String nombre, String telefono, String direccion, String vehiculo) {
        this.nit = nit;
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
        this.vehiculo = vehiculo;
    }

    public consecionarios() {
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getVeiculo() {
        return vehiculo;
    }

    public void setVeiculo(String veiculo) {
        this.vehiculo = veiculo;
    }

    @Override
    public String toString() {
        return "consecionarios{" +
                "nit='" + nit + '\'' +
                ", nombre='" + nombre + '\'' +
                ", telefono='" + telefono + '\'' +
                ", direccion='" + direccion + '\'' +
                ", vehiculo=" + vehiculo +
                '}';
    }
}
