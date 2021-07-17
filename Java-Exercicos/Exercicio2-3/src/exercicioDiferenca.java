import java.util.Scanner;
public class exercicioDiferenca {
    public static void main(String[] args) throws Exception {
        Scanner user = new Scanner(System.in);
        int A = user.nextInt();
        int B = user.nextInt();
        int C = user.nextInt();
        int D = user.nextInt();

        int diferenca = (A*B-C*D);
        System.out.printf("Diferença: %d", diferenca);
        user.close();
    }
}
