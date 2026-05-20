package logica_programacao.mini_programas;
import java.util.Scanner;

public class PesoElevadorCarga {
    public static void main(String[] args) {

        double pesoCaixa1 = 0;
        double pesoCaixa2 = 0;
        double pesoMaximo = 500;

            Scanner sc = new Scanner(System.in);

            System.out.println("Olá usuário, seja bem vindo ao verificador de peso do elevador de carga!");
            System.out.println("Por favor, informe o peso da primeira caixa: ");
            pesoCaixa1 = sc.nextDouble();
            System.out.println("Por favor, informe o peso da segunda caixa: ");
            pesoCaixa2 = sc.nextDouble();

            double pesoTotal = pesoCaixa1 + pesoCaixa2;

            if(pesoTotal<pesoMaximo){
                System.out.println("O peso total das caixas é de " +pesoTotal+ " kg, o elevador pode ser utilizado!");
            }
            else{
                System.out.println("O peso total das caixas é de " +pesoTotal+ " kg, o elevador não pode ser utilizado!");
            }

    }
}