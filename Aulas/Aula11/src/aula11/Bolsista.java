package aula11;

public class Bolsista extends Aluno {

    private float bolsa;

    //MÉTODOS PÚBLICOS
    public void renovarBolsa() {
        
    }
    @Override
    public void pagarMensalidade() {
        System.out.println(this.nome + " é bolsista! Pagamento facilitado.");
    }

    //MÉTODOS ESPECIAIS
    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(int bolsa) {
        this.bolsa = bolsa;
    }

}
