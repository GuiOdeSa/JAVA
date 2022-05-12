package Set;

/*
Crie uma conjunto contendo as cores do arco-íris e:
a) Exiba todas as cores o arco-íris uma abaixo da outra;
b) A quantidade de cores que o arco-íris tem;
c) Exiba as cores em ordem alfabética;
d) Exiba as cores na ordem inversa da que foi informada;
e) Exiba todas as cores que começam com a letra ”v”;
f) Remova todas as cores que não começam com a letra “v”;
g) Limpe o conjunto;
h) Confira se o conjunto está vazio;
 */

import java.util.*;

public class Exercicio1 {
    public static void main(String[] args) {
        System.out.println("Crie uma conjunto contendo as cores do arco-íris: ");
        Set<String> coresArcoIris = new HashSet<>();
        coresArcoIris.add("Vermelho");
        coresArcoIris.add("Laranja");
        coresArcoIris.add("Amarelo");
        coresArcoIris.add("Verde");
        coresArcoIris.add("Azul");
        coresArcoIris.add("Anil");
        coresArcoIris.add("Violeta");
        System.out.println(coresArcoIris);

        System.out.println("a) Exiba todas as cores o arco-íris uma abaixo da outra;");
        for (String cor : coresArcoIris){
            System.out.println(cor);
        }

        System.out.println("b) A quantidade de cores que o arco-íris tem: " + coresArcoIris.size());

        System.out.println("c) Exiba as cores em ordem alfabética: ");
        Set<String> coresArcoIris2 = new TreeSet<>(coresArcoIris); // TreeSet apresenta na ordem natural
        System.out.println(coresArcoIris2);

        System.out.println("d) Exiba as cores na ordem inversa da que foi informada: ");
        Set<String> coresArcoIris3 = new LinkedHashSet<>(); // LinkedHasSet para registrar a ordem dos elementos
        coresArcoIris3.add("Vermelho");
        coresArcoIris3.add("Laranja");
        coresArcoIris3.add("Amarelo");
        coresArcoIris3.add("Verde");
        coresArcoIris3.add("Azul");
        coresArcoIris3.add("Anil");
        coresArcoIris3.add("Violeta");
        System.out.println(coresArcoIris3 + "-> ordem de inserção");
        List<String> coresArcoIrisLista = new ArrayList<>(coresArcoIris3); //Convertendo Set para List para poder usar Collections
        Collections.reverse(coresArcoIrisLista); //Utilizado reverse para inverter lista
        System.out.println(coresArcoIrisLista);

        System.out.println("e) Exiba todas as cores que começam com a letra ”v”: ");
        for (String cor : coresArcoIris){
            if (cor.startsWith("V")) System.out.println(cor);
        }

        System.out.println("f) Remova todas as cores que não começam com a letra “v”: ");
        System.out.println(coresArcoIris);
        Iterator<String > iterator = coresArcoIris.iterator();
        while (iterator.hasNext()){
            if (iterator.next().startsWith("V")) iterator.remove();
        }
        System.out.println(coresArcoIris);

        System.out.println("g) Limpe o conjunto:");
        coresArcoIris.clear();

        System.out.println("h) Confira se o conjunto está vazio: " + coresArcoIris.isEmpty());
    }
}
