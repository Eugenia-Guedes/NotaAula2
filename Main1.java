import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ContaBancaria conta = null;

        System.out.println("Bem vinfo ao Sistema Bancário.");
        System.out.print("Digite o nome do titular: ");
        String titular = scanner.nextLine();

        System.out.println("Selecione o tipo da conta:");
        System.out.println("1. Conta Corrente");
        System.out.println("2. Conta Poupança");
        int escolha = scanner.nextInt();

        if (escolha == 1) {
            conta = new ContaCorrente(titular);
        } else if (escolha == 2) {
            System.out.print("Digite a taxa Selic atual (% ao ano): ");
            double selic = scanner.nextDouble();
            conta = new ContaPoupanca(titular, selic);
        } else {
            System.out.println("Opção inválida.");
            System.exit(0);
        }

        int opcao;
        do {
            System.out.println("Menu: ");
            if (conta instanceof ContaCorrente) {
                System.out.println("1. Depositar");
                System.out.println("2. Sacar");
                System.out.println("3. Usar Cheque Especial");
                System.out.println("4. Exibir Dados da Conta");
            } else if (conta instanceof ContaPoupanca) {
                System.out.println("1. Depositar");
                System.out.println("2. Sacar");
                System.out.println("3. Calcular Rendimento");
                System.out.println("4. Exibir Dados da Conta");
            }
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção:");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o valor do depósito: ");
                    double deposito = scanner.nextDouble();
                    conta.depositar(deposito);
                    break;
                case 2:
                    System.out.print("Digite o valor do saque: ");
                    double saque = scanner.nextDouble();
                    conta.sacar(saque);
                    break;
                case 3:
                    if (conta instanceof ContaCorrente) {
                        System.out.print("Digite o valor a utilizar do cheque especial: ");
                        double cheque = scanner.nextDouble();
                        ((ContaCorrente) conta).usarChequeEspecial(cheque);
                    } else if (conta instanceof ContaPoupanca) {
                        ((ContaPoupanca) conta).calcularRendimento();
                    }
                    break;
                case 4:
                    conta.exibirDados();
                    break;
                case 5:
                    System.out.println("Encerrando o sistema. Obrigado!");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 5);

        scanner.close();

    }
}