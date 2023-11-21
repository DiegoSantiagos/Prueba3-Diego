package Controlador;

import BD.Conexion;
import Modelo.Empleado;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ControladorEmpleado {
    
    public boolean agregar(Empleado marca)
    {
        try{
            Conexion con = new Conexion();
            Connection cx = con.obtenerConexion();

            String sql = "INSERT INTO persona (idcargo, idespecialidad, idComuna, rut, digito, nombre, apellido, sueldo, esCliente) VALUES (?,?,?,?,?,?,?,?,Falce,?)";
            PreparedStatement st;

            st = cx.prepareStatement(sql);
            st.setString(1, marca.getNombre());
            st.setBoolean(2, marca.isHabilitado());
            
            st.executeUpdate();
            st.close(); // cierra declaración
            cx.close(); // cierra conexión a la BDD
            return true;
        } catch (SQLException ex)
        {
            System.out.println("Error: " + ex.getMessage());
        }
        return false;
    }
    public boolean actualizar(Empleado marca)
    {
        try{
            Conexion con = new Conexion();
            Connection cx = con.obtenerConexion();

            String sql = "UPDATE MARCA SET idcargo = ? idespecialidad = ? idComuna = ? rut = ? digito = ? nombre = ? apellido = ? sueldo = ? ";
            PreparedStatement st;

            st = cx.prepareStatement(sql);
            st.setString(1, marca.getNombre());
            st.setBoolean(2, marca.isHabilitado());
            st.setInt(3, marca.getIdEspecialidad());
            
            st.executeUpdate();
            st.close(); // cierra declaración
            cx.close(); // cierra conexión a la BDD
            return true;
        } catch (SQLException ex)
        {
            System.out.println("Error: " + ex.getMessage());
        }
        return false;
    }
    public boolean eliminar(int id)
    {
        try{
            Conexion con = new Conexion();
            Connection cx = con.obtenerConexion();

            String sql = "DELETE FROM MARCA WHERE ID = ?";
            PreparedStatement st;

            st = cx.prepareStatement(sql);
            st.setInt(1, id);
            
            st.executeUpdate();
            st.close(); // cierra declaración
            cx.close(); // cierra conexión a la BDD
            return true;
        } catch (SQLException ex)
        {
            System.out.println("Error: " + ex.getMessage());
        }
        return false;
    }
    public Empleado buscarPorId(int id)
    {
        try{
            Conexion con = new Conexion();
            Connection cx = con.obtenerConexion();

            String sql = "SELECT ID, NOMBRE, HABILITADO FROM MARCA WHERE ID=?";
            PreparedStatement st;

            st = cx.prepareStatement(sql);
            st.setInt(1, id);
            
            ResultSet rs = st.executeQuery();
            
            if(rs.next())
            {
                Empleado marca = new Empleado();
                marca.setId(rs.getInt("ID"));
                marca.setNombre(rs.getString("NOMBRE"));
                marca.setHabilitado(rs.getBoolean("HABILITADO"));
                return marca;
            }
            st.close(); // cierra declaración
            cx.close(); // cierra conexión a la BDD
            return null;
        } catch (SQLException ex)
        {
            System.out.println("Error: " + ex.getMessage());
        }
        return null;
    }
    public ArrayList<Empleado> buscarTodos()
    {
        ArrayList<Empleado> listado = new ArrayList<Empleado>();
        try{
            Conexion con = new Conexion();
            Connection cx = con.obtenerConexion();

            String sql = "SELECT ID, NOMBRE, HABILITADO FROM MARCA";
            PreparedStatement st;

            st = cx.prepareStatement(sql);           
            ResultSet rs = st.executeQuery();
            
            while(rs.next())
            {
                Empleado marca = new Empleado();
                marca.setId(rs.getInt("ID"));
                marca.setNombre(rs.getString("NOMBRE"));
                marca.setHabilitado(rs.getBoolean("HABILITADO"));
                listado.add(marca);
            }
            st.close(); // cierra declaración
            cx.close(); // cierra conexión a la BDD
        } catch (SQLException ex)
        {
            System.out.println("Error: " + ex.getMessage());
        }
        return listado;
    }
}
