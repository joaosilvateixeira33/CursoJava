import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int senha;
        
        senha = sc.nextInt();
        while(senha != 2002){
            System.out.println("Senha Invalida");
			senha = sc.nextInt();
            System.exit(0);
        }

        System.out.print("Acesso Permitido");
        System.exit(0);
        sc.close();

    }
}
