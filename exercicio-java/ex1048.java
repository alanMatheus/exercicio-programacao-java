import java.util.Locale;
import java.util.Scanner;

public class ex1048 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		
		double salario = sc.nextDouble();
		double percentual;
	if (salario <= 400) {
				percentual = 0.15;
	}else if (salario <= 800) {
			percentual = 0.12;
	}else if(salario <= 1200.00) {
			percentual = 0.10;
	}else if(salario <=2000.00) {
			percentual = 0.07;
	}else {
		    percentual = 0.04;
	}
	double salarioAjustado = salario * percentual;
	double novoSalario = salarioAjustado + salario;
	
	System.out.printf("Novo Salario: %.2f%n",novoSalario);
	System.out.printf("Reajuste ganho: %.2f%n",salarioAjustado);
	System.out.printf("Em percentual: %.0f %%%n", percentual*100);

		sc.close();

	}

}
