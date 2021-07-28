package aplication;

import java.util.Scanner;

import entilites.Triangulo;

public class aula18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Triangulo x, y;
		y = new Triangulo();
		x = new Triangulo();
		
        System.out.println("Digite os lados do triangulo X: ");
        x.a= sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();
        System.out.println("Digite os lados do triangulo Y: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double p = (x.a + x.b + x.c)/2;
        double areaX = Math.sqrt(p*(p - x.a)* (p - x.b)* (p-x.c));

        p = (y.a + y.b + y.c)/2;
        double areaY = Math.sqrt(p*(p - y.a)* (p - y.b)* (p-y.c));

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
