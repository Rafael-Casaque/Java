import java.util.Objects;

public class Jogador {
	private String nome;
	private String posicao;
	private int numeroCamisa;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getPosicao() {
		return posicao;
	}
	public void setPosicao(String posicao) {
		this.posicao = posicao;
	}
	public int getNumeroCamisa() {
		return numeroCamisa;
	}
	public void setNumeroCamisa(int numeroCamisa) {
		this.numeroCamisa = numeroCamisa;
	}
	
	public Jogador(String nome, String posicao, int numeroCamisa) {		
		this.nome = nome;
		this.posicao = posicao;
		this.numeroCamisa = numeroCamisa;
	}
	
	public Jogador() {
		
	}
	
	@Override
	public String toString() {
		return "Jogador [nome=" + nome + ", posicao=" + posicao + ", numeroCamisa=" + numeroCamisa + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(nome, numeroCamisa, posicao);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Jogador other = (Jogador) obj;
		return Objects.equals(nome, other.nome) && numeroCamisa == other.numeroCamisa
				&& Objects.equals(posicao, other.posicao);
	}	
	
}