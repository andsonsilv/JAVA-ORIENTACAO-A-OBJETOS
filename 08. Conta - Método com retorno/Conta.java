class Conta{
	int numeroConta;
	String titular;
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

class Programa{
	public static void main(String[] args){
		Conta conta = new Conta();
		conta.numeroConta = 2;
		conta.titular = "Andson";
		conta.saldo = 500;
		
		System.out.println(conta.numeroConta);
		System.out.println(conta.titular);
		conta.saldo();

		if(conta.sacar(200) == true){
			System.out.println("SUCESSO!");
		}else{
			System.out.println("ERRO!");
		}

	}
}