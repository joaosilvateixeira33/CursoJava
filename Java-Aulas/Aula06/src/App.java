import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int minutos = sc.nextInt();

        double conta = 50.0;
        if(minutos > 100){
            conta += (minutos - 100) * 2;
        }

        System.out.printf("Valor cobrado: R$ %.2f%n", conta);
        sc.close();
        
    }
}
