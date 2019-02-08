package dao;

import factory.ConnectionFactory;

import java.sql.*;
import java.sql.PreparedStatement;

public class ExcluiUsuarioDAO {
    private Connection connection;
   
    int usuario_id;
    boolean Retorno;
    int ResultSet;

    private Statement statement = null;
    private PreparedStatement preparedStatement = null;

   

    public ExcluiUsuarioDAO(){
       this.connection = new ConnectionFactory().getConnection();
    }

    public boolean Deleta_Usuario(String usuario_id){

        String sql = "delete FROM `usuario` where id = '"+usuario_id+"' limit 1"; 

        try {
           PreparedStatement stmt = connection.prepareStatement(sql);
           
           preparedStatement = connection.prepareStatement(sql);
           preparedStatement.executeUpdate();

           stmt.execute();
           stmt.close();

        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
     
        return true;
     
    }
}