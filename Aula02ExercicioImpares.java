package laçosderepetiçao.whiles;

import java.util.Scanner;

/*eu como usuario gostaria de imprimir todos os numeros impares
 * de 0 ate o valor digitado pelo usuario  
 * 
 * 
 */


public class Aula02ExercicioImpares {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
         System.out.println("Valor digitado pelo usuario:");
         int valor  = teclado.nextInt();
         int i = 0;
		
		while (i <= valor) {
			if ( i %  2 != 0) {
			
				System.out.println("i =" + i);
			}
			 i= i + 1;
		}
	}

}
