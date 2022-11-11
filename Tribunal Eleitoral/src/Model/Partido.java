package Model;

import java.util.Objects;

public class Partido {
	private int numero;
	private String nome;
	private String sigla;
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSigla() {
		return sigla;
	}
	public void setSigla(String sigla) {
		this.sigla = sigla;
	}
	public Partido(int numero, String nome, String sigla) {		
		this.numero = numero;
		this.nome = nome;
		this.sigla = sigla;
	}
	public Partido() {}
	@Override
	public String toString() {
		return "Partido [numero=" + numero + ", nome=" + nome + ", sigla=" + sigla + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(nome, numero, sigla);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Partido other = (Partido) obj;
		return Objects.equals(nome, other.nome) && numero == other.numero && Objects.equals(sigla, other.sigla);
	}
			
}
