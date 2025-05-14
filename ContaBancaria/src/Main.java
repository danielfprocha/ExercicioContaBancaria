public class Main {
    public static void main(String[] args) throws Exception {
        // Criação da primeira conta bancária
        ContaBancaria c1 = new ContaBancaria(3708, "Daniel", 1000.00);

        // Exibe saldo inicial
        System.out.printf("Saldo Inicial (c1): R$%.2f%n" , c1.getSaldo());

        // Realiza depósito
        c1.depositar(300.00);
        System.out.printf("Após depósito de R$300,00: R$%.2f%n" , c1.getSaldo());

        // Realiza saque
        boolean ok = c1.sacar(800.00);
        System.out.println("Tentativa de saque de R$800,00: " + (ok ? "Sucesso." : "Falha."));

        // Exibe saldo final
        System.out.printf("Saldo Final (c1): R$%.2f%n%n" , c1.getSaldo());

        
        // Criação da segunda conta bancária
        ContaBancaria c2 = new ContaBancaria(5512, "Alexandre Montanha", 500000.00);

        // Exibe saldo inicial
        System.out.printf("Saldo Inicial (c2): R$%.2f%n" , c2.getSaldo());

        // Realiza depósito
        c2.depositar(125000.00);
        System.out.printf("Após depósito de R$125.000,00: R$%.2f%n" , c2.getSaldo());

        // Realiza saque
        ok = c2.sacar(700000.00);
        System.out.println("Tentativa de saque de R$700.000,00: " + (ok ? "Sucesso." : "Falha."));

        // Exibe saldo final
        System.out.printf("Saldo Final (c2): R$%.2f%n" , c2.getSaldo());
    }
}
