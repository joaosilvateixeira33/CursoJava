import java.util.Scanner;
public class numNegativo {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.println("Digite um numero: ");
        num = sc.nextInt();
        if (num < 0){
            System.out.println("Numero negativo");
        }else{
            System.out.println("Numero positivo");
        }
        sc.close();
    }
}
