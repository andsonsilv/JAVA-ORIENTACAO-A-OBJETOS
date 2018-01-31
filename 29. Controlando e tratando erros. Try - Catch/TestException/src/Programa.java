
public class Programa{
	public static void main(String[] args){
		System.out.println("inicio do método main");
		metodoA();
		System.out.println("fim do método main");
	}

	static void metodoA() {
		System.out.println("inicio do método A");
		try {
			metodoB();
		} catch (ArrayIndexOutOfBoundsException e){
			System.out.println("ERROR - Índice inexistente!");
		}
		System.out.println("fim do método A");
	}

	static void metodoB() {
		System.out.println("inicio do método B");
		int numeros[] = new int[10];
		for (int i = 0; i < 11; i++) {
			numeros[i] = i * 5;
			System.out.println(numeros[i]);
		}
		System.out.println("fim do método B");
	}
}