import java.util.Objects;

public class Vinho extends Bebida{
	private String uva;
	private String paisOrigem;
	public String getUva() {
		return uva;
	}
	public void setUva(String uva) {
		this.uva = uva;
	}
	public String getPaisOrigem() {
		return paisOrigem;
	}
	public void setPaisOrigem(String paisOrigem) {
		this.paisOrigem = paisOrigem;
	}
	public Vinho(String descricao, double preco, int quantidadeEstoque, String uva, String paisOrigem) {
		super(descricao, preco, quantidadeEstoque);
		this.uva = uva;
		this.paisOrigem = paisOrigem;
	}	
	public Vinho() {
		
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(paisOrigem, uva);
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
		Vinho other = (Vinho) obj;
		return Objects.equals(paisOrigem, other.paisOrigem) && Objects.equals(uva, other.uva);
	}
	@Override
	public String toString() {
		return "Vinho [uva=" + uva + ", paisOrigem=" + paisOrigem + "]";
	}	
	@Override
	void mostrarDados() {
		System.out.println("Descricao: "+this.getDescricao());
		System.out.println("Preco: "+this.getPreco());
		System.out.println("Quantidade no estoque: "+this.getQuantidadeEstoque());
		System.out.println("Uva: "+this.uva);
		System.out.println("Pais de origem: "+this.paisOrigem);
		System.out.println();
	}
}
