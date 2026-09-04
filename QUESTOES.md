# Desafios práticos — POO Aula 01

Resolva os desafios diretamente nos arquivos `.java` deste projeto. Teste cada alteração no `Main` antes de passar para o próximo desafio.

## Desafio 1 — Fazer o programa iniciar

Corrija o método `main` para que o programa possa ser executado normalmente pela IDE ou pelo terminal.

Depois, execute o programa e confirme que ele imprime o saldo da conta.

## Desafio 2 — Exibir o cliente completo

Altere o `Main` para imprimir o objeto `cliente1` usando `System.out.println(cliente1)`.

Confira se o nome, o CPF e os dados da conta aparecem no console. Se necessário, melhore os métodos `toString()` para deixar a saída mais legível.

## Desafio 3 — Criar uma segunda conta

Crie um segundo cliente e uma segunda conta.

Requisitos:

- o segundo cliente deve ter nome e CPF diferentes;
- cada cliente deve estar associado à sua própria conta;
- a primeira conta deve ter saldo final diferente da segunda;
- imprima os dois clientes no console.

## Desafio 4 — Validar depósitos

Modifique `depositar` para aceitar apenas valores maiores que zero.

Teste depósito de `100.0`, `0.0` e `-50.0`. O saldo não deve ser alterado nas duas últimas situações.

## Desafio 5 — Validar saques

Melhore `sacar` para rejeitar saques maiores que o saldo, iguais a zero e negativos.

Mostre uma mensagem diferente para cada tipo de operação inválida.

## Desafio 6 — Criar consulta de saldo

Crie um método `consultarSaldo()` na classe `Conta` que mostre o saldo atual no console.

Use esse método no `Main` depois de cada depósito e de cada saque.

## Desafio 7 — Encapsular o saldo

Faça o atributo `saldo` deixar de ser acessado diretamente: declare-o como `private`, crie um método público para consultar o saldo e mantenha `depositar` e `sacar` como as formas de alterar o saldo.

Atualize o `Main` para funcionar com essa mudança e impeça comandos como `conta1.saldo = 0.0`.

## Desafio 8 — Criar construtores

Crie um construtor para `Cliente` que receba `nome` e `cpf`.

Crie também um construtor para `Conta` que receba o saldo inicial. Use os construtores no `Main`, em vez de preencher os atributos diretamente após o `new`.

## Desafio 9 — Associar conta ao cliente

Crie um método `adicionarConta(Conta conta)` na classe `Cliente`. Ele deve rejeitar uma conta nula e associar a conta ao cliente.

Use o método no `Main` no lugar de `cliente1.conta = conta1`.

## Desafio 10 — Transferência entre contas

Crie um método `transferir(Conta destino, Double valor)` na classe `Conta`.

Uma transferência só pode acontecer quando a conta de destino não for nula, o valor for maior que zero e houver saldo suficiente na conta de origem.

Teste uma transferência válida e duas inválidas. Ao final, mostre os saldos das duas contas.

## Desafio 11 — Histórico de operações

Adicione à classe `Conta` um histórico simples das operações realizadas.

Registre depósitos, saques e transferências. Crie um método para imprimir o histórico no console. Operações recusadas também devem ser registradas.

## Desafio 12 — Menu bancário

Transforme o `Main` em um menu usando `Scanner`.

O usuário deve poder escolher: depositar, sacar, consultar saldo, transferir, exibir dados do cliente ou sair. O menu deve continuar aparecendo até a escolha da opção de saída.

## Desafio final — Pequeno sistema bancário

Junte os desafios anteriores em um programa funcional com pelo menos dois clientes, duas contas, validações, transferência, histórico e menu.

Critério de conclusão: o usuário deve conseguir executar operações pelo menu sem alterar o saldo diretamente e sem permitir valores inválidos.
