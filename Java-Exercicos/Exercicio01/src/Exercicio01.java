public class Exercicio01 {

	public static void main(String[] args) {
		//Entrada
		String produto01 = "computador";
		String produto02 = "Office desk";
		
		int dia = 30;
		int code = 5290;
		char gender = 'F';
		
		double preco01 = 2100.0;
		double preco02 = 650.50;
		double measure = 53.234567;
		
		//Saida
		System.out.println("Products:");
		System.out.printf("%s, which price is $ %.2f%n%s, which price is $ %.2f%n", produto01, preco01, produto02, preco02);
		System.out.println();
		System.out.printf("Record: %d years old, code %d and gender: %c%n", dia, code, gender);
		System.out.println();
		System.out.printf("Measure with eight decimal places: %f%nRounded: (three decimal places): %.3f", measure, measure);
		
	}

}