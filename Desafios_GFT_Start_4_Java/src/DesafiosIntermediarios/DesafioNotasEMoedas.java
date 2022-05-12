package DesafiosIntermediarios;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class DesafioNotasEMoedas {

    /*Desafio
        Leia um valor de ponto flutuante com duas casas decimais. Este valor representa um valor monetário.
        A seguir, calcule o menor número de notas e moedas possíveis no qual o valor pode ser decomposto.
        As notas consideradas são de 100, 50, 20, 10, 5, 2.
        As moedas possíveis são de 1, 0.50, 0.25, 0.10, 0.05 e 0.01.
        A seguir mostre a relação de notas necessárias.
    Entrada
        O arquivo de entrada contém um valor de ponto flutuante N (0 ≤ N ≤ 1000000.00).
    Saída
        Imprima a quantidade mínima de notas e moedas necessárias para trocar o valor inicial,
        conforme exemplo fornecido.
        Obs: Utilize ponto (.) para separar a parte decimal.*/

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        double N;
        int quociente, resto;

        N = sc.nextDouble();

        resto = (int) (N * 100.0);

        List<Integer> notas = Arrays.asList(100,50,20,10,5,2);

        System.out.println("NOTAS:");
        for(int i = 0; i < notas.size(); i++){
            quociente = resto / (notas.get(i) * 100);
            System.out.println(quociente + " nota(s) de R$ " + notas.get(i) + ".00");
            resto = resto % (notas.get(i) * 100);
        }

        List<Integer> moedas = Arrays.asList(100,50,25,10,5,1);

        System.out.println("MOEDAS:");

        for(int i = 0; i < moedas.size(); i++){
            quociente = resto / moedas.get(i);
            switch (moedas.get(i)) {
                case 100:
                    System.out.println(quociente + " moeda(s) de R$ 1.00");
                    break;
                case 50:
                    System.out.println(quociente + " moeda(s) de R$ 0.50");
                    break;
                case 25:
                    System.out.println(quociente + " moeda(s) de R$ 0.25");
                    break;
                case 10:
                    System.out.println(quociente + " moeda(s) de R$ 0.10");
                    break;
                case 5:
                    System.out.println(quociente + " moeda(s) de R$ 0.05");
                    break;
                case 1:
                    System.out.println(quociente + " moeda(s) de R$ 0.01");
                    break;
                default:
                    break;
            }
            resto = resto % (moedas.get(i));
        }
        sc.close();
    }
}
