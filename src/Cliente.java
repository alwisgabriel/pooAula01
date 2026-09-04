public class Cliente {
    String nome;
    String cpf;
    Conta conta;

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public void adicionarConta(Conta conta) {
        if (conta == null) {
            System.out.println("Conta invalida: nao pode ser nula");
            return;
        }
        this.conta = conta;
    }

    public Conta getConta() {
        return conta;
    }



    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", " + conta +
                '}';
    }
}
