package les_25_db_intro;

import java.sql.*;

public class TestDB {
    public static void main(String[] args) throws ClassNotFoundException {
        Class.forName("org.h2.Driver");

        try (Connection connection = DriverManager.getConnection("jdbc:h2:mem:test");
             Statement statement = connection.createStatement()
        ) {
            // create table, fields: user (String), id (int)

            statement.execute("CREATE TABLE users(id INTEGER PRIMARY KEY AUTO_INCREMENT, name VARCHAR(50))");

            // insert data
            statement.execute("INSERT INTO users (name) VALUES ('Jim')");

            statement.execute("INSERT INTO users (name) VALUES ('Dean'),('Bob'),('Tom'),('Don')");

            ResultSet resultSet1 = statement.executeQuery("SELECT * FROM users");
            while (resultSet1.next()){
                System.out.println(resultSet1.getInt("id")+" "
                        +resultSet1.getString("name"));
            }

            ResultSet resultSet2 = statement.executeQuery("SELECT * FROM users WHERE name LIKE '%o%'");

            while (resultSet2.next()){
                System.out.println(resultSet2.getInt("id")+" "
                +resultSet2.getString("name"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
