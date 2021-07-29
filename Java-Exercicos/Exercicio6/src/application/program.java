package application;

import java.util.Locale;
import java.util.Scanner;

import entilites.Rectangle;

public class program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rectangle rect = new Rectangle();
		 
		System.out.println("Enter Rectangle  whidth and height");
		rect.height = sc.nextDouble();
		rect.whidth = sc.nextDouble();
		
		System.out.printf("Area: %.2f", rect.area());
		System.out.printf("%nPerimeter: %.2f", rect.perimetric());
		System.out.printf("%nDiagonal: %.2f", rect.diagonal());
		
		sc.close();

	}

}
