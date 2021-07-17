import java.util.Scanner;
public class raioCirculo {
    public static void main(String[] args) throws Exception {
        Scanner user = new Scanner(System.in);

        double pi = 3.14159;
        double raio = user.nextDouble();

        double raioQuadrado = Math.pow(raio, 2.0);
        double area = pi * raioQuadrado;

        System.out.printf("Altura = %.4f",area);

        user.close();
    }
}
