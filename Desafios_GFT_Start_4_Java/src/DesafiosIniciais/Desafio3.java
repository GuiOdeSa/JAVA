package DesafiosIniciais;

import java.util.Scanner;

public class Desafio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x1,y1,x2,y2;
        //se estiver na mesma linha ou mesma coluna ou mesma diagonal, gasta 1 movimento
        //se estiver em qualquer outra posição, a rainha gastará 2 movimentos!

        while(true){
            x1 = sc.nextInt();
            y1 = sc.nextInt();
            x2 = sc.nextInt();
            y2 = sc.nextInt();
            if(x1 == 0 && y1 == 0 && x2 == 0 && y2 == 0){   //IF para verificar condição de parada
                break; //condição de parada, termina código
            }	else if(x1 == x2 && y1 == y2){ //IF para verificar se prómixa jogada é a mesma da inicial
                System.out.println("0");
                continue;
            } else if(x1 == x2 || y1 == y2){    //IF para verificar se prómixa jogada está na mesma linha ou coluna
                                                //Se for mesma linha x1 = x2, se for mesma coluna y1 = y2
                                                //Utilizado operador OU pois apenas uma precisa ser verdadeira
                System.out.println("1");
                continue;
            } else if(Math.abs(x1-x2) == Math.abs(y1-y2)){  //IF para verificar se próxima jogaga está em alguma diagonal
                                                            //Se for alguma diagonal, os módulos das diferenças devem ser iguais
                                                            //ex1: 0,0 para 7,7 resulta em 7 = 7
                                                            //ex2: 6,2 para 3,5-> 6-3 = 2-5 em módulo, por isso Math.abs()
                System.out.println("1");
                continue;
            } else {
                System.out.println("2");    //ELSE para encerrar, pois se nenhuma situação anterior for atendida,
                                            //a Dama precisa de duas jogagas para chegar ao ponto desejado.
                continue;
            }
            //sc.close();

        }

    }
}
