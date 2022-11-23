package laçosderepetiçao.whiles;


import java.util.Scanner;

/*Apresentar ao usuario uma tela solicitando o login e depois uma senha, o usuario 
 * e senha corretos devem estar armazenado em constante no seu programa . Se o usuario
 * acertar o usuario ea senha exibir a mensagem 	ACESSO CONSEDIDO caso contrario exibir a mensagem
 *  ACESSO NEGADO e voltar a pedir o usuario ea senha essa condiçao  deve se repetir ate que o usuario
 * acerte a combinaçao.
 */

public class Aula04ExercicioLogin {

	public static void main(String[] args) {

	Scanner scan = new Scanner(System.in);

     final String login ="Luffy";
     final String passoword = "ReiDosPiratas";	 
     boolean exibirTelalogin = true;
     
     while (exibirTelalogin) {
    	 System.out.println("Digite seu Login");
    	String loginDigitado = scan.nextLine();
    	 System.out.println("Digite sua senha");
    	 String passowordDigitado =scan.nextLine();
    	 
    	 if (login.equals(loginDigitado) && passoword.equals(passowordDigitado)) {
			         System.out.println("Acesso consedido");
			         exibirTelalogin = false;
			         break;
		} 

    	 System.out.println("Acesso Negado");
		}
    	 System.out.println("Programa Terminado");
     }
		
	}	


