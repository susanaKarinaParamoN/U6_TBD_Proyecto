/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

/**
 *
 * @author FERNANDA
 */
public class ventas {

    int id_ventas;
    String fecha;
    boolean confirmacion;
    String fecha_envio;
    String cod_rastreo;
    double costo_envio;
    String direccion_envio;
    int id_cliente;

    public Object[] toArray() {
        return new Object[]{this.id_ventas, this.fecha_envio, this.costo_envio};
    }

    public int getId_ventas() {
        return id_ventas;
    }

    public void setId_ventas(int id_ventas) {
        this.id_ventas = id_ventas;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public boolean isConfirmacion() {
        return confirmacion;
    }

    public void setConfirmacion(boolean confirmacion) {
        this.confirmacion = confirmacion;
    }

    public String getFecha_envio() {
        return fecha_envio;
    }

    public void setFecha_envio(String fecha_envio) {
        this.fecha_envio = fecha_envio;
    }

    public String getCod_rastreo() {
        return cod_rastreo;
    }

    public void setCod_rastreo(String cod_rastreo) {
        this.cod_rastreo = cod_rastreo;
    }

    public double getCosto_envio() {
        return costo_envio;
    }

    public void setCosto_envio(double costo_envio) {
        this.costo_envio = costo_envio;
    }

    public String getDireccion_envio() {
        return direccion_envio;
    }

    public void setDireccion_envio(String direccion_envio) {
        this.direccion_envio = direccion_envio;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

}
