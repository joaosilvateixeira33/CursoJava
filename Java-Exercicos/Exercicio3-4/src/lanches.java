import java.util.Scanner;
public class lanches {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner (System.in);
        System.out.println("Codigo do produto: ");
        int codigo = sc.nextInt();
        System.out.printf("%n");
        System.out.println("Quantidade do produto: ");
        int quantidade = sc.nextInt();
        System.out.printf("%n");

        double total;
        if (codigo == 1){
            total = quantidade * 4.0;
        }else if (codigo == 2){
            total = quantidade * 4.50;
        }else if (codigo == 3){
            total = quantidade * 5.00;
        }else if (codigo == 4){
            total = quantidade * 2.00;
        }else{
            total = quantidade * 1.50;
        }

        System.out.printf("Total: %.2f%n", total);
        sc.close();
    }
}
