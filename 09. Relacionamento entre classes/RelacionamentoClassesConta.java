class Conta{
	int numeroConta;
	Cliente titular;
	double saldo;

	boolean sacar(double valor){
		if(saldo >= valor){
			saldo -= valor;
			return true;
		}
		return false;
	}

	boolean depositar(double valor){
		if(valor > 0){
			saldo += valor;
			return true;
		}
		return false;
	}

	void saldo(){
		System.out.println(this.saldo);
	}
}

class Cliente{
	String nome;
	String cpf;
}

class Programa{
	public static void main(String[] args){
		
		Cliente cliente = new Cliente();
		cliente.nome = "Andson";
		cliente.cpf = "065.123.456-65";

		Conta conta = new Conta();
		conta.numeroConta = 2;
		conta.titular = cliente;
		conta.saldo = 500;
		
		System.out.println(conta.numeroConta);
		System.out.println(conta.titular.nome);
		System.out.println(conta.titular.cpf);
		conta.saldo();

		if(conta.sacar(200) == true){
			System.out.println("SUCESSO!");
		}else{
			System.out.println("ERRO!");
		}

	}
}