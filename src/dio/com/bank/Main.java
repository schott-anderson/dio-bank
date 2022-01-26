package dio.com.bank;

public class Main {

    public static void main(String[] args) {

        Cliente cl2 = new Cliente();
        cl2.setNome("anderson");

        ContaCorrente cc = new ContaCorrente(cl2);
        cc.imprimirExtrato();

    }
}
