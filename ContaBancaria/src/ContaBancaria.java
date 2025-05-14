public class ContaBancaria {

    // Criação dos atributos privados (encapsulados)
    private int numeroConta;
    private String titular;
    private double saldo;

    // Criação do construtor 
    public ContaBancaria (int numeroConta, String titular, double saldoInicial) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    // Getter do número da conta
    public int getNumeroConta() {
        return numeroConta;
    }

    // Setter do número da conta
    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    // Getter do titular
    public String getTitular() {
        return titular;
    }

    // Setter do titular
    public void setTitular(String titular) {
        this.titular = titular;
    }

    // Getter do saldo
    public double getSaldo() {
        return saldo;
    }

    // Método para depositar valor
    public void depositar(double valor) {
        saldo += valor;
    }

    // Método para sacar valor (somente se o saldo for maior ou igual ao valor)
    public boolean sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
            return true;
        } else {
            return false;
        }
    }   
    
}
