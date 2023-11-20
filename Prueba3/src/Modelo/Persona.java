package Modelo;

public abstract class Persona {

    int idComuna;
    int rut;
    String digito;
    String nombre;
    String apellido;
    boolean esCliente;
    boolean habilitado;
    

    public Persona() {
        this.idComuna = 0;
        this.rut = 0;
        this.digito = "";
        this.nombre = "";
        this.apellido = "";
        this.esCliente = false;
        this.habilitado = true;
    }

    public Persona(int idComuna, int rut, String digito, String nombre, String apellido, boolean esCliente, boolean habilitado) {
        this.idComuna = idComuna;
        this.rut = rut;
        this.digito = digito;
        this.nombre = nombre;
        this.apellido = apellido;
        this.esCliente = esCliente;
        this.habilitado = habilitado;
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
        if (rut >= 3000000 && rut <= 9999999 ){
            this.rut = rut;
        } else {
            System.out.println("rut no valido");
        }
    }

    public String getDigito() {
        return digito;
    }

    public void setDigito(String digito) {
        if (digito.length() == 1 && digito.matches("[0-9Kk]")) {
            this.digito = digito;
        } else {
            this.digito = "";
        }
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
    
    public boolean isHabilitado() {
        return habilitado;
    }

    public void setHabilitado(boolean habilitado) {
        this.habilitado = habilitado;
    }
    
    @Override
    public String toString() {
        return "Persona{" +
                ", idComuna=" + idComuna +
                ", rut=" + rut +
                ", digito=" + digito +
                ", nombre=" + nombre +
                ", apellido=" + apellido +
                ", esCliente=" + esCliente +
                ", habilitado=" + habilitado + '}';
    }
    
    public void limpiar(){
        this.idComuna = 0;
        this.rut = 0;
        this.digito = "";
        this.nombre = "";
        this.apellido = "";
        this.esCliente = false;
        this.habilitado = true;
    }
}
