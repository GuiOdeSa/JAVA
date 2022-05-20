package Desafio3;

/*Desafio
Leia os quatro valores correspondentes aos eixos x e y de dois pontos quaisquer no plano, p1(x1,y1) e p2(x2,y2) e calcule a distância entre eles, mostrando 4 casas decimais após a vírgula, conforme a fórmula:

Entrada
O arquivo de entrada contém duas linhas de dados. A primeira linha contém dois valores de ponto flutuante: x1 y1 e a segunda linha contém dois valores de ponto flutuante x2 y2.

Saída
Calcule e imprima o valor da distância segundo a fórmula fornecida, com 4 casas após o ponto decimal.
*/

import java.util.Scanner;

public class Desafio3 {
    public static void main(String[] args) {
        //a classe Scanner auxilia na leitura dos dados de entrada
        Scanner input = new Scanner(System.in);

        double[] P1 = new double[2];
        double[] P2 = new double[2];

        P1[0] = input.nextDouble();
        P1[1] = input.nextDouble();
        P2[0] = input.nextDouble();
        P2[1] = input.nextDouble();

        double distancia = Math.sqrt(Math.pow((P2[0] - P1[0]),2) + Math.pow((P2[1] - P1[1]),2));

        System.out.printf("%.4f",distancia);
    }
}
