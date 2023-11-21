package Model;

import org.mindrot.jbcrypt.BCrypt;

public class Professor {
    private int id;
    private String nome;
    private String email;
    private String senha;

    public Professor(int id, String nome, String email, String senha) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }
    
    public Professor(String nome, String email, String senha){
        this.nome = nome;
        this.email = email;
        this.senha = BCrypt.hashpw(senha, BCrypt.gensalt());
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }
 
}
