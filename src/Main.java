import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        // Cliente 1
        Cliente cliente1 = new Cliente("Kauan Mello Cancelier", "123.456.789-10");
        Conta conta1 = new Conta(1000.0);
        cliente1.adicionarConta(conta1);

        // Cliente 2
        Cliente cliente2 = new Cliente("Gabriel Fernandes Alves", "104.256.289-06");
        Conta conta2 = new Conta(500.0);
        cliente2.adicionarConta(conta2);

        Cliente clienteAtual = cliente1;
        Conta contaAtual = conta1;

        do {
            System.out.println("\n===== MENU BANCARIO =====");
            System.out.println("Operando como: " + clienteAtual.nome);
            System.out.println("1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Consultar saldo");
            System.out.println("4 - Transferir");
            System.out.println("5 - Exibir dados do cliente");
            System.out.println("6 - Exibir historico");
            System.out.println("7 - Trocar de cliente");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opcao: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Valor do deposito: ");
                    double valorDeposito = scanner.nextDouble();
                    contaAtual.depositar(valorDeposito);
                    break;

                case 2:
                    System.out.print("Valor do saque: ");
                    double valorSaque = scanner.nextDouble();
                    contaAtual.sacar(valorSaque);
                    break;

                case 3:
                    contaAtual.consultarSaldo();
                    break;

                case 4:
                    System.out.print("Digite o valor da transferencia: ");
                    double valorTransferencia = scanner.nextDouble();
                    System.out.println("Transferir para qual conta? (1 - conta do " + cliente1.nome + ", 2 - conta do " + cliente2.nome + ")");
                    System.out.print("Opcao: ");
                    int destino = scanner.nextInt();
                    if (destino == 1) {
                        contaAtual.transferir(conta1, valorTransferencia);
                    } else if (destino == 2) {
                        contaAtual.transferir(conta2, valorTransferencia);
                    } else {
                        System.out.println("Opcao de destino invalida");
                    }
                    break;

                case 5:
                    System.out.println(clienteAtual);
                    break;

                case 6:
                    contaAtual.exibirHistorico();
                    break;

                case 7:
                    if (clienteAtual == cliente1) {
                        clienteAtual = cliente2;
                        contaAtual = conta2;
                    } else {
                        clienteAtual = cliente1;
                        contaAtual = conta1;
                    }
                    System.out.println("Agora operando como: " + clienteAtual.nome);
                    break;

                case 0:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opcao invalida");
            }
        } while (opcao != 0);

        scanner.close();
    }
}
