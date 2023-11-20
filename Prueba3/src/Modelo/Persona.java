package Modelo;

public abstract class Persona {
    private int idPersona;
    private int idCargo;
    private int idEspecialidad;
    private int idComuna;
    private int rut;
    private String digito;
    private String nombre;
    private String apellido;
    private int sueldo;
    private boolean esCliente;
    private boolean habilitado;

    public Persona() {
        this.idPersona = 0;
        this.idCargo = 0;
        this.idEspecialidad = 0;
        this.idComuna = 0;
        this.rut = 0;
        this.digito = "";
        this.nombre = "";
        this.apellido = "";
        this.sueldo = 0;
        this.esCliente = false;
        this.habilitado = false;
    }

    public Persona(int idPersona, int idCargo, int idEspecialidad, int idComuna,
                    int rut, String digito, String nombre, String apellido,
                    int sueldo, boolean esCliente, boolean habilitado) {
        this.idPersona = idPersona;
        this.idCargo = idCargo;
        this.idEspecialidad = idEspecialidad;
        this.idComuna = idComuna;
        this.rut = rut;
        this.digito = digito;
        this.nombre = nombre;
        this.apellido = apellido;
        this.sueldo = sueldo;
        this.esCliente = esCliente;
        this.habilitado = habilitado;
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public int getIdCargo() {
        return idCargo;
    }

    public void setIdCargo(int idCargo) {
        this.idCargo = idCargo;
    }

    public int getIdEspecialidad() {
        return idEspecialidad;
    }

    public void setIdEspecialidad(int idEspecialidad) {
        this.idEspecialidad = idEspecialidad;
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

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public boolean isEsCliente() {
        return esCliente;
    }

    public void setEsCliente(boolean esCliente) {
        this.esCliente = esCliente;
    }

    public boolean isHabilitado() {
        return habilitado;
    }

    public void setHabilitado(boolean habilitado) {
        this.habilitado = habilitado;
    }
    
    @Override
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona +
                ", idCargo=" + idCargo +
                ", idEspecialidad=" + idEspecialidad +
                ", idComuna=" + idComuna +
                ", rut=" + rut +
                ", digito=" + digito +
                ", nombre=" + nombre +
                ", apellido=" + apellido +
                ", sueldo=" + sueldo +
                ", esCliente=" + esCliente +
                ", habilitado=" + habilitado + '}';
    }
    
    public void limpiar(){
        this.idPersona = 0;
        this.idCargo = 0;
        this.idEspecialidad = 0;
        this.idComuna = 0;
        this.rut = 0;
        this.digito = "";
        this.nombre = "";
        this.apellido = "";
        this.sueldo = 0;
        this.esCliente = false;
        this.habilitado = false;
    }
}
