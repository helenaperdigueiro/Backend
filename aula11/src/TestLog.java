import java.sql.*;

public class TestLog {

    private static final String sqlCreate = "CREATE TABLE Animal (Id INT PRIMARY KEY, Nome VARCHAR(100) NOT NULL, Tipo VARCHAR(120) NOT NULL)";
    private static final String sqlDrop = "DROP TABLE IF EXISTS Animal";
    private static final String sqlInsert = "INSERT INTO Animal (Id, Nome, Tipo) VALUES (1, 'Kal', 'Cachorro')";
    private static final String sqlInsert2 = "INSERT INTO Animal (Id, Nome, Tipo) VALUES (2, 'Buda', 'Cachorro')";
    private static final String sqlInsert3 = "INSERT INTO Animal (Id, Nome, Tipo) VALUES (3, 'Sakura', 'Cachorro')";
    private static final String sqlInsert4 = "INSERT INTO Animal (Id, Nome, Tipo) VALUES (4, 'Hinata', 'Cachorro')";
    private static final String sqlInsert5 = "INSERT INTO Animal (Id, Nome, Tipo) VALUES (5, 'Javascript', 'Papagaio')";
    private static final String sqlDelete = "DELETE FROM Animal WHERE Id = 5";
    private static final String sqlSelect = "SELECT * FROM Animal";

    public static void main(String[] args) {
        Connection connection = null;

        try {
            connection = getConnection();
            Statement statement = connection.createStatement();
            statement.execute(sqlDrop);
            statement.execute(sqlCreate);
            statement.execute(sqlInsert);
            statement.execute(sqlInsert2);
            statement.execute(sqlInsert3);
            statement.execute(sqlInsert4);
            statement.execute(sqlInsert5);
            MostrarAnimais(connection);
            statement.execute(sqlDelete);
            MostrarAnimais(connection);

        } catch (Exception e){
            e.printStackTrace();
        }


//        Class.forName("org.h2.Driver");
//        Connection con = DriverManager.getConnection("jdbc:h2:" + "E:/DH/3o_bimestre/Backend/aula11/Database", "HELENA", "1234");
//        Statement stmt = con.createStatement();
//
//        String insertSql = "INSERT INTO TEST VALUES(1, 'Hello');\n" +
//                "INSERT INTO TEST VALUES(2, 'World');\n";
//        stmt.execute(insertSql);
//
//        String sql = "SELECT * FROM TEST";
//
//        ResultSet rd = stmt.executeQuery(sql);
//        while(rd.next()) {
//            System.out.println(rd.getInt(1) + rd.getString(2));
        }

        private static void MostrarAnimais(Connection connection) throws SQLException {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sqlSelect);
            System.out.println("*****");
            while(resultSet.next()) {
                System.out.println(resultSet.getInt(1) + " " + resultSet.getString(2) + " " + resultSet.getString(3));
            }
        }

        public static Connection getConnection() throws Exception {
        Class.forName("org.h2.Driver");
        return DriverManager.getConnection("jdbc:h2:tcp://localhost/mem:testdb", "sa", "");
    }
}