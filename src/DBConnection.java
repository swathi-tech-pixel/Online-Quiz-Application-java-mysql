import java.sql.*;

public class DBConnection {
    public static Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/quizdb3",
                "root",
                "swathi@596"
            );
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }
}
