import java.util.Scanner;
public class Aula05 {
    public static void main(String[] args) throws Exception {
        /*Estrutura condicional Simples
        int x = 1;
        if (x >0){
            System.out.print("Bom dia");
        }*/

        /*Estrutura condicional composta
        Scanner sc = new Scanner(System.in);
        int hora;

        System.out.println("Que horas sao? ");
        hora = sc.nextInt();
        if (hora < 12){
            System.out.println();
        }else{
            System.out.println("Boa tarde!!");
        }

        sc.close();*/

        //Estrutura condicional encadeada
        Scanner sc = new Scanner(System.in);
        int hora;

        System.out.println("Que horas sao? ");
        hora = sc.nextInt();
        if (hora < 12){
            System.out.println("Bom dia!!");
        }else{
           if (12 <= hora && hora< 18){
               System.out.println("Boa tarde!!");
           }else{
               if(hora > 18){
                   System.out.println("Boa noite!!");
               }
           }
        }

        sc.close();
    }
}
