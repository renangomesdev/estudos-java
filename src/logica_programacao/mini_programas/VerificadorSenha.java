package logica_programacao.mini_programas;

import java.util.Scanner;

public class VerificadorSenha {
    public static void main(String[] args) {

        String senhaCorreta = "java123";
        String senhaDigitada = "";

        Scanner sc = new Scanner(System.in);

        while(!senhaDigitada.equals(senhaCorreta)){

            System.out.println("Olá, Digite a senha para acessar o sistema: ");
            senhaDigitada = sc.next();

            if(senhaDigitada.equals(senhaCorreta)){
                System.out.println("Senha correta, acesso concedido!");
            }
            else{
                System.out.println("Senha incorreta, tente novamente!");
            }
        }

        sc.close();
    }
}
