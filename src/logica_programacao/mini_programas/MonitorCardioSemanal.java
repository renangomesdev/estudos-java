package logica_programacao.mini_programas;
import java.util.Scanner;

public class MonitorCardioSemanal {
    public static void main(String[] args) {
        int corrida1 = 0;
        int corrida2 = 0;
        int corrida3 = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Olá Usuário, seja bem-vindo ao monitor de corrida semanal!");
        System.out.println("Por favor, insira o tempo percorrido na primeira corrida: ");
        corrida1 = sc.nextInt();
        System.out.println("Por favor, insira o tempo percorrido na segunda corrida: ");
        corrida2 = sc.nextInt();
        System.out.println("Por favor, insira o tempo percorrido na terceira corrida: ");
        corrida3 = sc.nextInt();

        int mediaDasCorridas = (corrida1 + corrida2 + corrida3)/3;

        if(mediaDasCorridas <= 30){
            System.out.println("Você precisa se exercitar mais, tente correr mais um pouco na próxima semana!");
        }
        else if(mediaDasCorridas >= 30 && mediaDasCorridas <=45){
            System.out.println("Parabéns, você manteve um ritmo saudável e bom, continue assim!");
        }
        else{
            System.out.println("Fôlego de atleta!");
        }
    sc.close();
    }
}
