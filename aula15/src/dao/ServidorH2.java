package dao;

import config.ConfigJDBC;
import model.Paciente;

import java.sql.Connection;
import java.sql.Statement;

public class ServidorH2 implements IDao<Paciente>{
    private ConfigJDBC config = new ConfigJDBC();


    @Override
    public Paciente insert(Paciente paciente) {
        String query = String.format("INSERT INTO Paciente VALUES(%s, %s, %s, %s, %s)",
                paciente.getNome(),
                paciente.getSobrenome(),
                paciente.getRg(),
                paciente.getDataCadastro(),
                paciente.getEndereco());

        try {
            Connection connection = config.getConnectionH2();
            Statement statement = connection.createStatement();
            statement.execute(query);
            statement.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return paciente;
    }

    @Override
    public void update(Integer id) {

    }

    @Override
    public void delete(Integer id) {

    }

    @Override
    public void select(Integer id) {

    }

    @Override
    public void selectAll() {

    }
}
