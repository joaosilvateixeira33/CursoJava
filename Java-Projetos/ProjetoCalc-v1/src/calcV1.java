import java.util.Scanner;
public class calcV1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //Tela inicial
        System.out.println("----- Calculadora V1 -----");
        System.out.printf("1- Soma%n2- Subtração%n3- Multiplicação%n4- Divisão%n");
        System.out.println("Escolha uma opção: ");
        int opcao = sc.nextInt();

        //escolha de numeros pelo usuario
        System.out.println("Escolha um numero: ");
        int num1 = sc.nextInt();
        System.out.println();
        System.out.println("Escolha um numero: ");
        int num2 = sc.nextInt();
        System.out.println();

        sc.close();
        
    }
}
