package entendendoMetodos.aula2;

public class Quadrilatero {
    public static void area(double lado){
        System.out.println("Área do quadrado é de " + lado * lado);
    }

    public static void area(double lado1, double lado2){
        System.out.println("Área do retângulo é de " + lado1 * lado2);
    }

    public static void area(double base1, double base2, double altura){
        System.out.println("Área do trapézio é de " + ((base1 + base2) * altura) / 2);
    }

}
