package entendendoMetodos.aula1;

public class Main {
    public static void main(String[] args) {

        //CalculadoraBasica
        System.out.println("Exercício Calculadora:");
        CalculadoraBasica.soma(3, 6);
        CalculadoraBasica.subtracao(9, 1.8);
        CalculadoraBasica.multiplicacao(7, 8);
        CalculadoraBasica.divisao(5, 2.5);

        System.out.println();

        //Mensagem
        System.out.println("Exercício Mensagem");
        Mensagem.obterMensagem(9);
        Mensagem.obterMensagem(14);
        Mensagem.obterMensagem(1);
        Mensagem.obterMensagem(30);

        System.out.println();

        //Emprestimo
        System.out.println("Exercício Empréstimo");
        Emprestimo.calcular(1000, 2);
        Emprestimo.calcular(1000, 3);
        Emprestimo.calcular(1000,4);
    }
}
