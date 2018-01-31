class EstruturaCondicional{
	public static void main(String[] args){
		int numero = 10;
		if(numero % 2 == 0){
			System.out.println("Par");	
		}else{
			System.out.println("Impar");
		}

		int outroNumero = 2;
		switch(outroNumero){
			case 13:
				System.out.println("13");
				break;
			case 01:
				System.out.println("01");
				break;
			default:
				System.out.println("Error");
				break;
		}
	}
}