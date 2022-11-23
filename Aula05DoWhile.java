package laçosderepetiçao.whiles;

import java.util.Scanner;

public class Aula05DoWhile {

	public static void main(String[] args) {
          
	    Scanner scan = new Scanner(System.in);
		int DesejaContinuar = 1;

		
		do {
			System.out.println("PLAYER 1 :Digite um numero de 1 a 10");
			int num1 = scan.nextInt();
			System.out.println("PLAYER 2 :Digite um numero de 1 a 10");
			int num2 = scan.nextInt();
			System.out.println("Acertou " + (num1 == num2));
			
			System.out.println("-----------------------------------");
			
			System.out.println("Deseja continuar joganado?");
			System.out.println("1 . sim");
			System.out.println("2. nao");
			DesejaContinuar = scan.nextInt();
		} while (DesejaContinuar == 1);
	
              System.out.println( "Jogo Encerrado " );
}

}