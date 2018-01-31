import java.util.Scanner;

public class Programa {
	private static Scanner teclado;

	public static void main(String[] args) {
		teclado = new Scanner(System.in);
		System.out.println("Digite um valor do tipo inteiro\n");
		
		int valor;
		
		try{
			valor = teclado.nextInt();
			System.out.println("Você digitou " + valor);
		}catch (java.util.InputMismatchException e){
			System.out.println("O valor digitado não é inteiro");
		}finally {
			System.out.println("Zerando a variavel");
			valor = 0;
		}
		
		System.out.println(valor);
	}
}
