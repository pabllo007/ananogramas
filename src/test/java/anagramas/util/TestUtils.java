package anagramas.util;

public class TestUtils {
    public static int fatorial(int n) {
        if (n < 0) throw new IllegalArgumentException("Não existe fatorial de número negativo.");

        int resultado = 1;
        for (int i = 2; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }
}
