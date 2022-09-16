import java.util.ArrayList;

public class Departamento {
		
	private ArrayList<Funcionario> funcionarios = new ArrayList<>();
	
	private String nome;
	private String sigla;	

	public Departamento(String nome, String sigla){		
		this.nome = nome;
		this.sigla = sigla;
	}
	
	public Departamento() {
		
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

	public double CalcularFolhaPagamento() {
		double total=0;
		for(Funcionario f:funcionarios) {
			total+=f.getSalario();
		}
		return total;
	}
	
	public void AdicionarFuncionario(String cpf, String nome, double salario, String nomeDepartamento, String siglaDepartamento) {
		Departamento departamento =  new Departamento(nomeDepartamento, siglaDepartamento);
		Funcionario novoFuncionario = new Funcionario(cpf, nome, salario,departamento);
		funcionarios.add(novoFuncionario);
	}
	
	public void RemoverFuncionario(String cpf) {
		int index=-1;
		for(Funcionario f:funcionarios) {
			if(f.getCpf() == cpf) {
				index = funcionarios.indexOf(f);				
			}
		}
		if(index!=-1)
			funcionarios.remove(index);
		;
	}
	
	void MostrarFuncionario() {
		for(Funcionario f:funcionarios) {
			f.MostrarDados();
		}
	}
}
