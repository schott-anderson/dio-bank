package dio.com.bank;

public class Main {

    public static void main(String[] args) {

        Cliente cl2 = new Cliente();
        cl2.setNome("anderson");
        cl2.setScore("300");


        ContaCorrente cc = new ContaCorrente(cl2);
        cc.depositar(400);
        ChequeEspecial chequeEspecial = new ChequeEspecial(cc, cl2);
        chequeEspecial.ativaChequeEspecial(cc, cl2);
        ContaPoupanca cp = new ContaPoupanca(cl2);

        cc.sacar(200);
        cc.transferir(300, cp);
        cc.imprimirExtrato();

    }
}
