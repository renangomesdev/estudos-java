package logica_programacao.mini_programas;

import java.util.Scanner;

public class BloqueioTentativas {
    public static void main(String[] args) {
        String pinCorreto = "1234";
        String pinDigitado = "";
        int tentativas = 0;

        Scanner sc = new Scanner(System.in);

        while (!pinDigitado.equals(pinCorreto) && tentativas < 3) {
            System.out.println("Digite o seu PIN de segurança: ");
            pinDigitado = sc.next();
            tentativas++;

            if (pinDigitado.equals(pinCorreto)) {
                System.out.println("Acesso liberado.");
            } else if (tentativas == 3) {
                System.out.println("Conta bloqueada por excesso de tentativas.");
            } else {
                System.out.println("PIN incorreto. Tentativas restantes: " + (3 - tentativas));
            }
        }

        sc.close();
    }
}