package Controlador;

import BD.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ControladorCargo {
    public static ArrayList<String> getCargos() {
        ArrayList<String> cargos = new ArrayList<>();
        Connection con = null;
        try {
            con = Conexion.getConnection();
            String sql = "SELECT * FROM Cargo";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                cargos.add(rs.getString("nombre"));
            }
            con.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return cargos;
    }

    public static int getIdCargo(String nombre) {
        int idCargo = 0;
        Connection con = null;
        try {
            con = Conexion.getConnection();
            String sql = "SELECT * FROM Cargo WHERE nombre = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, nombre);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                idCargo = rs.getInt("idCargo");
            }
            con.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return idCargo;
    }

    public static boolean insertCargo(String nombre) {
        boolean insert = false;
        Connection con = null;
        try {
            con = Conexion.getConnection();
            String sql = "INSERT INTO Cargo (nombre) VALUES (?)";
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

    public static boolean updateCargo(int idCargo, String nombre) {
        boolean update = false;
        Connection con = null;
        try {
            con = Conexion.getConnection();
            String sql = "UPDATE Cargo SET nombre = ? WHERE idCargo = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, nombre);
            ps.setInt(2, idCargo);
            ps.executeUpdate();
            update = true;
            con.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return update;
    }

    public static boolean deleteCargo(int idCargo) {
        boolean delete = false;
        Connection con = null;
        try {
            con = Conexion.getConnection();
            String sql = "DELETE FROM Cargo WHERE idCargo = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idCargo);
            ps.executeUpdate();
            delete = true;
            con.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return delete;
    }
}
