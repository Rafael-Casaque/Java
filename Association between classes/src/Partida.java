import java.util.Objects;

public class Partida {
	private String data;
	private String hora;
	private int placarTime1;
	private int placarTime2;
	private Time time1;
	private Time time2;
	private Estadio estadio;
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public String getHora() {
		return hora;
	}
	public void setHora(String hora) {
		this.hora = hora;
	}
	public int getPlacarTime1() {
		return placarTime1;
	}
	public void setPlacarTime1(int placarTime1) {
		this.placarTime1 = placarTime1;
	}
	public int getPlacarTime2() {
		return placarTime2;
	}
	public void setPlacarTime2(int placarTime2) {
		this.placarTime2 = placarTime2;
	}	
	public Time getTime1() {
		return time1;
	}
	public void setTime1(Time time1) {
		this.time1 = time1;
	}
	public Time getTime2() {
		return time2;
	}
	public void setTime2(Time time2) {
		this.time2 = time2;
	}		
	public Estadio getEstadio() {
		return estadio;
	}
	public void setEstadio(Estadio estadio) {
		this.estadio = estadio;
	}	
	public Partida(String data, String hora, int placarTime1, int placarTime2, Time time1, Time time2,
			Estadio estadio) {		
		this.data = data;
		this.hora = hora;
		this.placarTime1 = placarTime1;
		this.placarTime2 = placarTime2;
		this.time1 = time1;
		this.time2 = time2;
		this.estadio = estadio;
	}	
	public Partida() {
		
	}		
	@Override
	public String toString() {
		return "Partida [data=" + data + ", hora=" + hora + ", placarTime1=" + placarTime1 + ", placarTime2="
				+ placarTime2 + ", time1=" + time1 + ", time2=" + time2 + ", estadio=" + estadio + "]";
	}	
	@Override
	public int hashCode() {
		return Objects.hash(data, estadio, hora, placarTime1, placarTime2, time1, time2);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Partida other = (Partida) obj;
		return Objects.equals(data, other.data) && Objects.equals(estadio, other.estadio)
				&& Objects.equals(hora, other.hora) && placarTime1 == other.placarTime1
				&& placarTime2 == other.placarTime2 && Objects.equals(time1, other.time1)
				&& Objects.equals(time2, other.time2);
	}
	void atualizarResultado(int novoPlacarTime1,int novoPlacarTime2){
		this.placarTime1 = novoPlacarTime1;
		this.placarTime2 = novoPlacarTime2;
	}
}
