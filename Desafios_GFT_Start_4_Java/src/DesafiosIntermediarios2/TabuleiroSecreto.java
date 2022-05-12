package DesafiosIntermediarios2;

/*Desafio
O senhor Milli, morador da cidade Petland, é o famoso proprietário da maior fábrica de jogos de tabuleiros do mundo.
Recentemente, ele teve a ideia de lançar um novo jogo exclusivo de tabuleiro, que ele apelidou de Tabuleiro da Frequência.
O jogo ocorre da seguinte forma. Inicialmente, um tabuleiro com dimensões N × N é dado contendo apenas 0’s.
Depois disso, Q operações são propostas, podendo ser de 4 tipos:
1 X R: Atribuir o valor R a todos os números da linha X;
2 X R: Atribuir o valor R a todos os números da coluna X;
3 X: Imprimir o valor mais frequente na linha X;
4 X: Imprimir o valor mais frequente da coluna X.
Milli não é muito bom com computadores, mas é bastante preguiçoso.
Sabendo que você é um dos melhores programadores do mundo, ele precisa sua ajuda para resolver este problema.

Entrada
A primeira linha da entrada é composta por dois inteiros N e Q (1 ≤ N, Q ≤ 105), representando, respectivamente,
o tamanho do tabuleiro e a quantidade de operações. As próximas Q linhas da entrada vão conter as Q operações.
O primeiro inteiro de cada linha vai indicar o tipo da operação. Caso seja 1 ou 2, será seguido por mais dois
inteiros X (1 ≤ X ≤ N) e R (0 ≤ R ≤ 50). Caso seja 3 ou 4, será seguido por apenas mais um inteiro X.

Saída
Para cada operação do tipo 3 ou 4, seu programa deve produzir uma linha, contendo o valor da resposta
correspondente. Se uma linha ou coluna tiver dois ou mais valores que se repetem o mesmo número de vezes,
você deve imprimir o maior deles. Por exemplo, se uma linha tem os valores [5,7,7,2,5,2,1,3], tanto o 2, 5 e 7
se repetem duas vezes, então a resposta será 7, pois é o maior deles.
 */

import java.io.IOException;
import java.util.*;

public class TabuleiroSecreto {
    public static void main(String[] args) throws IOException {
        //escreva aqui o seu código
        Scanner sc = new Scanner(System.in);
        int tamanhoTabuleiro = sc.nextInt();
        int operacoes = sc.nextInt();

        double[][] M = new double[tamanhoTabuleiro][tamanhoTabuleiro];

        for (int i = 0; i < operacoes; i++){
            int operacao = sc.nextInt();
            if (operacao == 1){
                int linha = sc.nextInt() - 1;
                int R = sc.nextInt();
                for (int j = 0; j < tamanhoTabuleiro; j++) M[linha][j] = R;
            } else if (operacao == 2) {
                int coluna = sc.nextInt() - 1;
                int R = sc.nextInt();
                for (int j = 0; j < tamanhoTabuleiro; j++) M[j][coluna] = R;
            } else if (operacao == 3){
                int linha = sc.nextInt() - 1;
                Map<Integer, Integer> linhaM = new HashMap<Integer, Integer>();
                for (int j = 0; j < tamanhoTabuleiro; j++){
                    int chave = (int) M[linha][j];
                    if (linhaM.containsKey(chave)){
                        int valor = linhaM.get(chave) + 1;
                        linhaM.put(chave, valor);
                    } else linhaM.put(chave, 1);
                }
                Integer apareceMaisVezes = Collections.max(linhaM.values());
                Set<Map.Entry<Integer, Integer>> entries = linhaM.entrySet();
                Integer chaveApareceMaisVezes = 0;
                for(Map.Entry<Integer, Integer> entry : entries){
                    if(entry.getValue().equals(apareceMaisVezes)){
                        if(entry.getKey() > chaveApareceMaisVezes) chaveApareceMaisVezes = entry.getKey();
                    }
                }
                System.out.println(chaveApareceMaisVezes);
            } else {
                int coluna = sc.nextInt() - 1;
                Map<Integer, Integer> colunaM = new HashMap<Integer, Integer>();
                for (int j = 0; j < tamanhoTabuleiro; j++){
                    int chave = (int) M[j][coluna];
                    if (colunaM.containsKey(chave)){
                        int valor = colunaM.get(chave) + 1;
                        colunaM.put(chave, valor);
                    } else colunaM.put(chave, 1);
                }
                Integer apareceMaisVezes = Collections.max(colunaM.values());
                Set<Map.Entry<Integer, Integer>> entries = colunaM.entrySet();
                Integer chaveApareceMaisVezes = 0;
                for(Map.Entry<Integer, Integer> entry : entries){
                    if(entry.getValue().equals(apareceMaisVezes)){
                        if(entry.getKey() > chaveApareceMaisVezes) chaveApareceMaisVezes = entry.getKey();
                    }
                }
                System.out.println(chaveApareceMaisVezes);
            }
        }
    }
}
