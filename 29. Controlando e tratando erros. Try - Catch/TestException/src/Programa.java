
public class Programa{
	public static void main(String[] args){
		System.out.println("inicio do m�todo main");
		metodoA();
		System.out.println("fim do m�todo main");
	}

	static void metodoA() {
		System.out.println("inicio do m�todo A");
		try {
			metodoB();
		} catch (ArrayIndexOutOfBoundsException e){
			System.out.println("ERROR - �ndice inexistente!");
		}
		System.out.println("fim do m�todo A");
	}

	static void metodoB() {
		System.out.println("inicio do m�todo B");
		int numeros[] = new int[10];
		for (int i = 0; i < 11; i++) {
			numeros[i] = i * 5;
			System.out.println(numeros[i]);
		}
		System.out.println("fim do m�todo B");
	}
}