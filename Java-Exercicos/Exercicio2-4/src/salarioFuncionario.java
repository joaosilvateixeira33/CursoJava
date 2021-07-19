import java.util.Scanner;
import java.util.Locale;
public class salarioFuncionario {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);

        Scanner user = new Scanner(System.in);
        int funcionario = user.nextInt();
        int horasTrab = user.nextInt();
        double recebHoras = user.nextDouble();

        double salario = horasTrab * recebHoras;

        System.out.printf("Funcionario: %d%nSalario: U$ %.2f%n", funcionario, salario);
        user.close();
    }
}
