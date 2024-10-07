public abstract class ContaBancaria {

    protected String titular;
    protected double saldo;

    public ContaBancaria(String nomeTitular) {
        this.titular = nomeTitular;
        saldo = 0.0;
    }

        public void depositar ( double valor){
            if (valor > 0) {
                saldo += valor;
                System.out.println("Depósito de R$ " + valor + " realizado com sucesso.");
            } else {
                System.out.println("Valor de depósito inválido.");
            }
        }

        public boolean sacar ( double valor){
            if (valor > 0 && valor <= saldo) {
                saldo -= valor;
                System.out.println("Saque de R$ " + valor + " realizado com sucesso.");
                return true;
            } else {
                System.out.println("Saldo insuficiente ou valor inválido.");
                return false;
            }
        }
        public abstract void exibirDados ();
}
