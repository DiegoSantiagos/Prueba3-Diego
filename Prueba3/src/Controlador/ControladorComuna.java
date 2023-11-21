package Controlador;

import BD.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ControladorComuna {
    public static ArrayList<String> getComunas() {
        ArrayList<String> comunas = new ArrayList<>();
        Connection con = null;
        try {
            con = Conexion.getConnection();
            String sql = "SELECT * FROM Comuna";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                comunas.add(rs.getString("nombre"));
            }
            con.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return comunas;
    }

    public static int getIdComuna(String nombre) {
        int idComuna = 0;
        Connection con = null;
        try {
            con = Conexion.getConnection();
            String sql = "SELECT * FROM Comuna WHERE nombre = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, nombre);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                idComuna = rs.getInt("idComuna");
            }
            con.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return idComuna;
    }

    public static boolean insertComuna(String nombre) {
        boolean insert = false;
        Connection con = null;
        try {
            con = Conexion.getConnection();
            String sql = "INSERT INTO Comuna (nombre) VALUES (?)";
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
}
