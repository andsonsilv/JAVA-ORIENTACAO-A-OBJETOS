
public class Programa {
	public static void main(String[] args) {
		
		Funcionario funcionario = new Funcionario();
		funcionario.setDataDeEntrada("14/03/2015");
		funcionario.setDepartamento("Vendas");
		funcionario.setEstaNaEmpresa(true);
		funcionario.setNome("Andson");
		funcionario.setRg("100.000.000-9");
		funcionario.setSalario(400);
		funcionario.calcularSalario(400);
		
		
		Gerente gerente = new Gerente();
		gerente.departamento = "Vendas";
		gerente.dataDeEntrada = "01/02/2003";
		gerente.estaNaEmpresa = true;
		gerente.nome = "Antonio";
		gerente.salario = 1000.0;
		gerente.rg = "200.000.000-9";
		
		gerente.setLogin("antonio123");
		gerente.setSenha("12345");
		
		ControleBonificacoes controleBonificacoes = new ControleBonificacoes();
		Servidor servidor = new Servidor();
		
		controleBonificacoes.calcularBonificacao(funcionario);
		controleBonificacoes.calcularBonificacao(gerente);
		controleBonificacoes.calcularBonificacao(servidor);
			
		System.out.println(funcionario.getDataDeEntrada());
		System.out.println(funcionario.getDepartamento());
		System.out.println(funcionario.getNome());
		System.out.println(funcionario.getRg());
		System.out.println(funcionario.getSalario());
		System.out.println(funcionario.isEstaNaEmpresa());
		System.out.println(funcionario.bonifica());
		
		System.out.println("/----------------------------/");
		gerente.autentica("antonio123", "12345");
		System.out.println(gerente.getDataDeEntrada());
		System.out.println(gerente.getDepartamento());
		System.out.println(gerente.getNome());
		System.out.println(gerente.getRg());
		System.out.println(gerente.getSalario());
		System.out.println(gerente.calculaGanhoAnual());
		System.out.println(gerente.bonifica());
		
		System.out.println("\n----------------------------------\n");
		System.out.println(controleBonificacoes.getValorAbsoluto());
	}
	
}
