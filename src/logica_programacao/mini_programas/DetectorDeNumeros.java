package logica_programacao.mini_programas;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DetectorDeNumeros {
    public static void main(String[] args) {

        int numero = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Olá usuário, seja bem vindo ao detector de números!");
        System.out.println("Informe o número que deseja verificar: ");

        try{
        numero = sc.nextInt();

            if (numero % 2 == 0) {
                System.out.println("O número " + numero + " é par!");
            } else {
                System.out.println("O número" + numero + " é impar!");
            }

        } catch (InputMismatchException e) {
            System.out.println("Ops, ocorreu um erro! Por favor, informe um número inteiro válido.");
        }
    }
}