public class ContaPoupança extends Conta{
    @Override
    public void imprimirExtrato() {
        System.out.println("***   Extrato da Poupança   ***");
        imprimirInfosComuns();
    }


}
