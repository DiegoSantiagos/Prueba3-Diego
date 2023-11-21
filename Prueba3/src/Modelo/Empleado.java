package Modelo;

import javax.swing.JTextField;

public class Empleado extends Persona {

    private int idCargo;
    private int sueldo;
    private int idEspecialidad;

    public Empleado() {
        super();
        this.idCargo = 0;
        this.sueldo = 0;
        this.idEspecialidad = 0;
    }

    public Empleado( int idCargo, int sueldo, boolean habilitado, int idEspecialidad, int idComuna,
            int rut, String digito, String nombre, String apellido, boolean esCliente) {
        this.idComuna = idComuna;
        this.rut = rut;
        this.digito = digito;
        this.nombre = nombre;
        this.apellido = apellido;
        this.esCliente = esCliente;
        this.idCargo = idCargo;
        this.sueldo = sueldo;
        this.habilitado = habilitado;
        this.idEspecialidad = idEspecialidad;
    }

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
        if (sueldo > 400000 || sueldo < 2500000) {
            this.sueldo = sueldo;
        } else {
            System.out.println("Sueldo fuera de rango (400.000 a 2.500.000)");
        }
    }

    public int getIdEspecialidad() {
        return idEspecialidad;
    }

    public void setIdEspecialidad(int idEspecialidad) {
        this.idEspecialidad = idEspecialidad;
    }

    @Override
    public String toString() {
        return "Persona{" +
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
    public void limpiar() {
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

    public void setIdPersona(int aInt) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public int getIdPersona() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
