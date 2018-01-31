
public class Vendedor extends Funcionario{

	@Override
	public void calcularSalario(double valor){
		this.salario = valor - (valor * 0.05);
	}

	@Override
	public void calcularSalario(double valor, double horaExtras){
		double valorHoraextra = (valor/30) / 8 * horaExtras;
		this.salario = (valorHoraextra + valor) * 0.95;
	}

	@Override
	public double bonifica() {
		return this.salario * 0.10;
	}

}
