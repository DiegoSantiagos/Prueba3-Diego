
package Modelo;

public abstract class Vehiculo {
    private int idVehiculo;
    private int idPersona;
    private int idMarca;
    private String patente;
    private String modelo;
    private int litrosMaletero;
    private int cantidadPuerta;
    private int largoManillar;
    private String estilo;
    
    public Vehiculo() {
        this.idVehiculo = 0;
        this.idPersona = 0;
        this.idMarca = 0;
        this.patente = "";
        this.modelo = "";
        this.litrosMaletero = 0;
        this.cantidadPuerta = 0;
        this.largoManillar = 0;
        this.estilo = "";
    }
    
    public Vehiculo(int idVehiculo, int idPersona, int idMarca, String patente,
                    String modelo, int litrosMaletero, int cantidadPuerta,
                    int largoManillar, String estilo) {
        this.idVehiculo = idVehiculo;
        this.idPersona = idPersona;
        this.idMarca = idMarca;
        this.patente = patente;
        this.modelo = modelo;
        this.litrosMaletero = litrosMaletero;
        this.cantidadPuerta = cantidadPuerta;
        this.largoManillar = largoManillar;
        this.estilo = estilo;
    }

    public int getIdVehiculo() {
        return idVehiculo;
    }

    public void setIdVehiculo(int idVehiculo) {
        this.idVehiculo = idVehiculo;
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public int getIdMarca() {
        return idMarca;
    }

    public void setIdMarca(int idMarca) {
        this.idMarca = idMarca;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
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

    public int getLargoManillar() {
        return largoManillar;
    }

    public void setLargoManillar(int largoManillar) {
        this.largoManillar = largoManillar;
    }

    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }
    

    @Override
    public String toString() {
        return "Vehiculo{" + "idVehiculo=" + idVehiculo +
                ", idPersona=" + idPersona +
                ", idMarca=" + idMarca +
                ", patente=" + patente +
                ", modelo=" + modelo +
                ", litrosMaletero=" + litrosMaletero +
                ", cantidadPuerta=" + cantidadPuerta +
                ", largoManillar=" + largoManillar +
                ", estilo=" + estilo + '}';
    }
    
    public void limpiar()
    {
        this.idVehiculo = 0;
        this.idPersona = 0;
        this.idMarca = 0;
        this.patente = "";
        this.modelo = "";
        this.litrosMaletero = 0;
        this.cantidadPuerta = 0;
        this.largoManillar = 0;
        this.estilo = "";
    }
}
