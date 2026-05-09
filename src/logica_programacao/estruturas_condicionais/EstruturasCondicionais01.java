package logica_programacao.estruturas_condicionais;

public class EstruturasCondicionais01 {
    public static void main(String[] args) {

        // idade < 15 categoria infantil
        // idade >15 && idade< 18 categoria juvenil
        // idade > 18 categoria adulto
        String categoria;
        int idade = 17;
        if (idade < 15) {
            categoria = "Categoria Infantil";
        } else if (idade >= 15 && idade < 18) {
            categoria = "Categoria Juvenil";
        } else {
            categoria = "Categoria Adulto";
        }
    }
}