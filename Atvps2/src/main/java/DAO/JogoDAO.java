
package DAO;
import Conexao.conexao;
import Model.Jogo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.util.List;

public class JogoDAO {
    public void inserirJogo (Jogo j){
        try {
        String SQL = "INSERT INTO thaleszd.jogo (nome, jogo) VALUES (?,?)";
        Connection minhaConexao = conexao.getConexao();
        PreparedStatement comando = minhaConexao.prepareStatement(SQL);
        comando.setString(1, j.getNomej());
        comando.setInt(2, j.getCodjogo());
        int retorno = comando.executeUpdate();
        if(retorno>0){
            JOptionPane.showMessageDialog(null, "Jogo " +j.getNomej()+ " inserido com sucesso." );
        }
        else{
            JOptionPane.showMessageDialog(null, "Erro ao inserir o Jogo " +j.getNomej()+ ", verifique os LOGS.");
        }
        } catch (SQLException ex) {
            Logger.getLogger(JogoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
