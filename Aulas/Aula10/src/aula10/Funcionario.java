package aula10;

public class Funcionario extends Pessoa {

    private String setor;
    private boolean trabalhando;

    //MÉTODOS PÚBLICOS
    public void mudarTrabalho() {
        this.trabalhando = ! this.trabalhando;
    }

    //MÉTODOS ESPECIAIS
//    public Funcionario(String setor, boolean trabalhando) {
//        this.setor = setor;
//        this.trabalhando = trabalhando;
//    }
    
    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean getTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }

}
