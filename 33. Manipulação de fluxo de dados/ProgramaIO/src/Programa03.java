import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Programa03{
	public static void main(String[] args) {
		try {
			PrintStream gravador = new PrintStream("saida.txt");
			gravador.println("Meu nome é Andson, sou estudante de Engenharia de Computação - UFC");
			gravador.close();
		} catch (FileNotFoundException e){
			System.out.println("Arquivo não encontrado!");
		}
	}
}
