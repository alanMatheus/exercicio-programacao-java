import java.util.Scanner;

public class resolucaoFelipe {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a,b,c,result,maiorEntreAeB;
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		maiorEntreAeB = maiorAB(a, b);
		result =maiorAB(maiorEntreAeB, c);
		
		System.out.print(result);
		sc.close();
	}
	
	
	private static int maiorAB(int numero1, int numero2) {
		return (numero1 + numero2 + Math.abs( numero1 - numero2))/2;
	}

}
