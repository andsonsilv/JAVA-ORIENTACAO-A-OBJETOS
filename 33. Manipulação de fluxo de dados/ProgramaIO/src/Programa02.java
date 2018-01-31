import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;


public class Programa02{
	private static Scanner leitor;

	public static void main(String[] args){
		try {
			leitor = new Scanner(new FileReader("texto.txt"));
			while(leitor.hasNextLine()){
				System.out.println(leitor.nextLine());
			}
		}catch (FileNotFoundException e){
			System.out.println("Arquivo não encontrado!");
		}
	}
}
