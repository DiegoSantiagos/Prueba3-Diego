package Modelo;

public class Motocicleta extends Vehiculo {

    private String estilo;
    private int largoManillar;

    public Motocicleta() {
        this.idVehiculo = 0;
        this.idPersona = 0;
        this.idMarca = 0;
        this.patente = "";
        this.modelo = "";
        this.estilo = "";
        this.largoManillar = 0;
    }
    
    public Motocicleta(int idVehiculo, int idPersona, int idMarca, String patente, String modelo, int largoManillar, String estilo) {
        super(idVehiculo, idPersona, idMarca, patente, modelo, largoManillar, largoManillar, largoManillar, estilo);
        this.estilo = estilo;
        this.largoManillar = largoManillar;
    }


    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    public int getMedidaManillar() {
        return largoManillar;
    }

    public void setMedidaManillar(int largoManillar) {
        this.largoManillar = largoManillar;
    }


    
     @Override
    public String toString() {
        return "Vehiculo{" + "idVehiculo=" + idVehiculo +
                ", idPersona=" + idPersona +
                ", idMarca=" + idMarca +
                ", patente=" + patente +
                ", modelo=" + modelo +
                ", largoManillar=" + largoManillar +
                ", estilo=" + estilo + '}';
    }

    @Override
    public void limpiar()
    {
        this.idVehiculo = 0;
        this.idPersona = 0;
        this.idMarca = 0;
        this.patente = "";
        this.modelo = "";
        this.largoManillar = 0;
        this.estilo = "";
    }
}
