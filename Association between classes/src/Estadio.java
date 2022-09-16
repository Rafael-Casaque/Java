import java.util.Objects;

public class Estadio {
	private String nome;
	private String cidade;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public Estadio(String nome, String cidade) {		
		this.nome = nome;
		this.cidade = cidade;
	}
	public Estadio() {
		
	}
	@Override
	public String toString() {
		return "Estadio [nome=" + nome + ", cidade=" + cidade + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(cidade, nome);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Estadio other = (Estadio) obj;
		return Objects.equals(cidade, other.cidade) && Objects.equals(nome, other.nome);
	}		
}
