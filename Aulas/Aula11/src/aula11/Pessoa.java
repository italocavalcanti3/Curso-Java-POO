package aula11;

public abstract class Pessoa {

    protected String nome, sexo;
    protected int idade;

    //MÉTODOS PÚBLICOS
    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", sexo=" + sexo + ", idade=" + idade + '}';
    }

    public void fazerAniversario() {
        this.idade++;
    }

    //MÉTODOS ESPECIAIS
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

}
