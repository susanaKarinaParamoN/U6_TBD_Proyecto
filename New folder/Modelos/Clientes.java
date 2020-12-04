
package Modelos;

public class Clientes {
    int Id_Cliente;
    String Nom_Usuario;
    String Nombre;
    String Email;
    String EmailAlt;
    String Password;
    String Pedidos;
    String Direccion1;
    String Direccion2;
    String Telefono;
    String Num_Tarjeta;
    String Fecha_Vencimiento;
    String CVV;

    
    public String getEmailAlt() {
        return EmailAlt;
    }

    public void setEmailAlt(String EmailAlt) {
        this.EmailAlt = EmailAlt;
    }
    public String getNom_Usuario() {
        return Nom_Usuario;
    }

    public void setNom_Usuario(String Nom_Usuario) {
        this.Nom_Usuario = Nom_Usuario;
    }
    public int getId_Cliente() {
        return Id_Cliente;
    }

    public void setId_Cliente(int Id_Cliente) {
        this.Id_Cliente = Id_Cliente;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getPedidos() {
        return Pedidos;
    }

    public void setPedidos(String Pedidos) {
        this.Pedidos = Pedidos;
    }

    public String getDireccion1() {
        return Direccion1;
    }

    public void setDireccion1(String Direccion1) {
        this.Direccion1 = Direccion1;
    }

    public String getDireccion2() {
        return Direccion2;
    }

    public void setDireccion2(String Direccion2) {
        this.Direccion2 = Direccion2;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String getNum_Tarjeta() {
        return Num_Tarjeta;
    }

    public void setNum_Tarjeta(String Num_Tarjeta) {
        this.Num_Tarjeta = Num_Tarjeta;
    }

    public String getFecha_Vencimiento() {
        return Fecha_Vencimiento;
    }

    public void setFecha_Vencimiento(String Fecha_Vencimiento) {
        this.Fecha_Vencimiento = Fecha_Vencimiento;
    }

    public String getCVV() {
        return CVV;
    }

    public void setCVV(String CVV) {
        this.CVV = CVV;
    }
    
    
    
}
