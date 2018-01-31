
public class SistemaInterno{

		public void autenticaUsuario(FuncionarioAutenticavel funcionarioAutenticavel){
			String login = "user";
			String senha = "senha";
			
			if(funcionarioAutenticavel.autentica(login, senha) == true){
				System.out.println("Permitido\n");
			}else{
				System.out.println("Negativo\n");
			}
		}
}
