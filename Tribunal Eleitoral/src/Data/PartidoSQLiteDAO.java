package Data;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import Model.Partido;

public class PartidoSQLiteDAO implements PartidoDAO {

	@Override
	public void salvar(Partido partido) {
		String sql = "INSERT INTO partido values (?,?,?)";
        try(PreparedStatement stmt=ConnectionFactory.criaStatement(sql)){
            stmt.setInt(1,partido.getNumero());
            stmt.setString(2,partido.getNome());
            stmt.setString(3,partido.getSigla());
            stmt.executeUpdate();
        }catch (SQLException e) {
            e.printStackTrace();
        }
	}

	@Override
	public void atualizar(Partido partido) {
		String sql = "UPDATE partido SET nome=?,sigla=? WHERE numero=?";
        try(PreparedStatement stmt=ConnectionFactory.criaStatement(sql)){        	
            stmt.setString(1,partido.getNome());
            stmt.setString(2,partido.getSigla());
            stmt.setInt(3,partido.getNumero());            
            stmt.executeUpdate();
        }
         catch (SQLException e) {
            e.printStackTrace();
        }
	}

	@Override
	public void apagar(Partido partido) {
		String sql = "DELETE FROM partido WHERE numero=?";

        try(PreparedStatement stmt = ConnectionFactory.criaStatement(sql)){
            stmt.setInt(1,partido.getNumero());
            stmt.executeUpdate();
        }catch (SQLException e) {
            e.printStackTrace();
        }
	}

	@Override
	public Partido buscar(int id) {
		String sql = "SELECT * FROM partido WHERE numero=?";
        Partido partido=null;
       try (PreparedStatement stmt = ConnectionFactory.criaStatement(sql)){
           stmt.setInt(1,id);
           ResultSet rs = stmt.executeQuery();
           while (rs.next())
        	   partido = new Partido(rs.getInt("numero"), rs.getString("nome"), rs.getString("sigla"));

       } catch (SQLException e) {
            e.printStackTrace();
        }
        return partido;
	}

	@Override
	public List<Partido> buscarTodos() {
		String sql = "SELECT * FROM partido";
        List<Partido> listaPartidos =new ArrayList<>();
        try (PreparedStatement stmt = ConnectionFactory.criaStatement(sql)){
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
            	Partido partido = new Partido(rs.getInt("numero"), rs.getString("nome"), rs.getString("sigla"));
            	listaPartidos.add(partido);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listaPartidos;
	}

}
