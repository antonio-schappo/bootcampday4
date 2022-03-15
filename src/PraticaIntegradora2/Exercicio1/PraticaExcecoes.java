package PraticaIntegradora2.Exercicio1;

public class PraticaExcecoes {

    public static void razao() {
        int a = 0;
        int b = 300;

        try {
            System.out.println(b / a);
        } catch (ArithmeticException e) {
            throw new IllegalArgumentException("Nao pode ser dividido por zero");
        } finally {
            System.out.println("Programa finalizado");
        }
    }
}
