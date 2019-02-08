package com.wordpress.alyssontmv.controller;

import com.wordpress.alyssontmv.model.Aluno;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author alyssontmv@gmail.com
 */
public class AlunoBD {

    Connection connection = null;

    public boolean inserirAluno(Aluno aluno) {
        System.out.println("inserirAluno");
        // inicia a conexao com o Banco de dados chamando
        // a classe Conexao
        connection = Conexao.getInstance().getConnection();
        System.out.println("conectado e preparando para inserir");
        Statement stmt = null;
        try {
            stmt = connection.createStatement();

            String sql = "INSERT INTO aluno (codaluno,nomaluno) VALUES (" + aluno.getCodigo() + ",'" + aluno.getNome() + "');";
            System.out.println("SQL: " + sql);
            stmt.executeUpdate(sql);
            // Incluindo alunos na listaAlunos que vai ser retornada
            return true;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
        } finally {
            // este bloco finally sempre executa na instrução try para
            // fechar a conexão a cada conexão aberta
            try {
                stmt.close();
                connection.close();
            } catch (SQLException e) {
                System.out.println("Erro ao desconectar" + e.getMessage());
            }
        }
    } // fim do metodo InserirAluno

    public boolean atualizarAluno(Aluno aluno) {
        System.out.println("atualizarAluno");
        // inicia a conexao com o Banco de dados chamando
        // a classe Conexao
        connection = Conexao.getInstance().getConnection();
        System.out.println("conectado e preparando para atualizar");
        Statement stmt = null;
        try {
            stmt = connection.createStatement();

            String sql = "UPDATE aluno SET nomaluno = '" + aluno.getNome() + "' WHERE codaluno = " + aluno.getCodigo() + ";";
            System.out.println("SQL: " + sql);
            stmt.executeUpdate(sql);
            // Incluindo alunos na listaAlunos que vai ser retornada
            return true;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
        } finally {
            // este bloco finally sempre executa na instrução try para
            // fechar a conexão a cada conexão aberta
            try {
                stmt.close();
                connection.close();
            } catch (SQLException e) {
                System.out.println("Erro ao desconectar" + e.getMessage());
            }
        }
    } // fim do metodo atualizarAluno

    /**
     * Este metodo conecta no banco e retorna uma ArrayList de alunos
     * @return ArrayList de alunos
     */
    public ArrayList<Aluno> getListaAlunos() {
        ArrayList<Aluno> listaAlunos = new ArrayList<Aluno>();
        // iniciando a conexao
        connection = Conexao.getInstance().getConnection();
        System.out.println("conectado e preparando listagem");
        Statement stmt = null;
        try {
            stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM aluno ORDER BY codaluno");
            // Incluindo alunos na listaAlunos que vai ser retornada
            while (rs.next()) {
                Aluno aluno = new Aluno(rs.getInt("codaluno"), rs.getString("nomaluno"));
                listaAlunos.add(aluno);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return null;
        } finally {
            // este bloco finally sempre executa na instrução try para
            // fechar a conexão a cada conexão aberta
            try {
                stmt.close();
                connection.close();
            } catch (SQLException e) {
                System.out.println("Erro ao desconectar" + e.getMessage());
            }
        }
        return listaAlunos;
    } // final do metodo

    // deleta aluno
    public boolean excluirAluno(Aluno aluno) {
        System.out.println("excluirAluno");
        // inicia a conexao com o Banco de dados chamando
        // a classe Conexao
        connection = Conexao.getInstance().getConnection();
        System.out.println("conectado. Preparando para excluir");
        Statement stmt = null;
        try {
            stmt = connection.createStatement();

            String sql = "DELETE FROM aluno WHERE codaluno = " + aluno.getCodigo() + ";";
            System.out.println("SQL: " + sql);
            stmt.executeUpdate(sql);
            // Incluindo alunos na listaAlunos que vai ser retornada
            return true;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return false;
        } finally {
            // este bloco finally sempre executa na instrução try para
            // fechar a conexão a cada conexão aberta
            try {
                stmt.close();
                connection.close();
            } catch (SQLException e) {
                System.out.println("Erro ao desconectar" + e.getMessage());
            }
        }
    }
}
