package com.example.ventas.Entidades;



import java.io.Serializable;
import java.math.BigDecimal;

public class Producto implements Serializable {
    private Integer idCliente;
    private Integer idProducto;
    private String nombre;
    private BigDecimal precio;

    public Producto() {
    }

    public Producto(Integer idCliente, Integer idProducto, String nombre, BigDecimal precio) {
        this.idCliente = idCliente;
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.precio = precio;
    }

    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    public Integer getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Integer idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public BigDecimal getPrecio() {
        return precio;
    }

    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }
}