package listaI;

import java.util.Scanner;

public class l10 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int numero, maior = 0, menor = 0;
		System.out.println("Qual o conjunto de N numeros? ");
		int num = leia.nextInt();
		
		for (int i = 1 ; i <= num; i++) {
			System.out.println("Qual é o "+ i+"ª numero?" );
			numero = leia.nextInt();
			if (i == 1) {
				maior = numero;
				menor = numero;
			} else {
				if (numero > maior) {
					maior = numero;
				}
				if (numero < menor) {
					menor = numero;
				}
			}
		}

		System.out.println("O maior valor digitado é ==> "+ maior);
		System.out.println("O menor valor digitado é ==> "+ menor);
	}

}
