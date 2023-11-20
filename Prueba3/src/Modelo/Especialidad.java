package Modelo;

public class Especialidad {
    private int idEspecialidad;
    private String nombre;
    private boolean habilitado;

    public Especialidad() {
        this.idEspecialidad = 0;
        this.nombre = "";
        this.habilitado = false;
    }

    public Especialidad(int idEspecialidad, String nombre, boolean habilitado) {
        this.idEspecialidad = idEspecialidad;
        this.nombre = nombre;
        this.habilitado = habilitado;
    }

    public int getIdEspecialidad() {
        return idEspecialidad;
    }

    public void setIdEspecialidad(int idEspecialidad) {
        if (idEspecialidad > 0) {
            this.idEspecialidad = idEspecialidad;
        } else {
            System.out.println("idEspecialidad debe ser mayor a 0");
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre.length() > 0 && nombre.length() <= 50) {
            this.nombre = nombre;
        } else {
            System.out.println("nombre debe tener entre 1 y 50 caracteres");
        }
    }

    public boolean getHabilitado() {
        return habilitado;
    }

    public void setHabilitado(boolean habilitado) {
            this.habilitado = habilitado;
    }
    
}
