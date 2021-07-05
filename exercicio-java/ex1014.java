
import java.util.Locale;
import java.util.Scanner;
public class ex1014 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		int X, resultado;
		
		X = sc.nextInt();
		resultado = X * 2;
		
		System.out.printf("%d minutos%n",resultado);
		
		
		sc.close();

	}

}

// fiquei duas horas pra ver que o problema era só multiplicar por 2, eu achando
// que era pra medir a distancia entre os dois carros k k k 