package entendendoMetodos.aula1;

public class Emprestimo {

    public static double gettaxa(int parcelas){
        if (parcelas == 2){
            return 0.3;
        } else {
            return 0.45;
        }

    }

    public static void calcular(double valor, int parcelas){

        if (parcelas == 2 || parcelas == 3) {
            double valorFinal = valor * (1 + gettaxa(parcelas));
            System.out.println("O Valor final para " + parcelas + " parcelas é de R$ " + valorFinal + ".");
        } else{
            System.out.println("Quantidade de parcelas não aceita!");
        }

    }
}
