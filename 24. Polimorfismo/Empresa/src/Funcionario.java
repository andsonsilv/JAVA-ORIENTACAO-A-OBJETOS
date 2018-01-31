
public class Funcionario{
	protected String nome;
	protected String rg;
	protected String dataDeEntrada;
	protected double salario;
	protected String departamento;
	protected boolean estaNaEmpresa;

	public String getNome(){
		return nome;
	}

	public void setNome(String nome){
		this.nome = nome;
	}

	public String getRg(){
		return rg;
	}

	public void setRg(String rg){
		this.rg = rg;
	}

	public String getDataDeEntrada(){
		return dataDeEntrada;
	}

	public void setDataDeEntrada(String dataDeEntrada){
		this.dataDeEntrada = dataDeEntrada;
	}

	public double getSalario(){
		return salario;
	}

	public void setSalario(double salario){
		this.salario = salario;
	}

	public String getDepartamento(){
		return departamento;
	}

	public void setDepartamento(String departamento){
		this.departamento = departamento;
	}

	public boolean isEstaNaEmpresa(){
		return estaNaEmpresa;
	}

	public void setEstaNaEmpresa(boolean estaNaEmpresa){
		this.estaNaEmpresa = estaNaEmpresa;
	}

	public void calcularSalario(double valor){
		this.salario = valor - (valor * 0.05);
	}

	public void calcularSalario(double valor, double horaExtras){
		double valorHoraextra = (valor/30) / 8 * horaExtras;
		this.salario = (valorHoraextra + valor) * 0.95;
	}

	public double bonifica(){
		return this.salario * 0.10;
	}

	public void demite(){
		estaNaEmpresa = false;
	}

	public double calculaGanhoAnual(){
		return salario * 12;
	}
	
}

