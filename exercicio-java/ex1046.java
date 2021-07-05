import java.util.Scanner;

public class ex1046 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int inicio,fim;
		inicio = sc.nextInt();
		fim = sc.nextInt();
		int duracao;
		
		
		if (inicio < fim) {
			duracao = fim - inicio;
		}
		
		else {
			duracao = 24 - inicio + fim;
		}
		
		
		
		System.out.println("O JOGO DUROU " + duracao  + " HORA(S)");
		sc.close();
	}

}
