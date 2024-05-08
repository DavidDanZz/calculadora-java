class Operacao {

    private double primeiroOperando;
    private double segundoOperando;
    private double resultado;

    public void setPrimeiroOperando(double primeiroOperando) {
        this.primeiroOperando = primeiroOperando;
    }

    public void setSegundoOperando(double segundoOperando) {
        this.segundoOperando = segundoOperando;
    }

    public void soma() {
        this.resultado = primeiroOperando + segundoOperando;
    }

    public void subtracao() {
        this.resultado = primeiroOperando - segundoOperando;
    }

    public void multiplicacao() {
        this.resultado = primeiroOperando * segundoOperando;
    }

    public void divisao() {
        this.resultado = primeiroOperando / segundoOperando;
    }

    public double getResultado() {
        return resultado;
    }
}