
public class Programa {
	public static void main(String[] args) {
		
		Vendedor vendedor = new Vendedor();
		vendedor.setDataDeEntrada("14/03/2015");
		vendedor.setDepartamento("Vendas");
		vendedor.setEstaNaEmpresa(true);
		vendedor.setNome("Andson");
		vendedor.setRg("100.000.000-9");
		vendedor.setSalario(400);
		vendedor.calcularSalario(400);
		
		
		Gerente gerente = new Gerente();
		gerente.departamento = "Vendas";
		gerente.dataDeEntrada = "01/02/2003";
		gerente.estaNaEmpresa = true;
		gerente.nome = "Antonio";
		gerente.salario = 1000.0;
		gerente.rg = "200.000.000-9";
		
		gerente.setLogin("user");
		gerente.setSenha("senha");
		
		ControleBonificacoes controleBonificacoes = new ControleBonificacoes();
		Servidor servidor = new Servidor();
		
		controleBonificacoes.calcularBonificacao(vendedor);
		controleBonificacoes.calcularBonificacao(gerente);
		controleBonificacoes.calcularBonificacao(servidor);
			
		System.out.println(vendedor.getDataDeEntrada());
		System.out.println(vendedor.getDepartamento());
		System.out.println(vendedor.getNome());
		System.out.println(vendedor.getRg());
		System.out.println(vendedor.getSalario());
		System.out.println(vendedor.isEstaNaEmpresa());
		System.out.println(vendedor.bonifica());
		
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
	
	
		SistemaInterno sistemaInterno = new SistemaInterno();
		sistemaInterno.autenticaUsuario(gerente);
		sistemaInterno.autenticaUsuario(servidor);
	
	}
	
}
