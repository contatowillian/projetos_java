
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gui;
import dao.AlteraUsuarioDAO;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.*;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import factory.ConnectionFactory;
import dao.PesquisaUsuarioDAO;
import dao.ExcluiUsuarioDAO;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;


/**
 *
 * @author willian.batista
 */
public class AlteraUsuarios extends javax.swing.JFrame {
    
    JButton botao_alterar;
    JTextField campo_nome;
    JTextField campo_cpf;
    JTextField campo_email;
    JTextField campo_telefone;
    JTextField campo_login;
    JLabel texto_busca_nome;
    JLabel Label_cadastro_usuario;
    JLabel Label_dados_formulario;
    JLabel texto_cadastro_cpf;
    JLabel texto_cadastro_email;
    JLabel texto_cadastro_telefone;
    JLabel texto_cadastro_login;
    JButton Alterar ;
    String codigo_usuario;
    
    

    
    JComboBox comboStatus = new JComboBox();
    
    private JButton botao;
    //public String codigo_usuario = null;
    
    
    Container tela = getContentPane();

    /**
     * Creates new form AlteraUsuarios
     */
    public void AlteraUsuarios( String  codigo_usuario) {
        
         //Tamanho Da Janela
        //super("Pesquisa de Usuários");
        setLayout(null);
        
      
        
        Label_cadastro_usuario = new JLabel("Alteração de Usuários:");
        Label_cadastro_usuario.setFont(new Font("Arial", 0, 18));
        Label_cadastro_usuario.setForeground(Color.blue);
        //Label_cadastro_usuario.setFont();
        Label_cadastro_usuario.setBounds(15,10,300,20);
        tela.add(Label_cadastro_usuario);
        
        
        
        Label_dados_formulario = new JLabel("Dados do Formulário:");
        Label_dados_formulario.setFont(new Font("Arial", 0, 12));
       // Label_dados_formulario.setForeground(Color.blue);
        //Label_cadastro_usuario.setFont();
        Label_dados_formulario.setBounds(50,50,300,20);
        tela.add(Label_dados_formulario);
        
        
        
        
        
        
        //label busca nome
        texto_busca_nome = new JLabel("Nome:");
        texto_busca_nome.setBounds(50,100,300,30);
        tela.add(texto_busca_nome);
        
        
         //label busca cpf
        texto_cadastro_cpf = new JLabel("CPF:");
        texto_cadastro_cpf.setBounds(50,140,300,30);
        tela.add(texto_cadastro_cpf);
        
        
        //label busca email
        texto_cadastro_email = new JLabel("E-mail:");
        texto_cadastro_email.setBounds(50,180,300,30);
        tela.add(texto_cadastro_email);
        
        
        
        //label busca telefone
        texto_cadastro_telefone = new JLabel("Telefone:");
        texto_cadastro_telefone.setBounds(50,220,300,30);
        tela.add(texto_cadastro_telefone);
        
        
        
         //label busca telefone
        texto_cadastro_login = new JLabel("Login:");
        texto_cadastro_login.setBounds(50,260,300,30);
        tela.add(texto_cadastro_login);
        
        
        String valor_nome = new AlteraUsuarioDAO().getCampoUsuario("nome", codigo_usuario);
        //campo busca nome
        campo_nome = new JTextField(valor_nome);
        campo_nome.setBounds(100,100,180,30);
        //busca_nome.setSize(200, 180);
        tela.add(campo_nome);

        
         String valor_cpf = new AlteraUsuarioDAO().getCampoUsuario("cpf", codigo_usuario);
        //campo busca cpf
        campo_cpf = new JTextField(valor_cpf);
        campo_cpf.setBounds(100,140,180,30);
        //busca_nome.setSize(200, 180);
        tela.add(campo_cpf);
        
        
        String valor_email = new AlteraUsuarioDAO().getCampoUsuario("email", codigo_usuario);
        //campo busca email
        campo_email = new JTextField(valor_email);
        campo_email.setBounds(100,180,180,30);
        //busca_nome.setSize(200, 180);
        tela.add(campo_email);
        
        
        
        String valor_telefone  = new AlteraUsuarioDAO().getCampoUsuario("telefone", codigo_usuario);
        //campo busca telefone
        campo_telefone = new JTextField(valor_telefone);
        campo_telefone.setBounds(100,220,180,30);
        //busca_nome.setSize(200, 180);
        tela.add(campo_telefone);
        
        
        
         
        String valor_login  = new AlteraUsuarioDAO().getCampoUsuario("login", codigo_usuario);
        //campo busca telefone
        campo_login = new JTextField(valor_login);
        campo_login.setBounds(100,260,180,30);
        //busca_nome.setSize(200, 180);
        tela.add(campo_login);
        
        //campo busca nome
        Alterar = new JButton("Alterar");
        Alterar.setBounds(100,320,100,30);
        //busca_nome.setSize(200, 180);
        tela.add(Alterar);
        
        
        
        
        //Cria o tamanho da janela
        setSize(400, 550);
        setVisible(true);
        setLocationRelativeTo(null);
       
    }
    
    
     
    

    
     
    
      
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AlteraUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AlteraUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AlteraUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AlteraUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new AlteraUsuarios(String codigo_usuario).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
