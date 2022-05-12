package Lists;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/*Faça um programa que receba a temperatura média os 6 primeiros meses do ano e armazene-as em uma lista.
Após isto, calcule a média semestral das temperaturas e mostre todas as temperaturas acima desta média,
e em que mês elas ocorreram (mostrar o mês por extenso: 1 – Janeiro, 2 – Fevereiro e etc).
*/

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Double> temperaturas = new ArrayList<Double>();

        List<String> meses = new ArrayList<String>();
        meses.add("Janeiro");
        meses.add("Fevereiro");
        meses.add("Março");
        meses.add("Abril");
        meses.add("Maio");
        meses.add("Junho");

        int count = 0;
        while (true){
            if (count == 6) break;

            System.out.println("Digite a temperatura média do mês de " + meses.get(count));
            double temp = scan.nextDouble();
            temperaturas.add(temp);
            count++;
        }
        System.out.println("-----------------");

        //exibindo todas as temperaturas:
        System.out.print("\nTodas as médias de temperaturas:\n");
        for (int i = 0; i < 6 ; i++ ){
            System.out.print(meses.get(i) + ": " + temperaturas.get(i) + "\n");
        }

        System.out.println("-----------------");

        //calculando e exibindo a média das temperaturas:
        double media = temperaturas.stream()
                .mapToDouble(Double::doubleValue)
                .average()
                .orElse(0d);
        System.out.printf("\nMédia das temperaturas: %.1f\n", media);

        System.out.println("-----------------");

        //exibindo as temperaturas acima da média
        System.out.print("\nTemperaturas acima da média:\n");
        temperaturas.stream()
                .filter(t -> t > media)
                .forEach(t -> System.out.printf("%.1f \n", t));

        System.out.println("-----------------");

        //exibindo o mês das temperaturas acima da média por extenso:
        System.out.println("\nMeses das temperaturas acima da média:\n");
        Iterator<Double> iterator = temperaturas.iterator();

        count = 0;
        while (iterator.hasNext()) {
            Double temp = iterator.next();
            if (temp > media) {
                switch (count) {
                    case (0):
                        System.out.printf(meses.get(count) + ": %.1f\n", temp);
                        break;
                    case (1):
                        System.out.printf(meses.get(count) + ": %.1f\n", temp);
                        break;
                    case (2):
                        System.out.printf(meses.get(count) + ": %.1f\n", temp);
                        break;
                    case (3):
                        System.out.printf(meses.get(count) + ": %.1f\n", temp);
                        break;
                    case (4):
                        System.out.printf(meses.get(count) + ": %.1f\n", temp);
                        break;
                    case (5):
                        System.out.printf(meses.get(count) + ": %.1f\n", temp);
                        break;
                    default:
                        System.out.println("Não houve temperatura acima da média.");
                }
            }
            count++;
        }
    }
}
