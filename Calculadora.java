public class Calculadora {

    /**
     * Executa uma operação matemática básica.
     * @param operacao
     * @param a Primeiro número
     * @param b Segundo número
     * @return Resultado da operação
     */
   public double bem(String operacao, double a, double b) {

    switch (operacao.toLowerCase()) {
        case "soma":
            return a + b;

        case "subtracao":
            return a - b;

        case "multiplicacao":
            return a * b;

        case "divisao":
            if (b != 0) {
                return a / b;
            } else {
                throw new IllegalArgumentException("Não pode dividir por zero");
            }

        default:
            throw new IllegalArgumentException("Operação inválida: " + operacao);
    }
}

    // Método principal para testar
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        calc.bem("soma", 10, 5);
    }
}

