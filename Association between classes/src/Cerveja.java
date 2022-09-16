import java.util.Objects;

public class Cerveja extends Bebida {
	private double teorAlcoolico;

	public double getTeorAlcoolico() {
		return teorAlcoolico;
	}

	public void setTeorAlcoolico(double teorAlcoolico) {
		this.teorAlcoolico = teorAlcoolico;
	}

	public Cerveja(String descricao, double preco, int quantidadeEstoque, double teorAlcoolico) {
		super(descricao, preco, quantidadeEstoque);
		this.teorAlcoolico = teorAlcoolico;
	}
	
	public Cerveja() {
		
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(teorAlcoolico);
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
		Cerveja other = (Cerveja) obj;
		return Double.doubleToLongBits(teorAlcoolico) == Double.doubleToLongBits(other.teorAlcoolico);
	}

	@Override
	public String toString() {
		return "Cerveja [teorAlcoolico=" + teorAlcoolico + "]";
	}
	@Override
	void mostrarDados() {
		System.out.println("Descricao: "+this.getDescricao());
		System.out.println("Preco: "+this.getPreco());
		System.out.println("Quantidade no estoque: "+this.getQuantidadeEstoque());
		System.out.println("Teor Alcoolico: "+this.teorAlcoolico);
		System.out.println();
	}
}
