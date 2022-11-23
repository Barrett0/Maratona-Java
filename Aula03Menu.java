package laçosderepetiçao.whiles;

import java.util.Scanner;

/*Como usuario eu gostaria de ter um menu visual que seja navegavel atraves de numeros.
 * o menu deve ser exibido  da seguinte forma
 * 
 * 1.Calcular Imposto
 * 2.DepositaSalario
 * 3.Sair
 * 
 * O menu deve fica	 disponivel enquanto eu nao digitar o numero 3.
 * Dessa forma o sistema ficara em execuçao, evitando ser reiniciado a cada operaçao	
 * 
 */

public class Aula03Menu {

	public static void main(String[] args) {

		Scanner teclado = new Scanner (System.in);
		int opçao = 0;
		while (opçao !=3) {
			System.out.println("1.Calcular Imposto");
			System.out.println("2.DepositaSalario");
			System.out.println("3.Sair");
			System.out.println("Digite sua opçao");
			opçao = teclado.nextInt();
		}
		System.out.println("Programa Encerrado");
		
		
		
	}

}


