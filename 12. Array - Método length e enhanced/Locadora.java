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

		Filme filme2 = new Filme();
		filme2.codigo = 456;
		filme2.nome = "The Filme";
		filme2.valor = 1.99;

		Filme filme3 = new Filme();
		filme3.codigo = 789;
		filme3.nome = "Nao sei";
		filme3.valor = 2.99;

		Filme vetor[] = new Filme[3];

		vetor[0] = filme;
		vetor[1] = filme2;
		vetor[2] = filme3;

		for(int i = 0; i < vetor.length; i++){
			System.out.println(vetor[i].codigo);
			System.out.println(vetor[i].nome);
			System.out.println(vetor[i].valor);	
		}

		for(Filme x : vetor){
			System.out.println(x.codigo);
			System.out.println(x.nome);
			System.out.println(x.valor);	
		}
	}
}