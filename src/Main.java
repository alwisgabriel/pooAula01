public class Main {

    static void main() {
        Cliente cliente1 = new Cliente();
        cliente1.nome = "Kauan Mello Cancelier";
        cliente1.cpf = "123.456.789-10";

        Conta conta1 = new Conta();
        conta1.saldo = 0.0;

       cliente1.conta = conta1;

       conta1.depositar();

    }
}