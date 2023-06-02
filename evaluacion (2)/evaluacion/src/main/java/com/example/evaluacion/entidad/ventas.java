package com.example.evaluacion.entidad;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "ventas")
public class ventas {

    @Id
    @Column(length = 25)
    private String id_venta;

    @Column(nullable = false, length = 50)
    private String cliente;

    @Column(nullable = false, length = 50)
    private int id_veiculo;

    @Column(name = "date")
    @Temporal(TemporalType.DATE)
    private Date fecha;

    //Metodo para tomar la fecha actual
    @PrePersist //Mapeo para decir que antes de guardar revise la fecha de hoy
    public void fecha_hoy(){
        this.fecha = new Date();
    }


    //@ManyToOne(fetch = FetchType.LAZY, optional = false)
    //@JoinColumn(name = "id_cliente", referencedColumnName = "id_cliente", nullable = false)
    //@JsonIgnore
    //public cliente id_cliente;




    public ventas(String id_venta, String cliente, int id_veiculo, Date fecha) {
        this.id_venta = id_venta;
        this.cliente = cliente;
        this.id_veiculo = id_veiculo;
        this.fecha = fecha;
    }


    public ventas() {
    }

    public String getId_venta() {
        return id_venta;
    }

    public String getId_cliente() {
        return cliente;
    }

    public int getId_veiculo() {
        return id_veiculo;
    }

    public Date getDate() {
        return fecha;
    }



    public void setId_venta(String id_venta) {
        this.id_venta = id_venta;
    }

    public void setId_cliente(String cliente) {
        this.cliente = cliente;
    }

    public void setId_veiculo(int id_veiculo) {
        this.id_veiculo = id_veiculo;
    }

    public void setDate(Date date) {
        this.fecha = date;
    }

    @Override
    public String toString() {
        return "ventas{" +
                "id_venta='" + id_venta + '\'' +
                ", id_cliente=" + cliente +
                ", id_veiculo=" + id_veiculo +
                ", date=" + fecha +
                '}';
    }
}
