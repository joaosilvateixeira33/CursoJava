package aplication;

import java.util.Scanner;

import entilites.Triangulo;

public class aula19 {

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

        double areaX = x.area();

        double areaY = y.area();

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
