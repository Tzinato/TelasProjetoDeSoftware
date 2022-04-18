
package DAO;
import Conexao.conexao;
import Model.Player;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.util.List;

public class PlayerDAO {
    public void inserirPlayer (Player p){
        try {
        String SQL = "INSERT INTO thaleszd.player (nome, email, senha) VALUES (?,?,?)";
        Connection minhaConexao = conexao.getConexao();
        PreparedStatement comando = minhaConexao.prepareStatement(SQL);
        comando.setString(1, p.getNomep());
        comando.setString(2, p.getEmail());
        comando.setString(3, p.getSenha());
        int retorno = comando.executeUpdate();
        if(retorno>0){
            JOptionPane.showMessageDialog(null, "Player " +p.getNomep()+ " inserido com sucesso." );
        }
        else{
            JOptionPane.showMessageDialog(null, "Erro ao inserir o Player " +p.getNomep()+ ", verifique os LOGS.");
        }
        } catch (SQLException ex) {
            Logger.getLogger(PlayerDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public List <Player> listaDePlayer(){
        try {
            String SQL="SELECT nome, email, senha  FROM thaleszd.player";
            List <Player>listaDePlayer = new ArrayList<Player>();
            Connection c =conexao.getConexao();
            PreparedStatement ps=c.prepareStatement(SQL);
            ResultSet resultado = ps.executeQuery();
            while(resultado.next()){
                Player atual=new Player();
                atual=this.pegaDados(resultado);
                listaDePlayer.add(atual);
            }

            return listaDePlayer;
        } catch (SQLException ex) {
            Logger.getLogger(PlayerDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    private Player pegaDados(ResultSet resultado){
        try {
            Player atual=new Player();
            atual.setNomep (resultado.getString("nome"));
            atual.setEmail(resultado.getString("email"));
            atual.setSenha(resultado.getString("senha"));
            return atual;
        } catch (SQLException ex) {
            Logger.getLogger(PlayerDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
