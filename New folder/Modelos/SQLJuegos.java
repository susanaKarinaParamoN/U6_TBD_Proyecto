package Modelos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SQLJuegos extends Conexion {

    /**
     * inserta los datos de una nueva compra
     * @param dir
     * @param id 
     */
    public void insertar(String dir, int id) {
        double cont = Math.random();
        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "INSERT INTO ventas VALUES(0,curdate(),'true',curdate(),?,150,?,?)";

        try {
            ps = con.prepareStatement(sql);

            ps.setDouble(1, cont);
            ps.setString(2, dir);
            ps.setInt(3, id);
            ps.execute();

        } catch (SQLException ex) {
            Logger.getLogger(SQLClientes.class.getName()).log(Level.SEVERE, null, ex);

        }

    }

    /**
     * regresa todos los datos del videojuego buscando por id
     * @param id
     * @return 
     */
    public Juegos compra(int id) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();
        Juegos objJuego = new Juegos();
        String sql = "SELECT * from videojuegos where id_videojuego=?";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            if (rs.next()) {
                objJuego.setId_Videojuego(rs.getInt(1));
                objJuego.setNombre(rs.getString(2));
                objJuego.setConsola(rs.getString(3));
                objJuego.setModelo_Consola(rs.getString(4));
                objJuego.setIdioma(rs.getString(5));
                objJuego.setClasificacion_Edad(rs.getInt(6));
                objJuego.setValoracion(rs.getInt(7));
                objJuego.setSinopsis(rs.getString(8));
                objJuego.setFecha_de_Salida(rs.getString(9));
                objJuego.setDesarrollador(rs.getString(10));
                objJuego.setPrecio(rs.getDouble(11));
                objJuego.setCategoria1(rs.getString(12));
                objJuego.setCategoria2(rs.getString(13));
                objJuego.setCategoria3(rs.getString(14));

                return objJuego;
            }
        } catch (SQLException ex) {
            Logger.getLogger(SQLClientes.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        return null;
    }

    /**
     * regresa los datos de los videojuegos buscando por nombre
     * @param nombre
     * @return 
     */
    public Juegos extraer(String nombre) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();
        Juegos objJuego = new Juegos();
        String sql = "SELECT * from videojuegos where Nombre=?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, nombre);
            rs = ps.executeQuery();
            if (rs.next()) {
                objJuego.setId_Videojuego(rs.getInt(1));
                objJuego.setNombre(rs.getString(2));
                objJuego.setConsola(rs.getString(3));
                objJuego.setModelo_Consola(rs.getString(4));
                objJuego.setIdioma(rs.getString(5));
                objJuego.setClasificacion_Edad(rs.getInt(6));
                objJuego.setValoracion(rs.getInt(7));
                objJuego.setSinopsis(rs.getString(8));
                objJuego.setFecha_de_Salida(rs.getString(9));
                objJuego.setDesarrollador(rs.getString(10));
                objJuego.setPrecio(rs.getDouble(11));
                objJuego.setCategoria1(rs.getString(12));
                objJuego.setCategoria2(rs.getString(13));
                objJuego.setCategoria3(rs.getString(14));

                return objJuego;
            }
        } catch (SQLException ex) {
            Logger.getLogger(SQLClientes.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        return null;
    }

}
