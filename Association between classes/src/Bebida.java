import java.util.Objects;

public abstract class Bebida extends Produto{
	private int quantidadeEstoque;

	public int getQuantidadeEstoque() {
		return quantidadeEstoque;
	}
	public void setQuantidadeEstoque(int quantidadeEstoque) {
		this.quantidadeEstoque = quantidadeEstoque;
	}
	public Bebida(String descricao, double preco, int quantidadeEstoque) {
		super(descricao, preco);
		this.quantidadeEstoque = quantidadeEstoque;
	}
	public Bebida() {
		
	}
	@Override
	public String toString() {
		return "Bebida [quantidadeEstoque=" + quantidadeEstoque + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(quantidadeEstoque);
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
		Bebida other = (Bebida) obj;
		return quantidadeEstoque == other.quantidadeEstoque;
	}	
}
