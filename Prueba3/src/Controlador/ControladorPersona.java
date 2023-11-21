package Controlador;

import BD.Conexion;
import Modelo.Empleado;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ControladorPersona {

    public static ArrayList<Empleado> getEmpleados() {
        ArrayList<Empleado> empleados = new ArrayList<>();
        Connection con = null;
        try {
            con = Conexion.getConnection();
            String sql = "SELECT * FROM Persona WHERE esCliente = 0";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Empleado empleado = new Empleado();
                empleado.setIdPersona(rs.getInt("idPersona"));
                empleado.setIdCargo(rs.getInt("idCargo"));
                empleado.setIdEspecialidad(rs.getInt("idEspecialidad"));
                empleado.setIdComuna(rs.getInt("idComuna"));
                empleado.setRut(rs.getInt("rut"));
                empleado.setDigito(rs.getString("digito"));
                empleado.setNombre(rs.getString("nombre"));
                empleado.setApellido(rs.getString("apellido"));
                empleado.setSueldo(rs.getInt("sueldo"));
                empleado.setEsCliente(rs.getBoolean("esCliente"));
                empleado.setHabilitado(rs.getBoolean("habilitado"));
                empleados.add(empleado);
            }
            con.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return empleados;
    }

    public static Empleado getEmpleado(int idPersona) {
        Empleado empleado = new Empleado();
        Connection con = null;
        try {
            con = Conexion.getConnection();
            String sql = "SELECT * FROM Persona WHERE idPersona = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idPersona);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                empleado.setIdPersona(rs.getInt("idPersona"));
                empleado.setIdCargo(rs.getInt("idCargo"));
                empleado.setIdEspecialidad(rs.getInt("idEspecialidad"));
                empleado.setIdComuna(rs.getInt("idComuna"));
                empleado.setRut(rs.getInt("rut"));
                empleado.setDigito(rs.getString("digito"));
                empleado.setNombre(rs.getString("nombre"));
                empleado.setApellido(rs.getString("apellido"));
                empleado.setSueldo(rs.getInt("sueldo"));
                empleado.setEsCliente(rs.getBoolean("esCliente"));
                empleado.setHabilitado(rs.getBoolean("habilitado"));
            }
            con.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return empleado;
    }

    public static boolean insertEmpleado(Empleado empleado) {
        boolean insert = false;
        Connection con = null;
        try {
            con = Conexion.getConnection();
            String sql = "INSERT INTO Persona (idCargo, idEspecialidad, idComuna, rut, digito, nombre, apellido, sueldo, esCliente, habilitado) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, empleado.getIdCargo());
            ps.setInt(2, empleado.getIdEspecialidad());
            ps.setInt(3, empleado.getIdComuna());
            ps.setInt(4, empleado.getRut());
            ps.setString(5, empleado.getDigito());
            ps.setString(6, empleado.getNombre());
            ps.setString(7, empleado.getApellido());
            ps.setInt(8, empleado.getSueldo());
            ps.setBoolean(9, empleado.isEsCliente());
            ps.setBoolean(10, empleado.isHabilitado());
            ps.executeUpdate();
            insert = true;
            con.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return insert;
    }

    public static boolean updateEmpleado(Empleado empleado) {
        boolean update = false;
        Connection con = null;
        try {
            con = Conexion.getConnection();
            String sql = "UPDATE Persona SET idCargo = ?, idEspecialidad = ?, idComuna = ?, rut = ?, digito = ?, nombre = ?, apellido = ?, sueldo = ?, esCliente = ?, habilitado = ? WHERE idPersona = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, empleado.getIdCargo());
            ps.setInt(2, empleado.getIdEspecialidad());
            ps.setInt(3, empleado.getIdComuna());
            ps.setInt(4, empleado.getRut());
            ps.setString(5, empleado.getDigito());
            ps.setString(6, empleado.getNombre());
            ps.setString(7, empleado.getApellido());
            ps.setInt(8, empleado.getSueldo());
            ps.setBoolean(9, empleado.isEsCliente());
            ps.setBoolean(10, empleado.isHabilitado());
            ps.setInt(11, empleado.getIdPersona());
            ps.executeUpdate();
            update = true;
            con.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return update;
    }

    public static boolean deleteEmpleado(int idPersona) {
        boolean delete = false;
        Connection con = null;
        try {
            con = Conexion.getConnection();
            String sql = "DELETE FROM Persona WHERE idPersona = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idPersona);
            ps.executeUpdate();
            delete = true;
            con.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return delete;
    }
}