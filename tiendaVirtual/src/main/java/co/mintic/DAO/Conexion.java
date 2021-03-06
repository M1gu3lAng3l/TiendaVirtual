package co.mintic.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion 
{
	static String bd = "tienda";
    static String login = "root";
    static String password = "Logysto2021";
    static String url = "jdbc:mysql://localhost:3307/"+bd;

    Connection conexion = null;

    public Conexion()
    {
        try{

            //obtenemos la conexión
            conexion = DriverManager.getConnection(url,login,password);

            if (conexion!=null)
            {
                System.out.println("Conexion  a base de datos "+bd+" OK");
            }
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }catch(Exception e)
        {
            System.out.println(e);
        }
    }

    /**Permite retornar la conexión*/
    public Connection getConnection()
    {
        return conexion;
    }

    public void desconectar()
    {
        conexion = null;
    }
}
