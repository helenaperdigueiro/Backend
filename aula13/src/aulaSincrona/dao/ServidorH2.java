package aulaSincrona.dao;

import aulaSincrona.config.ConfigJDBC;
import aulaSincrona.model.Medicamento;
import org.apache.log4j.Logger;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.concurrent.ExecutionException;

public class ServidorH2 implements IDao<Medicamento>{
    private ConfigJDBC config = new ConfigJDBC();

    private static final Logger logger = Logger.getLogger(ServidorH2.class);

    @Override
    public Medicamento insert(Medicamento medicamento) {
        String query = String.format("INSERT INTO Medicamento VALUES('%s', '%s', '%s', '%s', '%s', '%s')",
                medicamento.getId(),
                medicamento.getCodigoNumerico(),
                medicamento.getNome(),
                medicamento.getLaboratorio(),
                medicamento.getQuantidade(),
                medicamento.getPreco());

        try {
            Connection connection = config.getConnectionH2();
            Statement statement = connection.createStatement();
            statement.execute(query);
            statement.close();
            logger.info(String.format("Medicamento com nome %s foi incluído", medicamento.getNome()));
        } catch (Exception e) {
            e.printStackTrace();
        }

        return medicamento;
    }

    @Override
    public void delete(Integer id) {
        String query = String.format("DELETE FROM Medicamento WHERE id = %s", id);

        try {
            Connection connection = config.getConnectionH2();
            Statement statement = connection.createStatement();
            statement.execute(query);
            statement.close();
            logger.info(String.format("Medicamento com id %s foi deletado", id));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void select(Integer id) {
        String query = String.format("SELECT * FROM Medicamento WHERE id = %s", id);

        try {
            Connection connection = config.getConnectionH2();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                logger.info("*****");
                logger.info(String.format("%s \n%s \n%s \n%s \n%s \n%s",
                        resultSet.getInt(1),
                        resultSet.getString(2),
                        resultSet.getString(3),
                        resultSet.getString(4),
                        resultSet.getInt(5),
                        resultSet.getDouble(6)));
                logger.info("*****");
            }
            statement.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void selectAll() {
        String query = String.format("SELECT * FROM Medicamento");

        try {
            Connection connection = config.getConnectionH2();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                logger.info("*****");
                logger.info(String.format("%s \n%s \n%s \n%s \n%s \n%s",
                        resultSet.getInt(1),
                        resultSet.getString(2),
                        resultSet.getString(3),
                        resultSet.getString(4),
                        resultSet.getInt(5),
                        resultSet.getDouble(6)));
                logger.info("*****");
            }
            statement.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Override
    public void selectCodigo(String codigo) {
        String query = String.format("SELECT * FROM Medicamento WHERE codigoNumerico = %s", codigo);

        try {
            Connection connection = config.getConnectionH2();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                logger.info("*****");
                logger.info(String.format("%s \n%s \n%s \n%s \n%s \n%s",
                        resultSet.getInt(1),
                        resultSet.getString(2),
                        resultSet.getString(3),
                        resultSet.getString(4),
                        resultSet.getInt(5),
                        resultSet.getDouble(6)));
                logger.info("*****");
            }
            statement.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
