package aula10;

public class Pessoa {
    
    private String nome, sexo;
    private int idade;
   
    //MÉTODOS PÚBLICOS
    public void fazerAniv() {
        this.idade++;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", sexo=" + sexo + ", idade=" + idade + '}';
    }
    
    

    //MÉTODOS ESPECIAIS
//    public Pessoa(String nome, String sexo, int idade) {
//        this.nome = nome;
//        this.sexo = sexo;
//        this.idade = idade;
//    }
    
    public String getNome() {
        return nome;
    }

    public String getSexo() {
        return sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    
}
