package listaI;

import java.util.Scanner;

public class exercicio {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int  idade, c, cont = 0, cont2 = 0, sal50 = 0, sal18 = 0;
		float sal, maior7 = 0, entre = 0; 
		
		for(c = 1; c <= 4; c++) { // Laço for para que o codigo abaixo repita 10 vezes
			System.out.println("Qual o salario do funcionario " + c);
			sal = leia.nextInt();
			System.out.println("Qual a idade do funcionario " + c);
			idade = leia.nextInt();
			
			if(sal >= 7000) { //Verifica se o salario é maior que 7000 ou esta entre 1500 e 3000
				maior7 ++; //Se verdadeiro 'maior' contabiliza mais um
			} else if (sal >= 1500 && sal <= 3000) {
				entre ++; //Se verdadeiro 'entre' contabiliza mais um
			}
		
			if (idade >= 50 ) { //Verifica se 'idade' é maior ou igual a 50
				cont++; // Se verdadeiro 'cont' contabliza mais um
				sal50 = (int) (sal50 + sal); // Soma o valor total de todos os salarios para obtenção da media
			}
			if (idade >=18 && idade <= 22) { //Verifica se 'idade' é maior ou igual a 18 e menor ou igual a 22
				cont2 ++; // Se verdadeiro 'cont' contabliza mais um
				sal18 = (int) (sal + sal); // Soma o valor total de todos os salarios para obtenção da media
			}
			
			
		
		
		}
		System.out.println("O total de funcionarios que ganham acima de 7000 reais é " + Math.floor(maior7));
		System.out.println("O total de funcionarios que ganham entre 1500 e 3000 reais é " + Math.floor(entre));
		System.out.println("A media salarial entre funcionarios com mais de 50 anos é " + sal50 / cont + " reais"); // 'sal50 / cont' é o resultado final da media onde o total de salarios é divido pelo numero de funcionarios 
		System.out.println("A media salarial entre funcionarios de 18 a 22 anos é " + sal18 / cont + " reais");  // 'sal18 / cont' é o resultado final da media onde o total de salarios é divido pelo numero de funcionarios 
		
		
		
		
		

	}

}
