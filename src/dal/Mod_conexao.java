package dal;
import java.sql.*;

public class Mod_conexao {
    public static Connection  conector(){
        java.sql.Connection conexao = null;

        String driver = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3307/bd_store";
        
        String user ="root";
        String password = "";
        
        try{
            Class.forName(driver);
            conexao = DriverManager.getConnection(url,user,password);
            return conexao;
        }
        catch (Exception e){
            return null;
        }
   }
}
