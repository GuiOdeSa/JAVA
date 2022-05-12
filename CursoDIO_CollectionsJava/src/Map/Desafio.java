package Map;

import java.util.*;

public class Desafio {
    public static void main(String[] args) {
        Random lancamento = new Random();
        List<Integer> lancamentos = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            lancamentos.add(lancamento.nextInt(1,7));
        }
        System.out.println("\nRegistro dos Lançamentos\n" + lancamentos);

        Map<Integer , Integer> quantidadeLancamentos = new LinkedHashMap<>(){{
            put(1,0);
            put(2,0);
            put(3,0);
            put(4,0);
            put(5,0);
            put(6,0);
        }};

        Iterator<Integer> iterator = lancamentos.iterator();
        Integer contador = 0;
        while (iterator.hasNext()){
            Integer posicao = iterator.next();
            contador = quantidadeLancamentos.get(posicao);
            contador++;
            quantidadeLancamentos.put(posicao , contador);
        }

        System.out.println("\nQuantidade de vezes que cada número saiu: ");
        for (int i = 1; i < 7; i++){
            System.out.println("O número " + i + " saiu " + quantidadeLancamentos.get(i) + "vezes");
        }
    }
}