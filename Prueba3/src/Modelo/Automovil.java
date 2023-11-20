package Modelo;

public class Automovil extends Vehiculo {

    private int litrosMaletero;
    private int cantidadPuerta;

    public Automovil() {
        this.idVehiculo = 0;
        this.idPersona = 0;
        this.idMarca = 0;
        this.patente = "";
        this.modelo = "";
        this.litrosMaletero = 0;
        this.cantidadPuerta = 0;
    }

    public Automovil(String patente, String marca, String modelo, String color, double precioNeto, int cantidadPuertas,
            int capacidadMaletero) {
        super(capacidadMaletero, capacidadMaletero, capacidadMaletero, patente, modelo, capacidadMaletero, cantidadPuertas, capacidadMaletero, color);
        this.cantidadPuerta = cantidadPuertas;
        this.litrosMaletero = capacidadMaletero;
    }

    public int getLitrosMaletero() {
        return litrosMaletero;
    }

    public void setLitrosMaletero(int litrosMaletero) {
        this.litrosMaletero = litrosMaletero;
    }

    public int getCantidadPuerta() {
        return cantidadPuerta;
    }

    public void setCantidadPuerta(int cantidadPuerta) {
        this.cantidadPuerta = cantidadPuerta;
    }
    
    

    @Override
    public String toString() {
        return "Vehiculo{" + "idVehiculo=" + idVehiculo +
                ", idPersona=" + idPersona +
                ", idMarca=" + idMarca +
                ", patente=" + patente +
                ", modelo=" + modelo +
                ", litrosMaletero=" + litrosMaletero +
                ", cantidadPuerta=" + cantidadPuerta + '}';
    }
    
    @Override
    public void limpiar()
    {
        this.idVehiculo = 0;
        this.idPersona = 0;
        this.idMarca = 0;
        this.patente = "";
        this.modelo = "";
        this.litrosMaletero = 0;
        this.cantidadPuerta = 0;;
    }
}
