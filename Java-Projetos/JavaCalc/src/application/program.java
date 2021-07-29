package application;

import java.util.Scanner;

import entilites.numeroUsuario;

public class program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opcao;
		String pergunta= " ";
		do {
			//apresenta��o
			System.out.println();
			System.out.println("------ Calculadora simples v0.1 -----");
			System.out.printf("1- Soma%n2- Subtra��o%n3- Multiplica��o%n4- Divis�o%n");
			System.out.print("Escolha uma op��o: ");
			opcao = sc.nextInt();
			sc.nextLine();
			System.out.println();
			
			//pedir ao usuario 2 numeros
			numeroUsuario user = new numeroUsuario();
			
			System.out.println("Escolha um numero: ");
			user.num1 = sc.nextDouble();
			System.out.println("Escolha outro numero: ");
			user.num2 = sc.nextDouble();
			sc.nextLine();
			System.out.println();
			
			//ao escolher a op��o
			switch(opcao) {
				case 1:
					System.out.println("----- Soma -----");
				    System.out.printf("%.2f + %.2f = %.2f", user.num1, user.num2, user.soma(user.num1, user.num2));
				    System.out.printf("%n-------------------%n");
				break;
				case 2:
					System.out.println("----- Subtra��o -----");
				    System.out.printf("%.2f - %.2f = %.2f", user.num1, user.num2, user.subtracao(user.num1, user.num2));
					System.out.printf("%n-------------------%n");
				break;
				case 3:
					System.out.println("----- Multiplica��o -----");
				    System.out.printf("%.2f x %.2f = %.2f",  user.num1, user.num2, user.multiplicacao(user.num1, user.num2));
					System.out.printf("%n-------------------%n");

				break;
				case 4:
					System.out.println("----- Divis�o -----");
					System.out.printf("%.2f / %.2f = %.2f", user.num1, user.num2, user.divisao(user.num1, user.num2));
					System.out.printf("%n-------------------%n");
				break;
				default:
					System.out.println("Erro, op��o invalida tente novamente");
				break;
			}
			
			System.out.println();
	        System.out.println("Deseja continuar (sim/nao)?");
	        pergunta  = sc.next();
	        System.out.println();

			
			
		}while(pergunta.equalsIgnoreCase("sim"));
		
		
		sc.close();
	}

}
