import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        System.out.print("Digite 3 numeros: ");
        System.out.printf("Valor1: %d%nValor2: %d%nValor3: %d%n", a , b, c);

        int maior = numMaior(a, b, c);
        mostreResult(maior);
        sc.close();
    }

    // funções
    public static int numMaior(int x, int y, int z){
        int resultado;
        if (x > y && x > z){
            resultado = x;

        }else if (x > z){
            resultado = y;
        }else{
            resultado = z;
        }

        return resultado;
    }  

    public static void mostreResult(int FinalValue){
        System.out.printf("O maior numero é %d", FinalValue);
    }
}
