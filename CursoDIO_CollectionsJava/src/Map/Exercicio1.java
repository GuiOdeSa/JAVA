package Map;

import java.util.*;

public class Exercicio1 {
    public static void main(String[] args) {
        System.out.println("Crie um dicionário e relacione alguns estados no NE e suas populações: ");
        Map<String,Integer> estadosNE = new HashMap<>(){{
            put("PE" , 9616621);
            put("AL" , 3351543);
            put("CE" , 9187103);
            put("RN" , 3534265);
        }};
        System.out.println(estadosNE.toString());

        System.out.println("\nSubstitua a população do estado do RN por 3.534.165: ");
        estadosNE.put("RN" , 3534165);
        System.out.println(estadosNE.toString());

        System.out.println("\nConfira se o estado PB está no dicionário: " + estadosNE.containsKey("PB"));

        System.out.println("\nCaso não adicione : PB - 4.039.277: ");
        estadosNE.put("PB" , 4039277);
        System.out.println(estadosNE.toString());

        System.out.println("\nExiba a população de PE: " + estadosNE.get("PE"));

        System.out.println("\nExiba todos os estados e suas populações na ordem que foi informado: ");
        Map<String,Integer> estadosNE1 = new LinkedHashMap<>(){{
            put("PE" , 9616621);
            put("AL" , 3351543);
            put("CE" , 9187103);
            put("RN" , 3534265);
        }};
        System.out.println(estadosNE1.toString());

        System.out.println("\nExiba os estados e suas populações em ordem alfabética: ");
        Map<String,Integer> estadosNE2 = new TreeMap<>(estadosNE);
        System.out.println(estadosNE2);

        System.out.println("\nExiba o estado com a menor população e sua quantidade: ");
        Integer menorPopulacao = Collections.min(estadosNE.values());
        String estadoMenorPopulacao = "";
        Set<Map.Entry<String , Integer>> entries = estadosNE.entrySet();
        for(Map.Entry<String , Integer> entry : entries)
            if(entry.getValue().equals(menorPopulacao)){
                estadoMenorPopulacao = entry.getKey();
                System.out.println("Estado com menor população: " + estadoMenorPopulacao + " - " + menorPopulacao + " habitantes.");
            }

        System.out.println("\nExiba o estado com a maior população e sua quantidade: ");
        Integer maiorPopulacao = Collections.max(estadosNE.values());
        String estadoMaiorPopulacao = "";
        for(Map.Entry<String , Integer> entry : entries)
            if(entry.getValue().equals(maiorPopulacao)){
                estadoMaiorPopulacao = entry.getKey();
                System.out.println("Estado com maior população: " + estadoMaiorPopulacao + " - " + maiorPopulacao + " habitantes.");
            }

        Integer soma = 0;
        Iterator<Integer> iterator = estadosNE.values().iterator();
        while (iterator.hasNext())
            soma += iterator.next();
        System.out.println("\nExiba a soma da população desses estados: " + soma + " habitantes.");

        System.out.println("\nExiba a média da população desses estados: " + soma/estadosNE.size());

        System.out.println("\nRemova os estados com menos de 4.000.000 de habitantes: ");
        System.out.println(estadosNE);
        Iterator<Integer> iterator1 = estadosNE.values().iterator();
        while (iterator1.hasNext())
            if(iterator1.next() < (4000000)) iterator1.remove();
        System.out.println(estadosNE);

        System.out.println("\nApague o dicionário: ");
        estadosNE.clear();

        System.out.println("\nConfira se o dicionário está vázio: " + estadosNE.isEmpty());
    }
}
