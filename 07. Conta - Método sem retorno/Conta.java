class Conta{
	int numeroConta;
	String titular;
	double saldo;

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

	}
}