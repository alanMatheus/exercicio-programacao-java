import java.util.Scanner;

public class ex1004 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A,B,prod;
		
		A = sc.nextInt();
		B = sc.nextInt();
		prod = A * B ;
		
		System.out.println("PROD = " + prod);
		
		sc.close();
	}

}
