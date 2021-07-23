import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        int soma = 0;
        while(x != 0){
            soma += x;
            x = sc.nextInt();
        }
        System.out.printf("A soma dos numeros digitados é %d%n", soma);
        sc.close();
    }
}
