import javax.xml.crypto.Data;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class adeptaSororitasCRUD {
    private Database db;
    //Create
    public void insertar(adeptaSororitas aS){
        String sql = "INSERT INTO adeptaSororitas(cod, nome, puntos) VALUES(?,?,?)";

        try{
            Connection conn = db.connect();

            PreparedStatement ps = conn.prepareStatement(sql);


        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }
}
