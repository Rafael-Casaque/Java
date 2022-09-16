import java.util.ArrayList;
import java.util.List;

public class Main2 {	

	public static void main(String[] args) {
		
		ArrayList<Produto> produtos = new ArrayList<>();
					
		Ingrediente ingrediente1 = new Ingrediente("presunto");
		Ingrediente ingrediente2 = new Ingrediente("mussarela");
		Ingrediente ingrediente3 = new Ingrediente("ovo");
		Ingrediente ingrediente4 = new Ingrediente("cebola");
		Ingrediente ingrediente5 = new Ingrediente("milho");
		Ingrediente ingrediente6 = new Ingrediente("ervilha");
		Ingrediente ingrediente7 = new Ingrediente("palmito");
		
		Pizza americana = new Pizza("pizza americana de oito pedacos",49.99,true,ingrediente1,ingrediente2,ingrediente3,ingrediente4,ingrediente5,ingrediente6,ingrediente7);
		
		Cerveja brahma = new Cerveja("cerveja duplo malte",2.99,121,0.047);
		Cerveja skool = new Cerveja("cerveja pilsen",2.99,121,0.047);
		Cerveja imperio = new Cerveja("cerveja puro malte",2.99,121,0.05);
		Cerveja heineken = new Cerveja("cerveja pilsen",2.99,121,0.05);
		
		Vinho sinuelo = new Vinho("Vinho suave",21.00,123,"roxa","Brasil");
		Vinho reservado = new Vinho("Vinho suave",29.99,122,"roxa","Chile");
		Vinho lestruelle = new Vinho("Bordeaux",240.00,59,"roxa","Franca");
				
		produtos.addAll(List.of(americana,brahma,sinuelo,imperio,reservado,skool,lestruelle,heineken));
		
		for(Produto i:produtos) {
			i.mostrarDados();
		}
	}

}