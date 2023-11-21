package Controlador;

import BD.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ControladorEspecialidad {
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

    public static boolean updateMarca(int idMarca, String nombre) {
        boolean update = false;
        Connection con = null;
        try {
            con = Conexion.getConnection();
            String sql = "UPDATE Marca SET nombre = ? WHERE idMarca = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, nombre);
            ps.setInt(2, idMarca);
            ps.executeUpdate();
            update = true;
            con.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return update;
    }

    public static boolean deleteMarca(int idMarca) {
        boolean delete = false;
        Connection con = null;
        try {
            con = Conexion.getConnection();
            String sql = "DELETE FROM Marca WHERE idMarca = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idMarca);
            ps.executeUpdate();
            delete = true;
            con.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return delete;
    }
}
