
package Model;


public class Jogo {
    String nomej;
    int codjogo;

    public Jogo() {
    }

    public Jogo(String nomej, int codjogo) {
        this.nomej = nomej;
        this.codjogo = codjogo;
    }

    public String getNomej() {
        return nomej;
    }

    public void setNomej(String nomej) {
        this.nomej = nomej;
    }

    public int getCodjogo() {
        return codjogo;
    }

    public void setCodjogo(int codjogo) {
        this.codjogo = codjogo;
    }
    
}
