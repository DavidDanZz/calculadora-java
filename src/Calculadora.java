import java.util.Scanner;

public class Calculadora {

    private Scanner entrada;
    private Operacao operacao;

    public Calculadora(Scanner entrada) {
        this.entrada = entrada;
        this.operacao = new Operacao();
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Calculadora calculadora = new Calculadora(entrada);

        int operacaoEscolhida = calculadora.obterOperacao();
        double primeiroOperando = calculadora.obterOperandos();
        double segundoOperando = calculadora.obterOperandos();

        calculadora.realizarOperacao(operacaoEscolhida, primeiroOperando, segundoOperando);
        calculadora.exibirResultado();
    }

    private int obterOperacao() {
        System.out.println("Escolha a operação desejada:");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");

        int operacaoEscolhida = entrada.nextInt();
        entrada.nextLine();

        if (operacaoEscolhida < 1 || operacaoEscolhida > 4) {
            System.out.println("Operação inválida. Tente novamente.");
            return obterOperacao();
        }

        return operacaoEscolhida;
    }

    private double obterOperandos() {
        System.out.print("Digite o primeiro operando: ");
        double primeiroOperando = entrada.nextDouble();
        entrada.nextLine();

        System.out.print("Digite o segundo operando: ");
        double segundoOperando = entrada.nextDouble();
        entrada.nextLine();

        return primeiroOperando;
    }

    private void realizarOperacao(int operacaoEscolhida, double primeiroOperando, double segundoOperando) {
        switch (operacaoEscolhida) {
            case 1:
                operacao.setPrimeiroOperando(primeiroOperando);
                operacao.setSegundoOperando(segundoOperando);
                operacao.soma();
                break;
            case 2:
                operacao.setPrimeiroOperando(primeiroOperando);
                operacao.setSegundoOperando(segundoOperando);
                operacao.subtracao();
                break;
            case 3:
                operacao.setPrimeiroOperando(primeiroOperando);
                operacao.setSegundoOperando(segundoOperando);
                operacao.multiplicacao();
                break;
            case 4:
                operacao.setPrimeiroOperando(primeiroOperando);
                operacao.setSegundoOperando(segundoOperando);
                operacao.divisao();
                break;
        }
    }

    private void exibirResultado() {
        System.out.printf("O resultado da operação é: %.2f\n", operacao.getResultado());
    }
}
