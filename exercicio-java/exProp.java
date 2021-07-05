import java.util.Scanner;

public class exProp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double A,B, total;
		
		A = sc.nextDouble();
		B = sc.nextDouble();
		total =A + B ; 
		
		if(total >= 60) {
			System.out.printf("APROVADO = %.1f%n",total);
		}
		else {
			System.out.printf("REPROVADO = %.1f%n",total);
		}
		
		sc.close();
		
		
		
	}

}
