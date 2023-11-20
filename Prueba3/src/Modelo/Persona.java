package Modelo;

public abstract class Persona {
    int idPersona;
    
    int idComuna;
    int rut;
    String digito;
    String nombre;
    String apellido;
    boolean esCliente;
    

    public Persona() {
        this.idPersona = 0;
        this.idEspecialidad = 0;
        this.idComuna = 0;
        this.rut = 0;
        this.digito = "";
        this.nombre = "";
        this.apellido = "";
        this.esCliente = false;
        this.habilitado = false;
    }

    public Persona(int idPersona, int idEspecialidad, int idComuna, int rut, String digito, String nombre, String apellido, boolean esCliente, boolean habilitado) {
        this.idPersona = idPersona;
        this.idEspecialidad = idEspecialidad;
        this.idComuna = idComuna;
        this.rut = rut;
        this.digito = digito;
        this.nombre = nombre;
        this.apellido = apellido;
        this.esCliente = esCliente;
        this.habilitado = habilitado;
    }


    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }



    public int getIdComuna() {
        return idComuna;
    }

    public void setIdComuna(int idComuna) {
        this.idComuna = idComuna;
    }

    public int getRut() {
        return rut;
    }

    public void setRut(int rut) {
        this.rut = rut;
    }

    public String getDigito() {
        return digito;
    }

    public void setDigito(String digito) {
        this.digito = digito;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }


    public boolean isEsCliente() {
        return esCliente;
    }

    public void setEsCliente(boolean esCliente) {
        this.esCliente = esCliente;
    }
    
    @Override
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona +
                ", idEspecialidad=" + idEspecialidad +
                ", idComuna=" + idComuna +
                ", rut=" + rut +
                ", digito=" + digito +
                ", nombre=" + nombre +
                ", apellido=" + apellido +
                ", esCliente=" + esCliente +
                ", habilitado=" + habilitado + '}';
    }
    
    public void limpiar(){
        this.idPersona = 0;
        this.idEspecialidad = 0;
        this.idComuna = 0;
        this.rut = 0;
        this.digito = "";
        this.nombre = "";
        this.apellido = "";
        this.esCliente = false;
        this.habilitado = false;
    }
}
