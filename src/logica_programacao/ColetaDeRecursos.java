package logica_programacao;

import java.util.Scanner;

public class ColetaDeRecursos {
    public static void main(String[] args) {
        int recursosColetados = 0;
        int totalOuroAcumulado = 0;

        Scanner sc = new Scanner(System.in);

        for(int i=1; i<=5; i++){
            System.out.println("Quantos recursos você coletou no baú " +i+ "?\n");
            recursosColetados = sc.nextInt();
            totalOuroAcumulado = totalOuroAcumulado + recursosColetados;
        }

        System.out.println("Parabéns, você coletou um total de " +totalOuroAcumulado+ " de ouro!");
    sc.close();
    }
}
