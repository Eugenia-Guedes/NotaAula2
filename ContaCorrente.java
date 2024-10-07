public class ContaCorrente extends ContaBancaria {

    private double chequeEspecial;

    public ContaCorrente(String nomeTitular) {
        super(nomeTitular);
        chequeEspecial = 1000.0;
    }

    public boolean usarChequeEspecial(double valorCheque) {
        if (valorCheque <= (saldo + chequeEspecial)) {
            saldo -= valorCheque;
            System.out.println("Utilização de R$ " + valorCheque + " do cheque especial realizada com sucesso.");
            return true;
        } else {
            System.out.println("Cheque especial insuficiente.");
            return false;
        }
    }

    public void exibirDados() {
        System.out.println("Dados da Conta Corrente:");
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: R$ " + saldo);
        System.out.println("Limite do Cheque Especial: R$ " + chequeEspecial);
    }
}
