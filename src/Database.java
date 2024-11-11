import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {
    private String driver = "jdbc:postgresql://";
    private String host = "localhost"; //iP
    private String porto = "5432";
    private String sid = "postgres";
    private String usuario = "postgres";
    private String password = "admin";
    private String url = driver + host + ":" + porto + "/" + sid;

    public Connection connect() {
        Connection conn = null;

        try{
            conn = DriverManager.getConnection(url,usuario,password);
            System.out.println("CONEXION INICIADA");
        }catch (SQLException e) {
            System.err.println(e.getMessage());
        }

        return conn;
    }
}
