package application

import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuBancario extends ContaBancaria {
    public static void exibirMenu() {
        MenuBancario menu = new MenuBancario();
        Scanner sc = new Scanner(System.in);
        int opcao = -1;

        while (opcao != 3) {
            System.out.println("\n---------------------SEJA BEM VINDO AO SEU BANCO---------------");
            System.out.println("[1] - Cadastrar Conta Bancaria");
            System.out.println("[2] - Ver Conta Bancaria");
            System.out.println("[3] - Sair");
            System.out.println("-------------------------------------------------------------------");
            System.out.println("\nDigite a opção desejada: ")

            try {
                opcao = sc.nextLine();
            } catch (InputMismatchException e) {
                System.err.println("\nPor favor, insira uma opção válida");
                sc.next();
                continue;
            }
            menu.filtrarOpcao(opcao);
        
        }
        System.out.println("\nSainda...");
        System.out.println("\n / \\\\__");
        System.out.println("  (   @\\___");
        System.out.println(" / (________/");
        System.out.println("/_________/ U\n");
        sc.close();
    }
    public void filtrarOpcao(int opcao) {
        switch (opcao) {
            case 1:
                cadastrarContaBancaria();
                break;

            case 2:
                entrarContaBancaria();
                break;
        }
    }   
}