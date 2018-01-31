
public class SistemaInterno{

		public void autenticaUsuario(Autenticavel autenticavel){
			String login = "user";
			String senha = "senha";
			
			if(autenticavel.autenticar(login, senha) == true){
				System.out.println("Permitido\n");
			}else{
				System.out.println("Negativo\n");
			}
		}
}
