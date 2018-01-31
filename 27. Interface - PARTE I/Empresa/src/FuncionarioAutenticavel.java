
public abstract class FuncionarioAutenticavel extends Funcionario{
	protected String login;
	protected String senha;
	
	public String getLogin(){
		return login;
	}
	
	public void setLogin(String login){
		this.login = login;
	}
	
	public String getSenha(){
		return senha;
	}
	
	public void setSenha(String senha){
		this.senha = senha;
	}
	
	public boolean autentica(String login, String senha) {
		return ((this.login == login) && (this.senha == senha));
	}
}
