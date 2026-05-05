package logica_programacao;

import java.util.Scanner;

public class TestesJava {
    public static void main(String[] args){
        double nota1;
        double nota2;
        double nota3;

        Scanner scanf = new Scanner(System.in);
        System.out.println("Digite a primeira nota: ");
        nota1 = scanf.nextDouble();
        System.out.println("Digite a segunda nota: ");
        nota2 = scanf.nextDouble();
        System.out.println("Digite a terceira nota: ");
        nota3 = scanf.nextDouble();

        double media = (nota1+nota2+nota3)/3;

        if(media >= 7.0){
            System.out.println("Aprovado");
        } else if(media >= 5.0){
            System.out.println("Recuperação");
        } else {
            System.out.println("Reprovado");
        }
    }
}
