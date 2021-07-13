package aula11;

public class Aluno extends Pessoa {

    private int matricula;
    private String curso;

    //MÉTODOS PÚBLICOS
    public void pagarMensalidade() {
        System.out.println("Pagando mensalidade de " + this.nome);
    }

    //MÉTODOS ESPECIAIS
    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

}
