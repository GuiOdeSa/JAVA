package DesafiosIniciais;

import java.util.Scanner;

public class Desafio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double A, B, media;
        //Recebe os valores com uma casa decimal
        A = sc.nextDouble();
        B = sc.nextDouble();

        //TODO: Complete os espaços em branco com as respectivas variáveis para o cálculo da média.
        // Cálculo da média conforme enunciado
        media = ( A * 3.5 + B * 7.5)/11;

        //TODO: Complete com a variável que representa o resultado da média.
        System.out.printf("MEDIA = %.5f", media ); //5f para aparecerem 5 casas após a vírgula ou ponto
        System.out.println();
    }
}

