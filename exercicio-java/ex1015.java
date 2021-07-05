import java.util.Locale;
import java.util.Scanner;

public class ex1015 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int hora,velocidadeMedia,kmLitro;
		double litros;
		
		hora = sc.nextInt();
		velocidadeMedia =sc.nextInt();
		kmLitro = 12;
		litros = ((double)velocidadeMedia / 12) * hora;
		
		System.out.printf("%.3f%n",litros);
		
		
		
		
		
		sc.close();
	}

}
