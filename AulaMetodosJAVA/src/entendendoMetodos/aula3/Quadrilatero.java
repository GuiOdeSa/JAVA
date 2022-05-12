package entendendoMetodos.aula3;

public class Quadrilatero {
    public static double area(double lado){
        return lado * lado;
    }

    public static double area(double lado1, double lado2){
        return lado1 * lado2;
    }

    public static double area(double base1, double base2, double altura){
        return ((base1 + base2) * altura) / 2;
    }

}
