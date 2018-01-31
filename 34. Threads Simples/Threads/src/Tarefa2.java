
public class Tarefa2 implements Runnable{
	@Override
	public void run() {
		for(int i = 0; i < 2000; i++){
			System.out.println("Lendo arquivo");
		}
	}
}
