package logica_programacao.mini_programas;

import java.util.Scanner;

public class SistemaSaque {
    public static void main(String[] args) {
        double saldo = 1000.0;
        double limiteDiario = 500.0;
        double valorSaque = -1;

        Scanner sc = new Scanner(System.in);

        while (valorSaque != 0) {
            System.out.println("\nDigite o valor do saque (ou 0 para sair): ");
            valorSaque = sc.nextDouble();

            if (valorSaque == 0) {
                System.out.println("Sessão encerrada.");
            } else if (valorSaque < 0) {
                System.out.println("Valor inválido.");
            } else if (valorSaque > saldo) {
                System.out.println("Saldo insuficiente. Saldo atual: R$ " + saldo);
            } else if (valorSaque > limiteDiario) {
                System.out.println("Limite diário excedido. Limite disponível: R$ " + limiteDiario);
            } else {
                saldo -= valorSaque;
                limiteDiario -= valorSaque;
                System.out.println("Saque realizado com sucesso!");
                System.out.println("Saldo restante: R$ " + saldo + " | Limite restante: R$ " + limiteDiario);
            }
        }

        sc.close();
    }
}