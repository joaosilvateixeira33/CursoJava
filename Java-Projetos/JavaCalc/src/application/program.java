package application;

import java.util.Scanner;

public class program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//apresenta��o
		System.out.println("------ Calculadora simples v0.1 -----");
		System.out.printf("1- Soma%n2- Subtra��o%n3- Multiplica��o%n4- Divis�o%n");
		System.out.print("Escolha uma op��o: ");
		int opcao = sc.nextInt();
		sc.nextLine();
		System.out.println();
		
		//pedir ao usuario 2 numeros
		System.out.println("Escolha um numero: ");
		int num1 = sc.nextInt();
		System.out.println("Escolha outro numero: ");
		int num2 = sc.nextInt();
		sc.nextLine();
		System.out.println();
		
		//ao escolher a op��o
		if (opcao == 1){
		    System.out.println("----- Soma -----");
		    int somar = num1 + num2;
		    sc.nextLine();
		    System.out.printf("%d + %d = %d", num1, num2, somar);
		}else if(opcao == 2){
		    System.out.println("----- Subtra��o -----");
		    int subtrair = num1 - num2;
		    sc.nextLine();
		    System.out.printf("%d - %d = %d", num1, num2, subtrair);
		}else if(opcao == 3){
		    System.out.println("----- Multiplica��o -----");
		    int multiplicar = num1 * num2;
		    sc.nextLine();
		    System.out.printf("%d x %d = %d", num1, num2, multiplicar);
		}else if(opcao == 4){
		    System.out.println("----- Divis�o -----");
		    int dividir = num1 / num2;
		    sc.nextLine();
		    System.out.printf("%d / %d = %d", num1, num2, dividir);
		}
		
		
		sc.close();
	}

}
