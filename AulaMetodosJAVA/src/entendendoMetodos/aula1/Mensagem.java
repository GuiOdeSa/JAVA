package entendendoMetodos.aula1;

public class Mensagem {

    public static void obterMensagem(int hora){

        if (hora >= 5 && hora < 13){
            mensagemBomDia();
        } else if (hora > 12 && hora < 18){
            mensagemBoaTarde();
        } else if ((hora > 17 && hora < 25) || hora < 5){
            mensagemBoaNoite();
        } else{
            System.out.println("Hora Incorreta!");
        }
    }
    public static void mensagemBomDia(){
        System.out.println("Bom dia!");
    }

    public static void mensagemBoaTarde(){
        System.out.println("Boa tarde!");
    }

    public static void mensagemBoaNoite(){
        System.out.println("Boa noite!");
    }
}
