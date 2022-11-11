package Data;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import Model.Candidato;
import Model.Cargo;
import Model.Partido;

public class CandidatoSQLiteDAO implements CandidatoDAO{

	@Override
	public void salvar(Candidato candidato) {
		String sql = "INSERT INTO candidato values (?,?,?,?)";
        try(PreparedStatement stmt=ConnectionFactory.criaStatement(sql)){
            stmt.setInt(1,candidato.getNumero());
            stmt.setString(2,candidato.getNome());
            stmt.setInt(3,candidato.getPartido().getNumero());
            stmt.setInt(4,candidato.getCargo().getIdCargo());
            stmt.executeUpdate();
        }catch (SQLException e) {
            e.printStackTrace();
        }
	}

	@Override
	public void atualizar(Candidato candidato) {
		String sql = "UPDATE candidato SET nome=?,partido=?,cargo=? WHERE numero=?";
        try(PreparedStatement stmt=ConnectionFactory.criaStatement(sql)){            
            stmt.setString(1,candidato.getNome());
            stmt.setInt(2,candidato.getPartido().getNumero());
            stmt.setInt(3,candidato.getCargo().getIdCargo());
            stmt.setInt(4,candidato.getNumero());
            stmt.executeUpdate();
        }catch (SQLException e) {
            e.printStackTrace();
        }
	}

	@Override
	public void apagar(Candidato candidato) {
		String sql = "DELETE FROM candidato WHERE numero=?";

        try(PreparedStatement stmt = ConnectionFactory.criaStatement(sql)){
            stmt.setInt(1,candidato.getNumero());
            stmt.executeUpdate();
        }catch (SQLException e) {
            e.printStackTrace();
        }
	}

	@Override
	public Candidato buscar(int id) {
		String sql = "SELECT * FROM candidato WHERE numero=?";
        Candidato candidato=null;
       try (PreparedStatement stmt = ConnectionFactory.criaStatement(sql)){
           stmt.setInt(1,id);
           ResultSet rs = stmt.executeQuery();
           while (rs.next()) {        	   
        	   Cargo cargo = new CargoSQLiteDAO().buscar(rs.getInt("cargo"));
        	   Partido partido = new PartidoSQLiteDAO().buscar(rs.getInt("partido"));        	   
        	   candidato = new Candidato(rs.getInt("numero"), rs.getString("nome"), cargo, partido);
           }

       } catch (SQLException e) {
            e.printStackTrace();
        }
        return candidato;
	}

	@Override
	public List<Candidato> buscarTodos() {
		String sql = "SELECT * FROM candidato";
        List<Candidato> listaCandidatos=new ArrayList<>();
        try(PreparedStatement stmt = ConnectionFactory.criaStatement(sql)){
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
            	Cargo cargo = new CargoSQLiteDAO().buscar(rs.getInt("cargo"));
         	    Partido partido = new PartidoSQLiteDAO().buscar(rs.getInt("partido"));        	   
         	    Candidato candidato = new Candidato(rs.getInt("numero"), rs.getString("nome"), cargo, partido);
                listaCandidatos.add(candidato);
            }
        }
         catch (SQLException e) {
            e.printStackTrace();
        }
        return listaCandidatos;
	}

}
