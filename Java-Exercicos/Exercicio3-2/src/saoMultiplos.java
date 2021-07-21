import java.util.Scanner;
public class saoMultiplos{
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite dois Numeros: ");
        int A = sc.nextInt();
        int B = sc.nextInt();

        if(A % B == 0 || B % A ==0){
            System.out.println("São Multiplos");
        }else{
            System.out.println("Não sao Multiplos");
        }
        sc.close();
    }
}
