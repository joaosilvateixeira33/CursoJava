import java.util.Scanner;
public class Aula03 {
    public static void main(String[] args) throws Exception {
        /*entrada de dados com enter
        Scanner user = new Scanner(System.in);
        String s1, s2, s3;
        s1 = user.nextLine();
        s2 = user.nextLine();
        s3 = user.nextLine();

        System.out.printf("Voce digitou com quebra de linha: %n%s%n%s%n%s", s1, s2, s3);
        user.close();*/

        //quebra de linha pendente
        Scanner user = new Scanner(System.in);
        String s1, s2, s3;
        int i1;

        i1 = user.nextInt();
        user.nextLine(); //importante essa linha pois o java ira escrever e nao dara err
        
        s1 = user.nextLine();
        s2 = user.nextLine();
        s3 = user.nextLine();

        System.out.printf("Voce digitou com quebra de linha: %n%d%n%s%n%s%n%s", i1, s1, s2, s3);
        user.close();
    }
}
