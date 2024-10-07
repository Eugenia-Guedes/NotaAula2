public class ContaPoupanca extends ContaBancaria {

    private double selic;

    public ContaPoupanca(String nomeTitular, double taxaSelic) {
        super(nomeTitular);
        this.selic = taxaSelic;
    }

    public void calcularRendimento() {
        double rendimento;
        if (selic > 8.5) {
            rendimento = 0.005 * saldo;
        } else {
            rendimento = 0.007 * selic * saldo;
        }
        saldo += rendimento;
        System.out.println("Rendimento de R$ " + rendimento + " calculado e adicionado ao saldo.");
    }

    public void exibirDados() {
        System.out.println("Dados da Conta Poupança: ");
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: R$ " + saldo);
        System.out.println("Taxa Selic atual: " + selic + "% ao ano");
    }

}

