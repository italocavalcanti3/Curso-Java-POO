package aula14exerciciovideo;

public class Gafanhoto extends Pessoa {
    
    private String login;
    private int totAssistido;
    
    public void viuMaisUm() {
        this.totAssistido++;
    }
    
    //MÉTODO CONSTRUTOR
    public Gafanhoto(String nome, int idade, String sexo, String login) {
        super (nome, idade, sexo); //Colocar super para enviar para a superclasse
        this.login = login;
        this.totAssistido = 0;        
    }
    
    //MÉTODOS ESPECIAIS

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotAssistido() {
        return totAssistido;
    }

    public void setTotAssistido(int totAssistido) {
        this.totAssistido = totAssistido;
    }

    @Override
    public String toString() {
        return "Gafanhoto{" + super.toString() + "login=" + login + ", totAssistido=" + totAssistido + '}';
    }
    
    
        
}
