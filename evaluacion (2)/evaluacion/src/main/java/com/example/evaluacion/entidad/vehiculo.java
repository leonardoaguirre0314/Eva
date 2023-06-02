package com.example.evaluacion.entidad;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

@Entity
@Table(name = "vehiculo")
public class vehiculo {


        @Id
        @Column(length = 25)
        private String codigo_veiculo;

        @Column(nullable = false, length = 50)
        private String marca;

        @Column(nullable = false, length = 50)
        private String modelo;

        @Column(nullable = false, length = 50)
        private String precio;


        //foraneo
       // @OneToMany(mappedBy = "id_cliente", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
        //private Set<ventas> ventas;



        @ManyToOne(fetch = FetchType.LAZY, optional = false)
        @JoinColumn(name = "nit", referencedColumnName = "nit", nullable = false)
        @JsonIgnore
        public consecionarios codigoconsecionario;




        public vehiculo(String codigo_veiculo, String marca, String modelo, String precio, String codigoconsecionario) {
                this.codigo_veiculo = codigo_veiculo;
                this.marca = marca;
                this.modelo = modelo;
                this.precio = precio;

        }

        public vehiculo() {
        }

        public String getCodigo_veiculo() {
                return codigo_veiculo;
        }

        public void setCodigo_veiculo(String codigo_veiculo) {
                this.codigo_veiculo = codigo_veiculo;
        }

        public String getMarca() {
                return marca;
        }

        public void setMarca(String marca) {
                this.marca = marca;
        }

        public String getModelo() {
                return modelo;
        }

        public void setModelo(String modelo) {
                this.modelo = modelo;
        }

        public String getPrecio() {
                return precio;
        }

        public void setPrecio(String precio) {
                this.precio = precio;
        }





        @Override
        public String toString() {
                return "vehiculo{" +
                        "codigo_veiculo='" + codigo_veiculo + '\'' +
                        ", marca='" + marca + '\'' +
                        ", modelo='" + modelo + '\'' +
                        ", precio='" + precio + '\'' +
                        ", codigoconsecionario='" + codigoconsecionario + '\'' +

                        '}';
        }
}
