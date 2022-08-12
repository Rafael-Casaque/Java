
public class Main {

	public static void main(String[] args) {
		Livro livro1; //declara o objeto
		livro1 = new Livro(); //instancia o objeto
		
		Livro livro2 = new Livro(); //criando objeto com o construtor vazio
		
		Livro livro3 = new Livro("dom Casmurro","Machado de assis",9.99); //criando objeto com o construtor de 3 parâmetros
		
		Livro livro4 = new Livro("Os Miseraveis","Victor Hugo"); //criando objeto com o construtor de 2 parâmetros
		
		//Acessando os atributos e atribuindo valores dos objetos
		//OBS: Não funciona com encapsulamento
		
		//livro1.titulo = "O conde de Monte Cristo";
		livro1.setTitulo("O Conde de Monte Cristo"); //forma de atribuir valor após encapsulamento
		//livro1.autor = "Alexandre Dumas";
		livro1.setAutor("Alexandre Dumas");
		//livro1.preco = 54.99;
		livro1.setPreco(54.99);
		
		//livro2.titulo = "Clube da luta";
		livro2.setTitulo("Clube da luta");
		//livro2.autor = "Cuck Palahniuk";
		livro2.setAutor("Cuck Palahniuk");
		//livro2.preco = 29.99;
		livro2.setPreco(29.99);
		
		livro2.atualizarPreco(0.10);
				
		//System.out.println(livro3.autor);
		System.out.println(livro3.getAutor());
		//System.out.println(livro2.preco);
		System.out.println(livro2.getPreco());
		livro2.mostrarDados();
	}

}
