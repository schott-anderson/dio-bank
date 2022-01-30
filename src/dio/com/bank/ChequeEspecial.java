package dio.com.bank;

public class ChequeEspecial {

    public ChequeEspecial (ContaCorrente contaCorrente, Cliente cliente){    }

    public void ativaChequeEspecial(ContaCorrente contaCorrente, Cliente cliente){
        contaCorrente.setChequeEspecial(
                Double.parseDouble(cliente.getScore())*1.25
        );
    }
}
