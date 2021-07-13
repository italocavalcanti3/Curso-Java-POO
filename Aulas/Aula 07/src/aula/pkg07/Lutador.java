package aula.pkg07;

public class Lutador {
 
    private String nome, nacionalidade, categoria;
    private int idade, vitorias, derrotas, empates;
    private float altura, peso;
    
    //MÉTODO CONSTRUTOR
    public Lutador(String nome, String nacionalidade, int idade, float altura,
            float peso, int vitorias, int derrotas, int empates) {
        
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.setPeso(peso);
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
        
    }
    
    // MÉTODOS PÚBLICOS
    public void apresentar() {
        //System.out.println("--- Ultra Emoji Combat ---");
        System.out.println("Nome: " + this.getNome());
        System.out.println("Origem: " + this.getNacionalidade());
        System.out.println("Idade: " + this.getIdade() + " anos");
        System.out.printf("Altura: %.2fm\n", this.getAltura());
        System.out.printf("Peso: %.2fkg\n", this.getPeso());
        System.out.println("Categoria: Peso " + this.getCategoria());
        System.out.println("Vitórias: " + this.getVitorias());
        System.out.println("Derrotas: " + this.getDerrotas());
        System.out.println("Empates: " + this.getEmpates());
        //System.out.println("--------------------------");
    }
    public void status() {
        System.out.println("--------------------------");
        System.out.println(this.getNome());
        System.out.println("É um Peso " + this.getCategoria());
        System.out.println(this.getVitorias() + " vitórias");
        System.out.println(this.getDerrotas()+ " derrotas");
        System.out.println(this.getEmpates()+ " empates");
        System.out.println("--------------------------");
        
    }
    public void ganharLuta() {
        this.setVitorias(this.getVitorias() + 1);
    }
    public void perderLuta() {
        this.setDerrotas(this.getDerrotas() + 1);
    }
    public void empatarLuta() {
        this.setEmpates(this.getEmpates() + 1);
    }
    
    //MÉTODOS ACESSORES
    public String getNome() { //Sempre colocar o TIPO
        return nome;
    }
    public String getNacionalidade() {
        return nacionalidade;
    }
    public int getIdade() {
        return idade;
    }
    public float getAltura() {
        return altura;
    }
    public float getPeso() {
        return peso;
    }
    public String getCategoria() {
        return categoria;
    }
    public int getVitorias() {
        return vitorias;
    }
    public int getDerrotas() {
        return derrotas;
    }
    public int getEmpates() {
        return empates;
    }
    
    //MÉTODOS MODIFICADORES
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public void setAltura(float altura) {
        this.altura = altura;
    }
    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }
    private void setCategoria() {
        if (this.getPeso() < 52.2) {
            this.categoria = "Inválido";
        } else if (this.getPeso() <= 70.3) {
            this.categoria = "Leve";
        } else if (this.getPeso() <= 83.9) {
            this.categoria = "Médio";
        } else if (this.getPeso() <= 120.2) {
            this.categoria = "Pesado";
        } else {
            this.categoria = "Inválido";
        }
    }
    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }
    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }
    public void setEmpates(int empates) {
        this.empates = empates;
    }
    
    
}
