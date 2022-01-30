package dio.com.bank;

public class Cliente {

    private String nome;

    private String score ="0";

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "nome='" + nome + '\'';

    }
}