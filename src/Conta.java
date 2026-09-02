public class Conta {
    Double saldo = 100.00;

    public void depositar(Double valor) {
        saldo += valor;

    }


    public void sacar(Double valor) {
           if(valor <= saldo) {
               saldo -= valor;
           }
        else if (valor > saldo) {
               System.out.println("Sem saldo");
        }
    }


    @Override
    public String toString() {
        return "Conta{" +
                "saldo=" + saldo +
                '}';
    }
}
