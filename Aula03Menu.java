package la�osderepeti�ao.whiles;

import java.util.Scanner;

/*Como usuario eu gostaria de ter um menu visual que seja navegavel atraves de numeros.
 * o menu deve ser exibido  da seguinte forma
 * 
 * 1.Calcular Imposto
 * 2.DepositaSalario
 * 3.Sair
 * 
 * O menu deve fica	 disponivel enquanto eu nao digitar o numero 3.
 * Dessa forma o sistema ficara em execu�ao, evitando ser reiniciado a cada opera�ao	
 * 
 */

public class Aula03Menu {

	public static void main(String[] args) {

		Scanner teclado = new Scanner (System.in);
		int op�ao = 0;
		while (op�ao !=3) {
			System.out.println("1.Calcular Imposto");
			System.out.println("2.DepositaSalario");
			System.out.println("3.Sair");
			System.out.println("Digite sua op�ao");
			op�ao = teclado.nextInt();
		}
		System.out.println("Programa Encerrado");
		
		
		
	}

}


