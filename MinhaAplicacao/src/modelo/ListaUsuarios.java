
package modelo;
/**
 *
 * @author alyssontmv@gmail.com
 */
public class ListaUsuarios {
    private String id;
    private String nome;
    private String cpf;
    private String email;
    private String login;


    public ListaUsuarios() {
        this.id=null;
        this.nome=null;
        this.cpf=null;
        this.email=null;
        this.login=null;
     
    }

    public ListaUsuarios(String id,String nome,String cpf,String email,String login) {
        this.id=id;
        this.nome=nome;
        this.cpf=cpf;
        this.email=email;
        this.login=login;
       
    }

    public String getid() {
        return id;
    }

    public void setid(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    
     public String getcpf() {
        return cpf;
    }

    public void setcpf(String cpf) {
        this.cpf = cpf;
    }
    

    public String getemail() {
        return email;
    }

    public void setemail(String email) {
        this.email = email;
    }
    
    public String getlogin() {
        return login;
    }

    public void setlogin(String login) {
        this.login = login;
    }

  
       

}
