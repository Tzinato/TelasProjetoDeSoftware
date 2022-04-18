
package Model;


public class Player {
   String nomep;
   String email;
   String senha;

    public Player() {
    }

    public Player(String nomep, String email, String senha) {
        this.nomep = nomep;
        this.email = email;
        this.senha = senha;
    }

    public String getNomep() {
        return nomep;
    }

    public void setNomep(String nomep) {
        this.nomep = nomep;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
   
}
