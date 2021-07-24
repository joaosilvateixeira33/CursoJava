import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        //Tela inicial
        System.out.println("----- Calculadora Simples -----");
        System.out.printf("1- Calculadora padrão%n2- Sobre%n3- Sair");
        System.out.printf("%n------------------------------%n");
        int opcao = sc.nextInt();

        switch(opcao){
            case 1:
                System.out.println("----- Calculadora Padrão -----");
                System.out.printf("1- Soma%n2- Subtração%n3- Divisão%n4- Multiplicação");
                System.out.printf("%n------------------------------");
                
                //pedir ao usuario 2 numeros
                System.out.printf("%nEscolha um numero: ");
                int num1 = sc.nextInt();
                System.out.println("Escolha outro numero: ");
                int num2 = sc.nextInt();
                sc.nextLine();
                System.out.println();
                
                //ao escolher a opção
                if (opcao == 1){
                    System.out.println("----- Soma -----");
                    int somar = num1 + num2;
                    sc.nextLine();
                    System.out.printf("%d + %d = %d", num1, num2, somar);
                }else if(opcao == 2){
                    System.out.println("----- Subtração -----");
                    int subtrair = num1 - num2;
                    sc.nextLine();
                    System.out.printf("%d - %d = %d", num1, num2, subtrair);
                }else if(opcao == 3){
                    System.out.println("----- Multiplicação -----");
                    int multiplicar = num1 * num2;
                    sc.nextLine();
                    System.out.printf("%d x %d = %d", num1, num2, multiplicar);
                }else if(opcao == 4){
                    System.out.println("----- Divisão -----");
                    int dividir = num1 / num2;
                    sc.nextLine();
                    System.out.printf("%d / %d = %d", num1, num2, dividir);
                }
            break;
            case 2:
                System.out.println("----- Sobre -----");
                System.out.printf("Programa Calculadora simples%nByJoão Marcos%n");
                System.out.print("-----------------");
            break;
            case 3:
                System.out.print("----- Sair -----");
                System.out.printf("Deseja sair? [S/N]");
                String sair = sc.next();

                if(sair == "S"){
                    System.out.println("Desconectando...");
                    System.exit(0);
                }else{
                    System.out.println("Conectado...");
                    System.exit(1);
                }


            break;
        }
        sc.close();
    }
}