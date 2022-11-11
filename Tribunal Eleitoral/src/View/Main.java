package View;

import Data.CandidatoDAO;
import Data.CandidatoSQLiteDAO;
import Data.CargoDAO;
import Data.CargoSQLiteDAO;
import Data.PartidoDAO;
import Data.PartidoSQLiteDAO;
import Model.Candidato;
import Model.Cargo;
import Model.Partido;

public class Main {

	public static void main(String[] args) {
		CandidatoDAO candidatoDAO = new CandidatoSQLiteDAO();
		CargoDAO cargoDAO = new CargoSQLiteDAO();
		PartidoDAO partidoDAO = new PartidoSQLiteDAO();
		
		Cargo cargo1 = new Cargo(1,"senador");
		Cargo cargo2 = new Cargo(2,"deputado");
		Cargo cargo3 = new Cargo(3,"governador");
		
		Partido partido1 = new Partido(40,"Partido Socialista Brasileiro","PSB");
		Partido partido2 = new Partido(45,"Partido Social Democrata Brasileiro","PSDB");
		Partido partido3 = new Partido(13,"Partido dos Trabalhadores","PT");
		
		Candidato candidato1 = new Candidato(4,"Marcio Franca",cargo1,partido1);
		Candidato candidato2 = new Candidato(5,"Joao Doria",cargo2,partido2);
		Candidato candidato3 = new Candidato(6,"Fernando Haddad",cargo3,partido3);
		
		//cargoDAO.salvar(cargo1);
		//cargoDAO.salvar(cargo2);
		//cargoDAO.salvar(cargo3);
		
		System.out.println(cargoDAO.buscarTodos().toString());
		
		//partidoDAO.salvar(partido1);
		//partidoDAO.salvar(partido2);
		//partidoDAO.apagar(partido3);		
		
		System.out.println(partidoDAO.buscarTodos().toString());
		
		//candidatoDAO.salvar(candidato1);
		//candidatoDAO.salvar(candidato2);
		//candidatoDAO.salvar(candidato3);
		
		System.out.println(candidatoDAO.buscarTodos());		
	}
}