package DAO;

import Model.Turma;
import Utils.ConexaoBanco;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class TurmaDAO {
    public static ArrayList<Turma> buscarTodasTurmas(int id){
        String sql = "SELECT * FROM turma WHERE id_professor = ?";
        ArrayList<Turma> turmas = new ArrayList<>();
        try(PreparedStatement stm = ConexaoBanco.getConexao().prepareStatement(sql)){
            stm.setInt(1, id);  
            ResultSet resultado = stm.executeQuery();
            while(resultado.next()){
                int numero = resultado.getInt("numero");
                String nome = resultado.getString("nome");
                turmas.add(new Turma(numero, nome));
            }
            
            return turmas;
        }catch(SQLException error){
            System.out.println("ERROUUUUUU");
        }
        return turmas;
    }
    
    public static boolean deletarTurma(int numero){
        String sql = "DELETE FROM turma WHERE numero = ?";
        try(PreparedStatement stm = ConexaoBanco.getConexao().prepareStatement(sql)){
            stm.setInt(1, numero);  
            stm.executeUpdate();
            return true;
        }catch(SQLException error){
            System.out.println(error);
        }
        return false;
    }
}
