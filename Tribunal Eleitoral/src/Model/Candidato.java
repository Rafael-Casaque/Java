package Model;

import java.util.Objects;

public class Candidato {
	private int numero;
	private String nome;
	private Cargo cargo;
	private Partido partido;
	
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
	public Cargo getCargo() {
		return cargo;
	}
	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}
	public Partido getPartido() {
		return partido;
	}
	public void setPartido(Partido partido) {
		this.partido = partido;
	}		
	
	public Candidato(int numero, String nome, Cargo cargo, Partido partido) {
		super();
		this.numero = numero;
		this.nome = nome;
		this.cargo = cargo;
		this.partido = partido;
	}
	public Candidato() {}
	@Override
	public String toString() {
		return "Candidato [numero=" + numero + ", nome=" + nome + ", cargo=" + cargo + ", partido=" + partido + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(cargo, nome, numero, partido);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Candidato other = (Candidato) obj;
		return Objects.equals(cargo, other.cargo) && Objects.equals(nome, other.nome) && numero == other.numero
				&& Objects.equals(partido, other.partido);
	}
			
}
