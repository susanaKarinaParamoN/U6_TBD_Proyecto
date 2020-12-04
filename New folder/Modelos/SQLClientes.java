package Modelos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SQLClientes extends Conexion {

    
    /**
     * 
     * regresa el total de ventas que ha realizado un usuario
     * @param id
     * @return 
     */
    public ventas ventastotales(int id) {
        ventas obj = new ventas();
        PreparedStatement ps = null;
        Connection con = getConexion();
        ResultSet rs = null;
        String sql = "select id_ventas, fecha_envio, Costo_envio from ventas where id_cliente = ?";

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            
            obj.setId_ventas(rs.getInt(1));
            obj.setFecha_envio(rs.getString(2));
            obj.setCosto_envio(rs.getDouble(3));
            
        } catch (Exception e) {
        }
        
        return obj;
    }

    /**
     * actualiza las direcciones de los clientes
     * @param id
     * @param direccion 
     */
    public void direcciones(int id, String direccion) {

        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "Update Cliente set Direccion1 = ? where Id_Cliente = ? ";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, direccion);
            ps.setInt(2, id);
            ps.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(SQLClientes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * actualiza la segunda direcion del cliente
     * @param id
     * @param direccion 
     */
    public void direcciones2(int id, String direccion) {

        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "Update Cliente set Direccion2 = ? where Id_Cliente = ? ";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, direccion);
            ps.setInt(2, id);
            ps.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(SQLClientes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * actualiza la tarjeta de credito
     * @param id
     * @param tar
     * @param cvv
     * @param fecha 
     */
    public void Tar(int id, String tar, int cvv, String fecha) {

        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "Update Cliente set Num_tarjeta = ?, fecha_vencimiento = ?, CVV = ? where Id_Cliente = ? ";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, tar);
            ps.setString(2, fecha);
            ps.setInt(3, cvv);
            ps.setInt(4, id);
            ps.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(SQLClientes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * actualiza los datos del usuario como nombre y usuario
     * @param id
     * @param nuevoNombre
     * @param NuevoUsuario 
     */
    
    public void ModificarNom(int id, String nuevoNombre, String NuevoUsuario) {

        PreparedStatement ps = null;
        Connection con = getConexion();
        

        String sql = "Update Cliente set Nombre = ?, Nom_Usuario = ?  where Id_Cliente = ? ";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, nuevoNombre);
            ps.setString(2, NuevoUsuario);
            ps.setInt(3, id);
            ps.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(SQLClientes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * modifica la contraseña
     * @param contra
     * @param id_cliente 
     */
    public void ModificarCon(String contra, int id_cliente) {

        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "Update Cliente set password = ? where Id_Cliente=?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, contra);
            ps.setInt(2, id_cliente);
            ps.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(SQLClientes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
/**
 * compara la contraseña que se desea cambiar por la que esta en la base de datos
 * @param c
 * @return 
 */
    public String comparar(String c) {
        String cont = "";
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();

        String consulta = "select sha1(?)";
        try {
            ps = con.prepareStatement(consulta);
            ps.setString(1, c);
            rs = ps.executeQuery();

            while (rs.next()) {
                cont = rs.getString(1);
            }

        } catch (Exception e) {
            System.out.println(e);
        }
        return cont;
    }

    public String[] extraer(String nombre_usuario) {
        String[] datos = new String[12];
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();

        String consulta = "select * from cliente where nom_usuario = ?";

        try {
            ps = con.prepareStatement(consulta);
            ps.setString(1, nombre_usuario);
            rs = ps.executeQuery();

            if (rs.next()) {
                for (int i = 0; i < 12; i++) {
                    datos[i] = rs.getString(i + 1);
                }
            } else {
                System.out.println("La consulta no regresa nada");
            }

        } catch (SQLException ex) {
            Logger.getLogger(SQLClientes.class.getName()).log(Level.SEVERE, null, ex);
        }
        return datos;

    }

    public boolean login(Clientes cliente) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();

        String sql = "SELECT Id_Cliente,Nom_Usuario, Password, Nombre, Email from Cliente where Nom_Usuario=?";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, cliente.getNom_Usuario());
            rs = ps.executeQuery();
            if (rs.next()) {
                if (cliente.getPassword().equals(rs.getString(3))) {
                    cliente.setId_Cliente(rs.getInt(1));
                    cliente.setNombre(rs.getString(4));
                    cliente.setEmail(rs.getString(5));

                    return true;

                } else {
                    return false;
                }
            }
            return false;

        } catch (SQLException ex) {
            Logger.getLogger(SQLClientes.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }

    }

    public int existeCliete(String cliente) {

        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();

        String sql = "SELECT count(Id_Cliente) from Cliente where Nom_Usuario=?";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, cliente);
            rs = ps.executeQuery();
            if (rs.next()) {
                return rs.getInt(1);
            }
            return 0;

        } catch (SQLException ex) {
            Logger.getLogger(SQLClientes.class.getName()).log(Level.SEVERE, null, ex);
            return 1;
        }

    }

    public boolean esEmail(String correo) {
        // patron para validar el email
        Pattern pattern = Pattern.compile("^[A-Za-z0-9-\\+]+([_A-Za-z0-9-]+)*@"
                + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
        Matcher mather = pattern.matcher(correo);

        return mather.find();
    }

    public boolean registrar(Clientes cliente) {

        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "INSERT INTO cliente (Nom_Usuario, Nombre"
                + ",email,Correo_Alternativo, password) VALUES(?,?,?,?,?)";

        try {
            ps = con.prepareStatement(sql);

            ps.setString(1, cliente.getNom_Usuario());
            ps.setString(2, cliente.getNombre());
            ps.setString(3, cliente.getEmail());
            ps.setString(4, cliente.getEmailAlt());
            ps.setString(5, cliente.getPassword());

            ps.execute();
            return true;

        } catch (SQLException ex) {
            Logger.getLogger(SQLClientes.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }

    }

    public boolean extraerCliente(String id) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();
        String sql = "Select Id_Cliente, Nom_Usuario from Cliente where Id_Cliente=?";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, id);
            rs = ps.executeQuery();
            return true;

        } catch (SQLException ex) {
            Logger.getLogger(SQLClientes.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

}
