package aula09exerciciolivro;

public class Pessoa {
    
    private String nome, sexo;
    private int idade;
    
    //MÉTODO CONSTRUTOR
    public Pessoa (String nome, String sexo, int idade) {
        this.setNome(nome);
        this.setSexo(sexo);
        this.setIdade(idade);
    }
    
    //MÉTODOS PÚBLICOS
    public void fazerAniver() {
        this.idade++;
        String[] pNome = this.getNome().split(" ");
        System.out.println("Parabéns " + pNome[0] + " pelo seu " + this.getIdade() + "º aniversário!!!");
    }
        
    //MÉTODOS ACESSORES
    public String getNome() {
        return this.nome;
    }
    public String getSexo() {
        return this.sexo;
    }
    public int getIdade() {
        return this.idade;
    }
    
    //MÉTODOS MODIFICADORES
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setSexo(String sexo) {
        
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    
}
