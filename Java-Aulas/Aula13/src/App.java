import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        char resp;
        do{
            System.out.println("Digite a Temperatura em Celsus: ");
            double c = sc.nextDouble();
            double f = 9.0 * c / 5.0 + 32;
            System.out.printf("Equivalente a Fraheint: %2.f", f);

            System.out.println("Desja repetir a operação? [s/n]");
            resp = sc.next().charAt(0);
        } while (resp != 'n'|| resp != 'N');

        sc.close();
    }
}
