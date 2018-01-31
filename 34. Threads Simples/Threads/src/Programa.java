
public class Programa {
	public static void main(String[] args) {
		Tarefa1 tarefa1 = new Tarefa1();
		Thread thread1 = new Thread(tarefa1);
		thread1.start();
		
		Tarefa2 tarefa2 = new Tarefa2();
		Thread thread2 = new Thread(tarefa2);
		thread2.start();
	}
}
