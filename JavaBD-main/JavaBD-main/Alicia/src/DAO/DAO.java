package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class DAO {

	private String user = "root";
	private String psw = "admin";
	private String path = "jdbc:mysql://localhost:3306/bd_53";

	int filas;
	private String nombre;
	private String dni;

	public Connection conectar() {
		Connection conexion = null;
		try {
			conexion = DriverManager.getConnection(path, user, psw);

			System.out.println("se conecto");
		} catch (SQLException e) {
			e.printStackTrace();

		}

		return conexion;
	}

	public void agregar() {
		String sql = "INSERT INTO `tabla`(`id`,`nombre`,`dni`)VALUES(1,'Lautaro',12345678) , (2,'Yamile',48856758) ;";
		Connection conexion = null;
		try {
			conexion = conectar();
			Statement stnt = conexion.createStatement();
			filas = stnt.executeUpdate(sql);
			System.out.println(filas);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				conexion.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}

	}
	
	public void eliminar(String dni)
	{
		String sql = "DELETE FROM `tabla`WHERE dni = ? ";
		Connection conexion = null;
		try {
			conexion = conectar();
			PreparedStatement stnt = conexion.prepareStatement(sql);
			stnt.setString(1,dni);
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				conexion.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}
	}
	
	
	
	public void actualizar()
	{
		String sql = "UPDATE `tabla` SET `nombre` = 'Rubi', `dni` = 12345678 WHERE `id` = 2;";
		Connection conexion = null;
		try {
			conexion = conectar();
			Statement stnt = conexion.createStatement();
			filas = stnt.executeUpdate(sql);
			System.out.println("se actualizo");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				conexion.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}
	}
	public ArrayList<String> consultar()
	{
		String sql = "SELECT nombre FROM tabla WHERE id = 2";
		Connection conexion = null;
		ArrayList<String> solucion = new ArrayList<>();
		try {
			conexion = conectar();
			Statement stnt = conexion.createStatement();
			ResultSet rs = stnt.executeQuery(sql);
			while(rs.next())
			{
				String nombre = rs.getString("nombre");
				solucion.add(nombre);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				conexion.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}
		return solucion;
		
	}
	public Persona consultarParametrizable(String dni )
	{
		String sql = "SELECT nombre FROM tabla WHERE dni = ?";
		Connection conexion = null;
		
		try {
			conexion = conectar();
			PreparedStatement stnt = conexion.prepareStatement(sql);
			stnt.setString (1, dni);
		    
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				conexion.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}
		
		
	
		
	}
	public void agregarPersonas(Persona p )
	{
		String sql = "INSERT INTO `tabla`(`nombre`)VALUES(?);";
		Connection conexion = null;
		
		try {
			conexion = conectar();
			PreparedStatement stnt = conexion.prepareStatement(sql);
			stnt.setString(1, p.getNombre());
			stnt.executeUpdate();
		
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				conexion.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}
	}

}
