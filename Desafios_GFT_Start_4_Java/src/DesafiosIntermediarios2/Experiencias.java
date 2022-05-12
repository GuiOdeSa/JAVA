package DesafiosIntermediarios2;

/*Maria acabou de iniciar seu curso de graduação na faculdade de medicina e precisa de sua ajuda para organizar
os experimentos de um laboratório o qual ela é responsável. Ela quer saber no final do ano, quantas cobaias
foram utilizadas no laboratório e o percentual de cada tipo de cobaia utilizada.
Este laboratório em especial utiliza três tipos de cobaias: sapos, ratos e coelhos.
Para obter estas informações, ela sabe exatamente o número de experimentos que foram realizados,
o tipo de cobaia utilizada e a quantidade de cobaias utilizadas em cada experimento.
Entrada
A primeira linha de entrada contém um valor inteiro N que indica os vários casos de teste que vem a seguir.
Cada caso de teste contém um inteiro Quantia (1 ≤ Quantia ≤ 15) que representa a quantidade de cobaias
utilizadas e um caractere Tipo ('C', 'R' ou 'S'), indicando o tipo de cobaia (R:Rato S:Sapo C:Coelho).
Saída
Apresente o total de cobaias utilizadas, o total de cada tipo de cobaia utilizada e o percentual de cada
uma em relação ao total de cobaias utilizadas, sendo que o percentual deve ser apresentado com dois dígitos
após o ponto.
 */

import java.util.Scanner;

public class Experiencias {

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int quantidade;
        char tipoCobaia;
        int quantidadeCoelhos = 0, quantidadeRatos = 0, quantidadeSapos = 0 ,quantidadeTotal = 0;
        double percentualCoelhos, percentualRatos, percentualSapos;
        int quantidadeTestes=input.nextInt();

//Escreva o seu código aqui

        for(int i = 0; i < quantidadeTestes; i++){
            quantidade = input.nextInt();
            tipoCobaia = input.next().toUpperCase().charAt(0);
            quantidadeTotal += quantidade;
            if (tipoCobaia == 'C') quantidadeCoelhos += quantidade;
            else if (tipoCobaia == 'R') quantidadeRatos += quantidade;
            else if (tipoCobaia == 'S') quantidadeSapos += quantidade;
        }

        System.out.println("Total: " + quantidadeTotal + " cobaias");
        System.out.println("Total de coelhos: " + quantidadeCoelhos);
        System.out.println("Total de ratos: " + quantidadeRatos);
        System.out.println("Total de sapos: " + quantidadeSapos);

        percentualCoelhos = quantidadeCoelhos*100d/quantidadeTotal;
        percentualRatos = quantidadeRatos*100d/quantidadeTotal;
        percentualSapos = quantidadeSapos*100d/quantidadeTotal;

        System.out.printf("Percentual de coelhos: %.2f %%", percentualCoelhos);
        System.out.printf("\nPercentual de ratos: %.2f %%", percentualRatos);
        System.out.printf("\nPercentual de sapos: %.2f %%", percentualSapos);
    }
}

