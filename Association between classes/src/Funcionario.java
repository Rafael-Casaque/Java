
public class Funcionario {

	private String cpf;
	private String nome;
	private double salario;
	private Departamento departamento;
	
	public Funcionario() {
		
	}
	
	public Funcionario(String cpf, String nome, double salario, Departamento departamento) {		
		this.cpf = cpf;
		this.nome = nome;
		this.salario = salario;
		this.departamento = departamento;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}							
	
	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	void MostrarDados() {
		System.out.printf("Funcionario: %s\nCPF: %s\nSalario: R$%.2f\nDepartamento: %s\nSigla: %s\n\n",this.nome,this.cpf,this.salario,departamento.getNome(),departamento.getSigla());		
	}
}
