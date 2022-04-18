
package DAO;
import Conexao.conexao;
import Model.Personagem;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.util.List;

public class PersonagemDAO {
    public void inserirPersonagem (Personagem p){
        try {
        String SQL = "INSERT INTO thaleszd.personagem (skill, sexo, inteligencia, mana, forca, ataque1, ataque2, player) VALUES (?,?,?,?,?,?,?,?)";
        Connection minhaConexao = conexao.getConexao();
        PreparedStatement comando = minhaConexao.prepareStatement(SQL);
        comando.setString(1, p.getSkill());
        comando.setString(2, p.getSexo());
        comando.setInt(3, p.getInteligencia());
        comando.setInt(4, p.getMana());
        comando.setInt(5, p.getForca());
        comando.setString(6, p.getAtaque1());
        comando.setString(7, p.getAtaque2());
        comando.setString(8, p.getPlayer());
        int retorno = comando.executeUpdate();
        if(retorno>0){
            JOptionPane.showMessageDialog(null, "Personagem inserido com sucesso." );
        }
        else{
            JOptionPane.showMessageDialog(null, "Erro ao inserir o personagem, verifique os LOGS.");
        }
        } catch (SQLException ex) {
            Logger.getLogger(PersonagemDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
