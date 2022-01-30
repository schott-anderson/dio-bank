package dio.com.bank;

public class ContaCorrente extends Conta{

    public ContaCorrente(Cliente cliente, Banco banco) {
        super(cliente, banco);
    }

    private double chequeEspecial; //= Double.parseDouble(cliente.getScore())*1.25;
    private double chequeEspecialUtilizado = 0.00;



    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Corrente ===");
        super.imprimirInfosComuns();
        System.out.println(String.format("Limite de Cheque Especial: %.2f", this.chequeEspecial));
        System.out.println(String.format("Utilização de Cheque Especial: %.2f", this.chequeEspecialUtilizado));
    }

    @Override
    public void sacar(double valor) {
        if(super.saldo + this.chequeEspecial > valor){
            saldo -= valor;
            System.out.println("Saque realizado com sucesso!");
            if (saldo<0) {
                this.chequeEspecialUtilizado -= saldo;
            }
        }else{
            System.out.println("Saldo insuficiente.");
        };
    }


    public void setChequeEspecial(double chequeEspecial) {
        this.chequeEspecial = chequeEspecial;
    }

    public double getChequeEspecial(){
        return chequeEspecial;
    }

    public double getChequeEspecialUtilizado() {
        return chequeEspecialUtilizado;
    }


}
