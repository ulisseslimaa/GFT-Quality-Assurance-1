package br.com.dio.aulaMetodos;

public class Main {
    public static void main(String[] args) {

        //Calculadora
        System.out.println("Exercício da calculadora simples");
        Calculadora.soma(5, 10);
        Calculadora.subtracao(35, 15);
        Calculadora.multiplicacao(5, 5);
        Calculadora.divisao(100, 10);

        //Mensagem
        System.out.println("Exercício Mensagem");
        Mensagem.obterMensagem(5);
        Mensagem.obterMensagem(13);
        Mensagem.obterMensagem(1);

        //Emprestimo
        System.out.println("Exercício Empréstimo");
        Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
        Emprestimo.calcular(5000, 4);

    }
}
