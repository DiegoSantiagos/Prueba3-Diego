
package Modelo;

public class Cliente extends Persona {
    int idPersona;

    public Cliente(int idPersona, int idComuna, int rut, String digito, String nombre, String apellido, boolean esCliente, boolean habilitado) {
        super(idComuna, rut, digito, nombre, apellido, esCliente, habilitado);
        this.idPersona = idPersona;
    }

    public Cliente(int idComuna, int rut, String digito, String nombre, String apellido, boolean esCliente, boolean habilitado) {
        super(idComuna, rut, digito, nombre, apellido, esCliente, habilitado);
    }

    public Cliente(){
        
        idPersona = 0;
    }
    
    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    @Override
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona +
                ", idComuna=" + idComuna +
                ", rut=" + rut +
                ", digito=" + digito +
                ", nombre=" + nombre +
                ", apellido=" + apellido +
                ", esCliente=" + esCliente +
                ", habilitado=" + habilitado + '}';
    }

    @Override
    public void limpiar(){
        this.idPersona = 0;
        this.idComuna = 0;
        this.rut = 0;
        this.digito = "";
        this.nombre = "";
        this.apellido = "";
        this.esCliente = false;
        this.habilitado = true;
    }
}
