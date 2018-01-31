class Funcionario{
	String nome;
	String departamento;
	double salario;
	String dataDeEntrada;
	String rg;
	boolean estaNaEmpresa;

	void calcularSalario(double valor){
		this.salario = valor - (valor * 0.05);
	}

	void calcularSalario(double valor, double horaExtras){
		double valorHoraextra = (valor/30) / 8 * horaExtras;
		this.salario = (valorHoraextra + valor) * 0.95;
	}

	void bonifica(double valor){
		salario += valor;
	}

	void demite(){
		estaNaEmpresa = false;
	}

	double calculaGanhoAnual(){
		return salario * 12;
	}
}

class Programa{
	public static void main(String[] args){
		Funcionario x = new Funcionario();
		x.calcularSalario(1000, 0);

		System.out.println(x.salario);
	}
}