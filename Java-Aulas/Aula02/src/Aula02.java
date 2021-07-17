import java.util.Scanner;
public class Aula02 {
    public static void main(String[] args) throws Exception {
       /*Entrada de dados simples
       Scanner sc = new Scanner(System.in);
       String x;
       x = sc.next();
       System.out.printf("Você digitou: %s", x);
       sc.close();*/

       /*entrada de dados inteiros
       Scanner sc = new Scanner(System.in);
       int y;
       y = sc.nextInt();
       System.out.printf("Voce digitou o numero: %d", y);
       sc.close();*/

       /*entrada de dados decimais
       Scanner sc = new Scanner(System.in);
       double z;
       z = sc.nextDouble();
       System.out.printf("Voce digitou o numero: %.2f", z);
       sc.close();*/

       /*entrada de dados decimais
       Scanner sc = new Scanner(System.in);
       char sexo;
       sexo = sc.next().charAt(0);
       System.out.printf("Voce digitou o sexo: %c", sexo);
       sc.close();*/

       //entrada de varios
       Scanner sc = new Scanner(System.in);
       String nome;
       int idade;
       char sexo;
       double altura;

       nome = sc.next();
       idade = sc.nextInt();
       sexo = sc.next().charAt(0);
       altura = sc.nextDouble(); 

       System.out.printf("Voce digitou os dados: %n%s%n%d%n%c%n%.2f", nome, idade, sexo, altura);
       sc.close();

    }
}
