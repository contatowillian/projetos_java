package dao;

import factory.ConnectionFactory;

import java.sql.*;
import java.sql.PreparedStatement;

public class LoginDAO {
    private Connection connection;
    String login;
    String senha;
    String Teste;
    String id;
    boolean Retorno;

    private Statement statement = null;
    private PreparedStatement preparedStatement = null;
    private ResultSet resultSet = null;
   

    public LoginDAO(){
       this.connection = new ConnectionFactory().getConnection();
    }

    public boolean adiciona(String login,String senha){

        String sql = "SELECT `id` FROM `usuario` where login = '"+login+"' and  senha = '"+senha+"'"; 

        try {
           PreparedStatement stmt = connection.prepareStatement(sql);
           
           preparedStatement = connection.prepareStatement(sql);
           resultSet  = preparedStatement.executeQuery();
        
            while (resultSet.next()) {
               Retorno = true;
            }
           
           
            
            
           stmt.execute();
           stmt.close();

        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
     
        return Retorno;
     
    }
}