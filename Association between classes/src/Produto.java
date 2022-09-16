import java.util.Objects;

public abstract class Produto {
	private String descricao;
	private double preco;
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public Produto(String descricao, double preco) {		
		this.descricao = descricao;
		this.preco = preco;
	}
	public Produto() {
		
	}
	@Override
	public int hashCode() {
		return Objects.hash(descricao, preco);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		return Objects.equals(descricao, other.descricao)
				&& Double.doubleToLongBits(preco) == Double.doubleToLongBits(other.preco);
	}
	@Override
	public String toString() {
		return "Produto [descricao=" + descricao + ", preco=" + preco + "]";
	}		
	void mostrarDados() {
		System.out.println("Descricao: "+this.descricao);
		System.out.println("Preco: "+this.preco);
		System.out.println();
	}
}
