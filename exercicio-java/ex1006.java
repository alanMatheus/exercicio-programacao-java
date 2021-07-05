import java.util.Scanner;

public class ex1006 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//variaveis em double//
		double A,B,C,med;
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		
		med = (A * 2 + B * 3 + C * 5)/10;
		//printf permite formatação
		//println quebra de linha
		//lembrar disso
	   System.out.printf("MEDIA = %.1f%n" + med);
		
		
		
		
		sc.close();
	}

}
