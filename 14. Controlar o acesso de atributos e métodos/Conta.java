class Conta{
	int numeroConta;
	Cliente titular;
	private double saldo;

	public boolean sacar(double valor){
		if(saldo >= valor){
			saldo -= valor;
			return true;
		}
		return false;
	}

	public boolean depositar(double valor){
		if(valor > 0){
			saldo += valor;
			return true;
		}
		return false;
	}

	public double saldo(){
		return this.saldo;
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
		if(conta.depositar(500)){
			System.out.println("SUCESSO\n");
		}else{
			System.out.println("ERRO\n");
		}
		
		System.out.println(conta.numeroConta);
		System.out.println(conta.titular.nome);
		System.out.println(conta.titular.cpf);
		
		System.out.println("saldo " + conta.saldo());

		if(conta.sacar(200) == true){
			System.out.println("SUCESSO!");
		}else{
			System.out.println("ERRO!");
		}

	}
}