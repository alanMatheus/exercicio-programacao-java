import java.util.Scanner;

public class exProp3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int minutos = sc.nextInt();
		double valorFranquia = 50.00;
		
		if(minutos > 100) {
			valorFranquia += (minutos - 100) * 2.0;
			
		}
		System.out.printf("Valor da Conta: %.2f%n",valorFranquia);
		
		
		
		
		
		
		
		sc.close();
		
	}

}
