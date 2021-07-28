import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        double xA, xB, xC, yA, yB, yC;

        System.out.println("Digite os lados do triangulo X: ");
        xA = sc.nextDouble();
        xB = sc.nextDouble();
        xC = sc.nextDouble();
        System.out.println("Digite os lados do triangulo Y: ");
        yA = sc.nextDouble();
        yB = sc.nextDouble();
        yC = sc.nextDouble();

        double p = (xA + xB + xC)/2;
        double areaX = Math.sqrt(p*(p - xA)* (p - xB)* (p-xC));

        p = (yA + yB + yC)/2;
        double areaY = Math.sqrt(p*(p - yA)* (p - yB)* (p-yC));

        System.out.printf("Area do triangulo X: %.4f%n",areaX);
        System.out.printf("Area do triangulo Y: %.4f%n",areaY);

        if(areaX > areaY){
            System.out.print("A area maior é a area X");
        }else{
            System.out.print("A area maior é a area Y");
        }
        sc.close();
    }
}
