class Conta{
	private int numeroConta;
	private Cliente titular;
	private double saldo;

	/* getters e setters */

	public int getNumeroConta(){
		return this.numeroConta;
	}

	public void setNumeroConta(int numeroConta){
		this.numeroConta = numeroConta;
	}

	public void setTitular(Cliente titular){
		this.titular = titular;
	}

	public Cliente getTitular(){
		return this.titular;
	}

	public double getSaldo(){
		return this.saldo;
	}

	/* end */
	
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

}

class Cliente{
	private String nome;
	private String cpf;

	/* getters e setters */

	public void setNome(String nome){
		this.nome = nome;
	}

	public String getNome(){
		return this.nome;
	}

	public void setCpf(String cpf){
		this.cpf = cpf;
	}

	public String getCpf(){
		return this.cpf;
	}

	/* end */
}

class Programa{
	public static void main(String[] args){
		
		Cliente cliente = new Cliente();
		cliente.setNome("Andson");
		cliente.setCpf("065.123.456-65");

		Conta conta = new Conta();
		conta.setNumeroConta(2);
		conta.setTitular(cliente);
		if(conta.depositar(500)){
			System.out.println("SUCESSO\n");
		}else{
			System.out.println("ERRO\n");
		}
		
		System.out.println(conta.getNumeroConta());
		System.out.println(conta.getTitular().getNome());
		System.out.println(conta.getTitular().getCpf());
		
		System.out.println("saldo " + conta.getSaldo());

		if(conta.sacar(200) == true){
			System.out.println("SUCESSO!");
		}else{
			System.out.println("ERRO!");
		}

	}
}