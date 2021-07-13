package aula.pkg07;

import java.util.Random;

public class Luta {
    
    private Lutador desafiado;
    private Lutador desafiante; //TIPO ABSTRATO
    private int rounds;
    private boolean aprovada;
    
    //MÉTODO CONSTRUTOR
    public Luta() {
        
    }
    
    /*
    * REGRAS UEC:   1.Só pode ser marcada entre lutadores da mesma categoria;
    *               2.Desafiado e desafiante devem ser lutadores diferentes;
    *               3.Só pode acontecer se estiver aprovada;
    *               4.Só pode ter como resultado a vitória de um dos lutadores ou empate;
    */
    //MÉTODOS PÚBLICOS
    public void marcarLuta(Lutador desafiante, Lutador desafiado) {
        if (desafiado.getCategoria().equals(desafiante.getCategoria()) && desafiante != desafiado) {
            System.out.println("--- Ultra Emoji Combat ---");
            System.out.println("Luta marcada! P R E P A R E - S E !!!");
            System.out.println("--------------------------");
            this.setAprovada(true);
            this.desafiante = desafiante;
            this.desafiado = desafiado;
        } else {
            System.out.println("Esta luta não pode acontecer.");
            this.setAprovada(false);
            this.desafiante = null;
            this.desafiado = null;
        }
    }
    
    public void lutar() {
        if (this.getAprovada()) {
            System.out.println("--- Ultra Emoji Combat ---");
            System.out.println(this.getDesafiante().getNome() + " vs " + this.getDesafiado().getNome());
            System.out.println("Vamos conhecer os lutadores:");
            System.out.println("--------------------------");
            this.getDesafiante().apresentar();
            System.out.println("--------------------------");
            this.getDesafiado().apresentar();
            System.out.println("--------------------------");
            System.out.println("Os lutadores estão lutando...");
            System.out.print("O resultado desta luta é: ");
            
            Random random = new Random();
            int res = random.nextInt(3);
            
            switch (res) {
                case 0:
                    System.out.print("Empate!");
                    this.getDesafiante().empatarLuta();
                    this.getDesafiado().empatarLuta();
                    break;
                case 1:
                    System.out.print("Vitória de " + this.getDesafiante().getNome() + "!!");
                    this.getDesafiante().ganharLuta();
                    this.getDesafiado().perderLuta();
                    break;
                case 2:
                    System.out.print("Vítoria de " + this.getDesafiado().getNome() + "!!");
                    this.getDesafiado().perderLuta();
                    this.getDesafiante().ganharLuta();
                    break;
            }
            System.out.println("");
            System.out.println("--------------------------");
            
        } else {
            System.out.println("--------------------------");
            System.out.println("A luta entre " + this.getDesafiante().getNome() + " e " + this.getDesafiado().getNome() + " não pode acontecer.");
            System.out.println("--------------------------");
        }
    }
    
    //MÉTODOS ACESSORES
    private Lutador getDesafiado() {
        return desafiado;
    }
    private Lutador getDesafiante() {
        return desafiante;
    }
    private int getRounds() {
        return rounds;
    }
    private boolean getAprovada() {
        return aprovada;
    }
    
    //MÉTODOS MODIFICADORES
    private void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }
    private void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }
    private void setRouds(int rounds) {
        this.rounds = rounds;
    }
    private void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
    
}
