import java.util.ArrayList;
import java.util.List;

public class Conta {
    private Double saldo;
    private final List<String> historico = new ArrayList<>();

    public Conta(Double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public void depositar(Double valor) {
        if (valor == null || valor <= 0) {
            historico.add("Deposito recusado: valor invalido (" + valor + ")");
            System.out.println("Deposito recusado: valor deve ser maior que zero");
            return;
        }
        saldo += valor;
        historico.add("Deposito de R$" + valor + " - saldo: R$" + saldo);
        System.out.println("Deposito realizado com sucesso");
    }

    public void sacar(Double valor) {
        if (valor == null || valor <= 0) {
            historico.add("Saque recusado: valor invalido (" + valor + ")");
            System.out.println("Valor invalido para saque");
        } else if (valor > saldo) {
            historico.add("Saque recusado: saldo insuficiente (tentativa de R$" + valor + ")");
            System.out.println("Sem saldo suficiente");
        } else {
            saldo -= valor;
            historico.add("Saque de R$" + valor + " - saldo: R$" + saldo);
            System.out.println("Saque realizado");
        }
    }

    public void transferir(Conta destino, Double valor) {
        if (destino == null) {
            historico.add("Transferencia recusada: conta de destino nula");
            System.out.println("Transferencia recusada: conta de destino invalida");
        } else if (valor == null || valor <= 0) {
            historico.add("Transferencia recusada: valor invalido (" + valor + ")");
            System.out.println("Transferencia recusada: valor deve ser maior que zero");
        } else if (valor > saldo) {
            historico.add("Transferencia recusada: saldo insuficiente (tentativa de R$" + valor + ")");
            System.out.println("Transferencia recusada: saldo insuficiente");
        } else {
            saldo -= valor;
            destino.depositar(valor);
            historico.add("Transferencia de R$" + valor + " - saldo: R$" + saldo);
            System.out.println("Transferencia realizada com sucesso");
        }
    }

    public void consultarSaldo() {
        System.out.println("Seu saldo e: R$" + saldo);
    }

    public Double getSaldo() {
        return saldo;
    }

    public void exibirHistorico() {
        System.out.println("== Historico de operacoes ==");
        if (historico.isEmpty()) {
            System.out.println("Nenhuma operacao registrada.");
        } else {
            for (String operacao : historico) {
                System.out.println(" - " + operacao);
            }
        }
    }

    @Override
    public String toString() {
        return "Conta{" +
                "saldo=" + saldo +
                '}';
    }
}
