import java.util.Scanner;
public class ExercicioSoma {
    public static void main(String[] args) throws Exception {
        //Somar valores e ecrever a soma
        Scanner user = new Scanner(System.in);
        int n1 = user.nextInt();
        int n2 = user.nextInt();

        int soma = n1 + n2;

        System.out.printf("Soma = %d", soma);
        user.close();
    }
}
