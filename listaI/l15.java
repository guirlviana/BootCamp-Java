package listaI;

import java.util.Scanner;

public class l15 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int base, expoente;
		double result = 0;
		System.out.println("Qual valor da base? ");
		base = leia.nextInt();
		System.out.println("Qual o expoente? ");
		expoente = leia.nextInt();
			if (expoente != 1 && expoente != 0) {
					result = Math.pow(base, expoente);		
			}
			if (expoente == 1) {
				result = base;
			}
			if (expoente == 0) {
				result = 1;
			} 
		
			
			System.out.println("Potencia = " + Math.round(result));	
	}

}
