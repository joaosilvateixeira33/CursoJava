import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        double largura = sc.nextDouble();
        double comprimento = sc.nextDouble();
        double metroQuadrado = sc.nextDouble();

        double area = largura * comprimento;
        double preco = area * metroQuadrado;

        System.out.printf("Área = %.2f%nPreço = %.2f%n", area, preco);
        sc.close();
    }
}
