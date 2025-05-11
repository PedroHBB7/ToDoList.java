import java.sql.Connection;
import java.sql.DriverManager;

public class Database {
    public static Connection conectar() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/todolist", "root", ""); // ajuste a senha se tiver
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
