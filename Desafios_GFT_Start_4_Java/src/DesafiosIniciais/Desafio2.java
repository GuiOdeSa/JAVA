package DesafiosIniciais;

import java.io.IOException;
import java.util.Scanner;

public class Desafio2 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt(); //Escolhido para entrar com inteiro para usar no FOR
        int B = A + 1;  //Adicionada uma unidade ao valor, para que no FOR ele não termine o laço
                        // antes de aperecer o valor de A, caso A seja par

        for (int i = 2; i < B; i+=2) {  //laço FOR iniciando com o primeiro par, desde que seja maior que 2 e
                                        //adicionando 2 unidades para apresentar apenas valores pares
            System.out.println(i);
        }
    }
}
