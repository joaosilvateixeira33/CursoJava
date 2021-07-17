public class Aula04 {
    public static void main(String[] args) throws Exception {
        //Funçoes matematicas com a Math
        double a, b, c;
        a = 5.0;
        b = 7.0;
        c = 10.0;


        /*raiz quadrada em math
        a = Math.sqrt(a);
        b = Math.sqrt(b);
        c = Math.sqrt(c);

        System.out.printf("Raiz qudrada dos valores a b e c sao respectivamente: %.2f, %.2f, %.2f%n", a, b, c);

        //potencia em math
        a = Math.pow(a, 1.0);
        b = Math.pow(b, 3.0);
        c = Math.pow(c, 5.0);

        System.out.printf("Potencia dos valores A, B e C são respectivamente:  %.2f, %.2f, %.2f%n", a, b, c);*/

        //Abstrato em math
        a = Math.abs(a);
        b = Math.abs(b);
        c = Math.abs(c);

        System.out.printf("o valar redondo dos valores A, B e C são respectivamente:  %.2f, %.2f, %.2f%n", a, b, c);


    }
}
