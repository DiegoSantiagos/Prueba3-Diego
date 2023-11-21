package Controlador;

//CREATE TABLE Vehiculo
//(
//    idVehiculo          int             primary key auto_increment,
//    idPersona           int             not null,
//    idMarca             int             not null,
//    patente             varchar(6)      not null,
//    modelo              varchar(100)    not null,
//    litrosMaletero      int             null,
//    cantidadPuerta      int             null,
//    largoManillar       int             null,
//    estilo              varchar(100)    null,
//    UNIQUE(patente),
//    FOREIGN KEY(idPersona)                    REFERENCES Persona(idPersona),
//    FOREIGN KEY(idMarca)                    REFERENCES Marca(idMarca)
//);

import BD.Conexion;
import Modelo.Vehiculo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ControladorVehiculo {
    public static ArrayList<String> getMarcas() {
        ArrayList<String> marcas = new ArrayList<>();
        Connection con = null;
        try {
            con = Conexion.getConnection();
            String sql = "SELECT * FROM Marca";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                marcas.add(rs.getString("nombre"));
            }
            con.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return marcas;
    }

    public static int getIdMarca(String nombre) {
        int idMarca = 0;
        Connection con = null;
        try {
            con = Conexion.getConnection();
            String sql = "SELECT * FROM Marca WHERE nombre = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, nombre);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                idMarca = rs.getInt("idMarca");
            }
            con.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return idMarca;
    }

    public static boolean insertMarca(String nombre) {
        boolean insert = false;
        Connection con = null;
        try {
            con = Conexion.getConnection();
            String sql = "INSERT INTO Marca (nombre) VALUES (?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, nombre);
            ps.executeUpdate();
            insert = true;
            con.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return insert;
    }

    public static ArrayList<String> getVehiculos() {
        ArrayList<String> vehiculos = new ArrayList<>();
        Connection con = null;
        try {
            con = Conexion.getConnection();
            String sql = "SELECT * FROM Vehiculo";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                vehiculos.add(rs.getString("patente"));
            }
            con.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return vehiculos;
    }

    public static int getIdVehiculo(String patente) {
        int idVehiculo = 0;
        Connection con = null;
        try {
            con = Conexion.getConnection();
            String sql = "SELECT * FROM Vehiculo WHERE patente = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, patente);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                idVehiculo = rs.getInt("idVehiculo");
            }
            con.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return idVehiculo;
    }

    public static boolean insertVehiculo(Vehiculo vehiculo) {
        boolean insert = false;
        Connection con = null;
        try {
            con = Conexion.getConnection();
            String sql = "INSERT INTO Vehiculo (idPersona, idMarca, patente, modelo, litrosMaletero, cantidadPuerta, largoManillar, estilo) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, vehiculo.getIdPersona());
            ps.setInt(2, vehiculo.getIdMarca());
            ps.setString(3, vehiculo.getPatente());
            ps.setString(4, vehiculo.getModelo());
            ps.setInt(5, vehiculo.getLitrosMaletero());
            ps.setInt(6, vehiculo.getCantidadPuerta());
            ps.setInt(7, vehiculo.getLargoManillar());
            ps.setString(8, vehiculo.getEstilo());
            ps.executeUpdate();
            insert = true;
            con.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return insert;
    }

    public static boolean updateVehiculo(int idVehiculo, int idPersona, int idMarca, String patente, String modelo,
            int litrosMaletero, int cantidadPuerta, int largoManillar, String estilo) {
        boolean update = false;
        Connection con = null;
        try {
            con = Conexion.getConnection();
            String sql = "UPDATE Vehiculo SET idPersona = ?, idMarca = ?, patente = ?, modelo = ?, litrosMaletero = ?, cantidadPuerta = ?, largoManillar = ?, estilo = ? WHERE idVehiculo = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idPersona);
            ps.setInt(2, idMarca);
            ps.setString(3, patente);
            ps.setString(4, modelo);
            ps.setInt(5, litrosMaletero);
            ps.setInt(6, cantidadPuerta);
            ps.setInt(7, largoManillar);
            ps.setString(8, estilo);
            ps.setInt(9, idVehiculo);
            ps.executeUpdate();
            update = true;
            con.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return update;
    }

    public static boolean deleteVehiculo(int idVehiculo) {
        boolean delete = false;
        Connection con = null;
        try {
            con = Conexion.getConnection();
            String sql = "DELETE FROM Vehiculo WHERE idVehiculo = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idVehiculo);
            ps.executeUpdate();
            delete = true;
            con.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return delete;
    }

    public static ArrayList<String> getVehiculosPersona(int idPersona) {
        ArrayList<String> vehiculos = new ArrayList<>();
        Connection con = null;
        try {
            con = Conexion.getConnection();
            String sql = "SELECT * FROM Vehiculo WHERE idPersona = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idPersona);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                vehiculos.add(rs.getString("patente"));
            }
            con.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return vehiculos;
    }

    public static int getIdVehiculoPersona(int idPersona, String patente) {
        int idVehiculo = 0;
        Connection con = null;
        try {
            con = Conexion.getConnection();
            String sql = "SELECT * FROM Vehiculo WHERE idPersona = ? AND patente = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idPersona);
            ps.setString(2, patente);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                idVehiculo = rs.getInt("idVehiculo");
            }
            con.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return idVehiculo;
    }

    public static Vehiculo getVehiculo(int idVehiculo) {
        Vehiculo vehiculo = new Vehiculo();
        Connection con = null;
        try {
            con = Conexion.getConnection();
            String sql = "SELECT * FROM Vehiculo WHERE idVehiculo = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idVehiculo);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                vehiculo.setIdVehiculo(rs.getInt("idVehiculo"));
                vehiculo.setIdPersona(rs.getInt("idPersona"));
                vehiculo.setIdMarca(rs.getInt("idMarca"));
                vehiculo.setPatente(rs.getString("patente"));
                vehiculo.setModelo(rs.getString("modelo"));
                vehiculo.setLitrosMaletero(rs.getInt("litrosMaletero"));
                vehiculo.setCantidadPuerta(rs.getInt("cantidadPuerta"));
                vehiculo.setLargoManillar(rs.getInt("largoManillar"));
                vehiculo.setEstilo(rs.getString("estilo"));
            }
            con.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return vehiculo;
    }

    public static ArrayList<String> getVehiculosMarca(int idMarca) {
        ArrayList<String> vehiculos = new ArrayList<>();
        Connection con = null;
        try {
            con = Conexion.getConnection();
            String sql = "SELECT * FROM Vehiculo WHERE idMarca = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idMarca);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                vehiculos.add(rs.getString("patente"));
            }
            con.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return vehiculos;
    }

    public static int getIdVehiculoMarca(int idMarca, String patente) {
        int idVehiculo = 0;
        Connection con = null;
        try {
            con = Conexion.getConnection();
            String sql = "SELECT * FROM Vehiculo WHERE idMarca = ? AND patente = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idMarca);
            ps.setString(2, patente);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                idVehiculo = rs.getInt("idVehiculo");
            }
            con.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return idVehiculo;
    }

    public static ArrayList<String> getVehiculosModelo(String modelo) {
        ArrayList<String> vehiculos = new ArrayList<>();
        Connection con = null;
        try {
            con = Conexion.getConnection();
            String sql = "SELECT * FROM Vehiculo WHERE modelo = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, modelo);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                vehiculos.add(rs.getString("patente"));
            }
            con.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return vehiculos;
    }

    public static int getIdVehiculoModelo(String modelo, String patente) {
        int idVehiculo = 0;
        Connection con = null;
        try {
            con = Conexion.getConnection();
            String sql = "SELECT * FROM Vehiculo WHERE modelo = ? AND patente = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, modelo);
            ps.setString(2, patente);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                idVehiculo = rs.getInt("idVehiculo");
            }
            con.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return idVehiculo;
    }

    public static ArrayList<String> getVehiculosLitrosMaletero(int litrosMaletero) {
        ArrayList<String> vehiculos = new ArrayList<>();
        Connection con = null;
        try {
            con = Conexion.getConnection();
            String sql = "SELECT * FROM Vehiculo WHERE litrosMaletero = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, litrosMaletero);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                vehiculos.add(rs.getString("patente"));
            }
            con.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return vehiculos;
    }

    public static int getIdVehiculoLitrosMaletero(int litrosMaletero, String patente) {
        int idVehiculo = 0;
        Connection con = null;
        try {
            con = Conexion.getConnection();
            String sql = "SELECT * FROM Vehiculo WHERE litrosMaletero = ? AND patente = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, litrosMaletero);
            ps.setString(2, patente);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                idVehiculo = rs.getInt("idVehiculo");
            }
            con.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return idVehiculo;
    }

    public static ArrayList<String> getVehiculosCantidadPuerta(int cantidadPuerta) {
        ArrayList<String> vehiculos = new ArrayList<>();
        Connection con = null;
        try {
            con = Conexion.getConnection();
            String sql = "SELECT * FROM Vehiculo WHERE cantidadPuerta = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, cantidadPuerta);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                vehiculos.add(rs.getString("patente"));
            }
            con.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return vehiculos;
    }

    public static int getIdVehiculoCantidadPuerta(int cantidadPuerta, String patente) {
        int idVehiculo = 0;
        Connection con = null;
        try {
            con = Conexion.getConnection();
            String sql = "SELECT * FROM Vehiculo WHERE cantidadPuerta = ? AND patente = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, cantidadPuerta);
            ps.setString(2, patente);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                idVehiculo = rs.getInt("idVehiculo");
            }
            con.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return idVehiculo;
    }

    public static ArrayList<String> getVehiculosLargoManillar(int largoManillar) {
        ArrayList<String> vehiculos = new ArrayList<>();
        Connection con = null;
        try {
            con = Conexion.getConnection();
            String sql = "SELECT * FROM Vehiculo WHERE largoManillar = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, largoManillar);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                vehiculos.add(rs.getString("patente"));
            }
            con.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return vehiculos;
    }

    public static int getIdVehiculoLargoManillar(int largoManillar, String patente) {
        int idVehiculo = 0;
        Connection con = null;
        try {
            con = Conexion.getConnection();
            String sql = "SELECT * FROM Vehiculo WHERE largoManillar = ? AND patente = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, largoManillar);
            ps.setString(2, patente);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                idVehiculo = rs.getInt("idVehiculo");
            }
            con.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return idVehiculo;
    }

    public static ArrayList<String> getVehiculosEstilo(String estilo) {
        ArrayList<String> vehiculos = new ArrayList<>();
        Connection con = null;
        try {
            con = Conexion.getConnection();
            String sql = "SELECT * FROM Vehiculo WHERE estilo = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, estilo);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                vehiculos.add(rs.getString("patente"));
            }
            con.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return vehiculos;
    }

    public static int getIdVehiculoEstilo(String estilo, String patente) {
        int idVehiculo = 0;
        Connection con = null;
        try {
            con = Conexion.getConnection();
            String sql = "SELECT * FROM Vehiculo WHERE estilo = ? AND patente = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, estilo);
            ps.setString(2, patente);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                idVehiculo = rs.getInt("idVehiculo");
            }
            con.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return idVehiculo;
    }
}