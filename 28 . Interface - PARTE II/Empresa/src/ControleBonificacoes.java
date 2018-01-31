
public class ControleBonificacoes{
	private double valorAbsoluto;

	public double getValorAbsoluto() {
		return valorAbsoluto;
	}
	
	public double calcularBonificacao(Funcionario funcionario){
		return valorAbsoluto += funcionario.bonifica();
	}
	

	
}
