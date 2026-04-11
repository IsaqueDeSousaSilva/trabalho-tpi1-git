public class Calculadora {

    /**
     * Executa uma operação matemática básica.
     * @param operacao Tipo da operação: "subtracao", "multiplicacao"
     * @param a Primeiro número
     * @param b Segundo número
     * @return Resultado da operação
     */
 HEAD
 HEAD
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

    public double calcular(String operacao, int a, int b) {
        switch (operacao.toLowerCase()) {
            case "soma":
                return a + b;

    public double calcular(String operacao, int a, int b) {
        switch (operacao.toLowerCase()) {
 2774d2f3b753a41c6c2de8eb00768e7cf4bf3278
            case "subtracao":
                return a - b;
            case "multiplicacao":
                return a * b;
 HEAD
            case "divisao":
                if (b == 0) {
                    throw new IllegalArgumentException("Divisão por zero não é permitida!");
                }
                return (double) a / b;
            default:
                throw new IllegalArgumentException("Operação inválida: " + operacao);
        }
 oresgate

        }
 2774d2f3b753a41c6c2de8eb00768e7cf4bf3278
    }

    // Método principal para testar
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
 HEAD
 HEAD

        calc.bem("soma", 10, 5);

        
        System.out.println("Soma: " + calc.calcular("soma", 10, 5));
        System.out.println("Subtração: " + calc.calcular("subtracao", 10, 5));
        System.out.println("Multiplicação: " + calc.calcular("multiplicacao", 10, 5));
        System.out.println("Divisão: " + calc.calcular("divisao", 10, 5));
 oresgate

        System.out.println("Subtração: " + calc.calcular("subtracao", 10, 5));
        System.out.println("Multiplicação: " + calc.calcular("multiplicacao", 10, 5));
 2774d2f3b753a41c6c2de8eb00768e7cf4bf3278
    }
}