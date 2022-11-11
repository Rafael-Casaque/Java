package Model;

import java.util.Objects;

public class Cargo {
	private int idCargo;
	private String cargo;
	
	public int getIdCargo() {
		return idCargo;
	}
	public void setIdCargo(int idCargo) {
		this.idCargo = idCargo;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	public Cargo(int idCargo, String cargo) {		
		this.idCargo = idCargo;
		this.cargo = cargo;
	}
	
	public Cargo() {}
	
	@Override
	public String toString() {
		return "Cargo [idCargo=" + idCargo + ", cargo=" + cargo + "]";
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(cargo, idCargo);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cargo other = (Cargo) obj;
		return Objects.equals(cargo, other.cargo) && idCargo == other.idCargo;
	}
		
}
