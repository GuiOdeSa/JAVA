package DesafiosIntermediarios;

import java.io.IOException;
import java.util.Scanner;

public class DesafioExibindoNumerosPares {

    /*Desafios
        Crie um programa que leia um número e mostre os números pares até esse número, inclusive ele mesmo.
    Entrada
        Você receberá 1 valor inteiro N, onde N > 0.
    Saída
        Exiba todos os números pares até o valor de entrada, sendo um em cada linha.*/

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = A + 1;

        for (int i = 2; i < B; i+=2) {
            System.out.println(i);
        }
    }
}
