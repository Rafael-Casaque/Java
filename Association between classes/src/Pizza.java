import java.util.ArrayList;
import java.util.Objects;

public class Pizza extends Produto{
	private boolean bordaRecheada;
	private ArrayList<Ingrediente> ingredientes = new ArrayList<>();
	
	public boolean isBordaRecheada() {
		return bordaRecheada;
	}
	public void setBordaRecheada(boolean bordaRecheada) {
		this.bordaRecheada = bordaRecheada;
	}
	public ArrayList<Ingrediente> getIngredientes() {
		return ingredientes;
	}
	public void setIngredientes(ArrayList<Ingrediente> ingredientes) {
		this.ingredientes = ingredientes;
	}
	
	public Pizza(String descricao, double preco, boolean bordaRecheada, Ingrediente... ing) {
		super(descricao, preco);
		this.bordaRecheada = bordaRecheada;
		for(Ingrediente i: ing) {
			this.ingredientes.add(i);
		}
	}
	
	public Pizza() {
		
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(bordaRecheada, ingredientes);
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pizza other = (Pizza) obj;
		return bordaRecheada == other.bordaRecheada && Objects.equals(ingredientes, other.ingredientes);
	}
	@Override
	public String toString() {
		return "Pizza [bordaRecheada=" + bordaRecheada + ", ingredientes=" + ingredientes + "]";
	}
	@Override
	void mostrarDados() {
		System.out.println("Descricao: "+this.getDescricao());
		System.out.println("Preco: "+this.getPreco());
		System.out.println("Com Borda Reacha? "+this.bordaRecheada);
		System.out.printf("Ingredientes: ");
		for(Ingrediente i : ingredientes) {
			System.out.print(i.getNome()+" ");
		}				
		System.out.println();
		System.out.println();
	}
}