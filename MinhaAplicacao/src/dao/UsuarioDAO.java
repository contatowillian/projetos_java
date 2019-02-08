package dao;


import factory.ConnectionFactory;
import java.sql.*;
import java.sql.PreparedStatement;
import modelo.Usuario;

public class UsuarioDAO {
    private Connection connection;
    Long id;
    String nome;
    String cpf;
    String email;
    String telefone;
    String sexo;

    public UsuarioDAO(){
       this.connection = new ConnectionFactory().getConnection();
    }

    public void adiciona(Usuario usuario){

        String sql = "INSERT INTO usuario(nome,cpf,email,telefone,sexo) VALUES(?,?,?,?,?)";
        try {

           PreparedStatement stmt = connection.prepareStatement(sql);
           
           stmt.setString(1, usuario.getNome());
           stmt.setString(2, usuario.getCpf());
           stmt.setString(3, usuario.getEmail());
           stmt.setString(4, usuario.getTelefone());
           stmt.setString(5, usuario.getsexo());
           stmt.execute();
           stmt.close();

        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
    }
}