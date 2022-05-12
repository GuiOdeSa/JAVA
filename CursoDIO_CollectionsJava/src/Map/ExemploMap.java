package Map;

/*
 Dada os modelos dos carros e seus respectivos consumos na estrada, faça:
 modelo = gol - consumo = 14,4km/l
 modelo = uno - consumo = 15,6 km/l
 modelo = mobi - consumo = 16,1 km/l
 modelo = hb20 - consumo = 14,5 km/l
 modelo = kwid - consumo = 15,6 km/l
 */

import java.util.*;

public class ExemploMap {
    public static void main(String[] args) {
        System.out.println("Crie um dicionário que relacione os modelos e seus respectivos consumo: ");
        Map<String,Double> carrosPopulares = new HashMap<>(){{
            put("gol", 14.4);
            put("uno" , 15.6);
            put("mobi" , 16.1);
            put("hb20" , 14.5);
            put("kwid" , 15.6);
        }};
        System.out.println(carrosPopulares.toString());

        System.out.println("\nSubstitua o consumo do gol por 15,2 km/l: ");
        carrosPopulares.put("gol", 15.2);
        System.out.println(carrosPopulares);

        System.out.println("\nConfira se o modelo Tucson está no dicionário: " + carrosPopulares.containsKey("tucosn"));

        System.out.println("\nExiba o consumo do uno: " + carrosPopulares.get("uno"));

        //System.out.println("\nExiba o terceiro modelo adicionado: "); Não é possível conseguir index em Maps

        System.out.println("\nExiba os modelos: ");
        Set<String> modelos = carrosPopulares.keySet();
        System.out.println(modelos);

        System.out.println("\nExiba os consumos dos carros: ");
        Collection<Double> consumos = carrosPopulares.values();
        System.out.println(consumos);

        System.out.println("\nExiba o modelo mais econômico e seu consumo: ");
        Double melhorConsumo = Collections.max(carrosPopulares.values());
        Set<Map.Entry<String, Double>> entries = carrosPopulares.entrySet();
        String modeloMelhorConsumo = "";
        for(Map.Entry<String, Double> entry : entries){
            if(entry.getValue().equals(melhorConsumo)) {
                modeloMelhorConsumo = entry.getKey();
                System.out.println("Modelo mais eficiente: " + modeloMelhorConsumo + " - " + melhorConsumo + "km/l.");
            }
        }

        System.out.println("\nExiba o modelo menos econômico e seu consumo: ");
        Double piorConsumo = Collections.min(carrosPopulares.values());
        String modeloPiorConsumo = "";
        for(Map.Entry<String, Double> entry : entries){
            if(entry.getValue().equals(piorConsumo)) {
                modeloPiorConsumo = entry.getKey();
                System.out.println("Modelo menos eficiente: " + modeloPiorConsumo + " - " + piorConsumo + "km/l.");
            }
        }

        Double soma = 0d;
        Iterator<Double> iterator = carrosPopulares.values().iterator();
        while(iterator.hasNext()){
            soma += iterator.next();
        }
        System.out.println("\nExiba a soma dos consumos: " + soma);

        System.out.println("\nExiba a média dos consumos deste dicionário de carros: " + soma/ carrosPopulares.size());

        System.out.println("\nRemova os modelos com o consumo igual a 15,6 km/l:");
        System.out.println(carrosPopulares);
        Iterator<Double> iterator1 = carrosPopulares.values().iterator();
        while (iterator1.hasNext()){
            if(iterator1.next().equals(15.6)) iterator1.remove();
        }
        System.out.println(carrosPopulares);

        System.out.println("\nExiba todos os carros na ordem em que foram informados: ");
        Map<String,Double> carrosPopulares1 = new LinkedHashMap<>(){{
            put("gol", 14.4);
            put("uno" , 15.6);
            put("mobi" , 16.1);
            put("hb20" , 14.5);
            put("kwid" , 15.6);
        }};
        System.out.println(carrosPopulares1.toString());

        System.out.println("\nExiba o dicionário ordenado pelo modelo: ");
        Map<String, Double> carrosPopulares2 = new TreeMap<>(carrosPopulares1);
        System.out.println(carrosPopulares2.toString());

        System.out.println("\nApague o dicionário de carros: ");
        carrosPopulares.clear();

        System.out.println("\nConfira se o dicionário está vazio: " + carrosPopulares.isEmpty());


    }
}
