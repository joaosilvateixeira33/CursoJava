import java.util.Scanner;
public class parImpar{
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Par ou impar??");

        System.out.println("Digite um numero: ");
        num = sc.nextInt();

        if (num % 2 == 0){
            System.out.println("Numero é par");
        }else{
            System.out.println("Numero é impar");
        }
        sc.close();
    }
}
