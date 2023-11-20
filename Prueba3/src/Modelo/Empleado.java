package Modelo;

public class Empleado extends Persona {
    
    private int idCargo;
    private int sueldo;
    boolean habilitado;
    int idEspecialidad;

    public int getIdCargo() {
        return idCargo;
    }

    public void setIdCargo(int idCargo) {
        this.idCargo = idCargo;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }
    
    public int getIdEspecialidad() {
        return idEspecialidad;
    }

    public void setIdEspecialidad(int idEspecialidad) {
        this.idEspecialidad = idEspecialidad;
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
    
    @Override
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
