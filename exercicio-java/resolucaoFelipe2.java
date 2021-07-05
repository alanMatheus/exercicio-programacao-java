import java.util.Scanner;

public class resolucaoFelipe2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a,sobra;
		a = sc.nextInt();
		
		int[] cedulas = new int[]{ 100, 50, 20, 10, 5, 2, 1 }; 
		sobra=a;
		
		 for(int cedula : cedulas) {
			 System.out.println(calculaCedula(sobra, cedula));
			 sobra=calculaSobra(sobra,cedula);
		 }
		 
		sc.close();
	}
	
	private static int calculaCedula(int valor, int cedula) {
		return valor/cedula;
	}
	
	private static int calculaSobra(int valor, int cedula) {
		return valor%cedula;
	}

}
