package logica_programacao.estruturas_condicionais;

public class EstruturasCondicionais02 {
    public static void main(String[] args) {
        //Doar se salario > 5000
        double salario = 6000;
        String mensagemDoar = "Eu vou doar 500 pro projeto";
        String mensagemNaoDoar = "Eu não vou doar nada pro projeto";
        //(condicao) ? verdadeiro : falso
        String resultado = (salario>5000) ? mensagemDoar : mensagemNaoDoar;
        System.out.println(resultado);
    }
}
