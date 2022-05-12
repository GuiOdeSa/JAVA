package Lists;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Exercicio2 {
    /*
Utilizando listas, faça um programa que faça 5 perguntas para uma pessoa sobre um crime. As perguntas são:
1. "Telefonou para a vítima?"
2. "Esteve no local do crime?"
3. "Mora perto da vítima?"
4. "Devia para a vítima?"
5. "Já trabalhou com a vítima?"
Se a pessoa responder positivamente a 2 questões ela deve ser classificada como "Suspeita", entre 3 e 4 como
"Cúmplice" e 5 como "Assassina". Caso contrário, ele será classificado como "Inocente".
*/
    public static int respostaCorreta(String opcao){
        if(opcao.equals("S") || opcao.equals("N")){
            return 0;
        } else{
            System.out.println("Digite um valor válido! S ou N");
            return 1;
        }
    }

    public static void main(String[] args) {

        List<String> respostas = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        int x = 1;
        String resposta = "";


        System.out.println("Perguntas: ");
        while(x == 1){
            System.out.print("\nTelefonou para vítima? (S/N)");
            resposta = scan.next();
            x = respostaCorreta(resposta);
        }
        respostas.add(resposta.toUpperCase());
        x = 1;
        while(x == 1){
            System.out.print("Esteve no local do crime? (S/N)");
            resposta = scan.next();
            x = respostaCorreta(resposta);
        }
        respostas.add(resposta.toUpperCase());
        x = 1;
        while(x == 1){
            System.out.print("Mora perto da vítima? (S/N)");
            resposta = scan.next();
            x = respostaCorreta(resposta);
        }
        respostas.add(resposta.toUpperCase());
        x = 1;
        while(x == 1){
            System.out.print("Devia para vítima? (S/N)");
            resposta = scan.next();
            x = respostaCorreta(resposta);
        }
        respostas.add(resposta.toUpperCase());
        x = 1;
        while(x == 1){
            System.out.print("Já trabalhou com a vítima? (S/N)");
            resposta = scan.next();
            x = respostaCorreta(resposta);
        }
        respostas.add(resposta.toUpperCase());

        System.out.println(respostas);

        int count = 0;
        Iterator<String> contador = respostas.iterator();
        while(contador.hasNext()){
            String resp = contador.next();
            if(resp.contains("S")) {
                count ++;
            }
        }

        switch(count) {
            case 2:
                System.out.println(">> SUSPEITA <<"); break;
            case 3:
            case 4:
                System.out.println(">> CÚMPLICE <<"); break;
            case 5:
                System.out.println(">> ASSASSINO <<"); break;
            default:
                System.out.println(">> INOCENTE <<"); break;
        }

    }
}