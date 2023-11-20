package DAO;

import Model.Professor;
import Utils.ConexaoBanco;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ProfessorDAO {
    public static Professor buscarProfessorPorEmail(String email){
        String sql = "SELECT * FROM professor WHERE email = ?";
        try (PreparedStatement stm = ConexaoBanco.getConexao().prepareStatement(sql)){
            stm.setString(1, email);
            ResultSet rs = stm.executeQuery();
            if(rs.next()){
                int id = rs.getInt("id");
                String nome = rs.getString("nome");
                String senha = rs.getString("senha");
                return new Professor(id, nome, email, senha);
            }
        }catch (SQLException e){
            System.out.println("DEU RUIM");
            return null;
        }
        
        return null;
    }
}
