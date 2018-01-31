class Filme{
	int codigo;
	String nome;
	double valor;
}

class Locadora{
	public static void main(String[] args){
		Filme filme = new Filme();
		filme.codigo = 123;
		filme.nome = "O Filme";
		filme.valor = 12.99;

		System.out.println(filme);
		System.out.println(filme.codigo);
		System.out.println(filme.nome);
		System.out.println(filme.valor);
	}
}