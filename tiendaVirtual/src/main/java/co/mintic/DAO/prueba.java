package co.mintic.DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class prueba {

	public static void main(String[] args) throws SQLException 
	{
		Conexion c=new Conexion();
		//c.getConnection();
		
		//Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/prueba", "root","root");
		Statement sentencia = c.getConnection().createStatement();
		String nombre="Any";
		String consulta = "SELECT * FROM clientes ";
		ResultSet rs=sentencia.executeQuery(consulta);
		//System.out.println(rs);
		
		while (rs.next())
		{
		    System.out.println ("Cedula : "+rs.getInt(1) + " Direccion : " + rs.getString (2)+ " Correo : " + rs.getNString(3)+ " Nombre :" + rs.getString(4)+" Telefono : "+ rs.getString(5));
		}
		
	
	/*	
		PreparedStatement psInsertar =null;
		String consultaCreacion = "INSERT INTO clientes VALUES (?,?,?,?,?)";
		psInsertar = c.getConnection().prepareStatement(consultaCreacion);
		
		psInsertar.setInt(1, 103);
		psInsertar.setString(2, "cll 155 #15-30");
		psInsertar.setString(3, "lina@gmail.com");
		psInsertar.setString(4, "Lina Paez");
		psInsertar.setString(5, "3124589630");
		psInsertar.executeUpdate(); // Se ejecuta la inserción.*/
		
		
	}

}
