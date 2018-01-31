
public class Gerente extends Funcionario implements Autenticavel{
	
	public double bonifica(){
		return this.salario * 0.15;
	}

	@Override
	public void calcularSalario(double valor){
		// TODO Auto-generated method stub
		
	}

	@Override
	public void calcularSalario(double valor, double horaExtras){
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean autenticar(String login, String senha){
		// TODO Auto-generated method stub
		return false;
	}


}
