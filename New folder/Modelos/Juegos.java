/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

import java.io.File;

/**
 *
 * @author karin
 */
public class Juegos {
    int Id_Videojuego;
    String Nombre;
    File Foto;
    String Consola;
    String Idioma;
    int Clasificacion_Edad;
    int Valoracion;
    String Sinopsis;
    String Fecha_de_Salida;
    String Desarrollador;
    Double Precio;
    String Categoria1;
    String Categoria2;
    String Categoria3;
    String Modelo_Consola;
    
    
    public Object[] toArray(){
        return new Object[]{this.Id_Videojuego, this.Nombre, this.Precio,this.Consola};
    }

    public int getId_Videojuego() {
        return Id_Videojuego;
    }

    public void setId_Videojuego(int Id_Videojuego) {
        this.Id_Videojuego = Id_Videojuego;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public File getFoto() {
        return Foto;
    }

    public void setFoto(File Foto) {
        this.Foto = Foto;
    }

    public String getConsola() {
        return Consola;
    }

    public void setConsola(String Consola) {
        this.Consola = Consola;
    }

    public String getIdioma() {
        return Idioma;
    }

    public void setIdioma(String Idioma) {
        this.Idioma = Idioma;
    }

    public int getClasificacion_Edad() {
        return Clasificacion_Edad;
    }

    public void setClasificacion_Edad(int Clasificacion_Edad) {
        this.Clasificacion_Edad = Clasificacion_Edad;
    }

    public int getValoracion() {
        return Valoracion;
    }

    public void setValoracion(int Valoracion) {
        this.Valoracion = Valoracion;
    }

    public String getSinopsis() {
        return Sinopsis;
    }

    public void setSinopsis(String Sinopsis) {
        this.Sinopsis = Sinopsis;
    }

    public String getFecha_de_Salida() {
        return Fecha_de_Salida;
    }

    public void setFecha_de_Salida(String Fecha_de_Salida) {
        this.Fecha_de_Salida = Fecha_de_Salida;
    }

    public String getDesarrollador() {
        return Desarrollador;
    }

    public void setDesarrollador(String Desarrollador) {
        this.Desarrollador = Desarrollador;
    }

    public Double getPrecio() {
        return Precio;
    }

    public void setPrecio(Double Precio) {
        this.Precio = Precio;
    }

    public String getCategoria1() {
        return Categoria1;
    }

    public void setCategoria1(String Categoria1) {
        this.Categoria1 = Categoria1;
    }

    public String getCategoria2() {
        return Categoria2;
    }

    public void setCategoria2(String Categoria2) {
        this.Categoria2 = Categoria2;
    }

    public String getCategoria3() {
        return Categoria3;
    }

    public void setCategoria3(String Categoria3) {
        this.Categoria3 = Categoria3;
    }

    public String getModelo_Consola() {
        return Modelo_Consola;
    }

    public void setModelo_Consola(String Modelo_Consola) {
        this.Modelo_Consola = Modelo_Consola;
    }
    
    
}
