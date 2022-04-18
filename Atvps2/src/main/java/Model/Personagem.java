
package Model;


public class Personagem {
    String skill;
    String sexo;
    int inteligencia;
    int mana;
    int forca;
    String ataque1;
    String ataque2;
    String player;
    int jogo;

    public Personagem() {
    }

    public Personagem(String skill, String sexo, int inteligencia, int mana, int forca, String ataque1, String ataque2) {
        this.skill = skill;
        this.sexo = sexo;
        this.inteligencia = inteligencia;
        this.mana = mana;
        this.forca = forca;
        this.ataque1 = ataque1;
        this.ataque2 = ataque2;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getInteligencia() {
        return inteligencia;
    }

    public void setInteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public int getForca() {
        return forca;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }

    public String getAtaque1() {
        return ataque1;
    }

    public void setAtaque1(String ataque1) {
        this.ataque1 = ataque1;
    }

    public String getAtaque2() {
        return ataque2;
    }

    public void setAtaque2(String ataque2) {
        this.ataque2 = ataque2;
    }

    public String getPlayer() {
        return player;
    }

    public void setPlayer(String player) {
        this.player = player;
    }

    public int getJogo() {
        return jogo;
    }

    public void setJogo(int jogo) {
        this.jogo = jogo;
    }
    
}
