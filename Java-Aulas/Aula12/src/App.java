import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int soma = 0;
        for(int i = 0; i<N; i++){
            int x = sc.nextInt();
            soma = soma + x;
        }

        System.out.print(soma);
        sc.close();
    }
}
