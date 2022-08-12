public class Livro {
	
	//encapsulamento, modifica o acesso aos atributos, não permitindo que o usuário obtenha o atributo direto
	//sendo necessário criar interfaces de acesso
	
	private String titulo;
	private String autor;	
	private double preco;		
	
	public Livro() { //construtor vazio, vai alocar os valores padrões às variáveis
		
	}

	//Eclipse, atalho para criar construtor ctrl + 3 "gcuf"
	
	public Livro(String titulo, String autor, double preco) {		
		this.titulo = titulo;
		this.autor = autor;
		this.preco = preco;
	}

	public Livro(String titulo, String autor) {		
		this.titulo = titulo;
		this.autor = autor;
	}
	
	public void atualizarPreco(double ajuste){
		this.preco = this.preco + (this.preco * ajuste);
	} 
	
	public void mostrarDados() {
		System.out.println("Titulo: "+this.titulo + 
				"\nAutor: "+this.autor+
				"\nPreco: "+this.preco);		
	}

	//Atalho pra criar get e set => ctrl + 3 "ggas" 
	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	
		
}