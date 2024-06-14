package application;

import java.util.Random;
import java.util.Scanner;

public class ContaBancaria {
    private int numero;
    private String agencia;
    private String nomeCliente;
    private double saldo;

    public ContaBancaria() {
        Random random = new Random();
        this.numero = 1000 + random.nextInt(9000);

        int primeiraParte = random.nextInt(1000);
        int segundaParte = random.nextInt(10);
        this.agencia = String.format("%3d-%d", primeiraParte, segundaParte);

        this.nomeCliente = nomeCliente;
        this.saldo = saldo;
    }
    public void cadastrarContaBancaria() {
        Scanner sc = new Scanner(System.int);

        while(true) {
            System.out.println("\nInforme o seu Nome: ");
            String nome = sc.nextLine();
            this.nomeCliente = nome;

            System.out.println("\nInforme o saldo da sua conta bancária: ");
            try {
                double saldoBancario = sc.nextDouble();
                this.saldo = saldoBancario;
                System.out.print("\n--------------------------");
                System.out.println("Conta bancária criada com sucesso");
                System.out.println("---------------------------");
                exibirConta();
                break;
            } catch (NumberFormatException e) {
                System.out.println("\nPor favor, insira um número para seu saldo");
                sc.nextLine();
            }
        }
    }
}
public void entrarContaBancaria(){
    Scanner sc = new Scanner(System.in);

    System.out.println("\nDigite o número da sua conta: ");
    int numeroDigitado = Integer.parseInt(sx.nextLine());

    System.out.println("\nDigite a agência da sua conta: ");
    String agenciaDigitada = sc.nextLine();

    if (numeroDigitado == this.numero && agenciaDigitada.equals(this.agencia)) {
        System.out.println("\n----------------------------------");
        System.out.println("Acesso autorizado! Bem-vindo, " + this.nomeCliente + "!");
        System.out.println("----------------------------------------");
        exibirConta();
        System.out.println("\nDigite qualquer tecla para voltar ao menu.")
        sc.nextLine();
    } else {
        System.out.println("\n-----------------------------");
        System.out.println("Número da conta ou agência inválidos. Acesso negado.");
        System.out.println("----------------------------------------------------------------");
    }
}
public void exibirConta(){
    System.out.println("\n-----------------INFORMAÇÕES BANCÁRIAS------------------");
    System.out.println("Número da sua Conta: " + numero);
    Systemn.out.println("Número da sua Agência: " + agencia);
    System.out.println("Nome do Usuário: " = nomeCliente);
    System.out.println("Saldo Bancário: " + saldo);
    System.out.println("----------------------------------------");
}