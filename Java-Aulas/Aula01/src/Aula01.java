import java.util.Locale;

public class Aula01 {

	public static void main(String[] args) {
		//Aula 01 - primeiro programa
		//para dar quebra de linha usamos o print com ln
		/*System.out.println("Olá, mundo!!");
		System.out.println("Bom dia!!");
		
		//para chamar uma variavel inteira
		int num = 22;
		System.out.println(num);
		
		//para chamar uma variavel double
		double doub = 20.21345;
		System.out.println(doub);
		//formatação de double de 2 e 4 casas decimais
		System.out.printf("%.2f%n", doub);
		//para mudar a virgula para o ponto
		Locale.setDefault(Locale.US);
		System.out.printf("%.4f%n", doub);
		
		//formatação de texto em 1 linha
		System.out.printf("A altura é de: %.2f metros%n", doub);*/
		
		//para colocar varios elementos em 1 só escrita ou linha
		String nome = "João Marcos";
		int idade = 22;
		double salario = 100.00;
		System.out.printf("%s tem %d anos %nseu salario é R$ %.2f", nome, idade, salario);

	}

}
