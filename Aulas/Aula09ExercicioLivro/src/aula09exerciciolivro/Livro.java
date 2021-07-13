package aula09exerciciolivro;

import java.util.Random;

public class Livro implements Publicacao {
    
    private String titulo, autor;
    private int totPaginas, pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    //MÉTODO CONSTRUTOR
    public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
        this.setTitulo(titulo);
        this.setAutor(autor);
        this.setTotPaginas(totPaginas);
        this.setLeitor(leitor);
        
    }

    //MÉTODOS ABSTRATOS
    @Override
    public void abrir() {
        if (!this.getAberto()) {
            this.setAberto(true);
            this.setPagAtual(1);
            System.out.println("O livro " + this.getTitulo() + " foi aberto.");
            System.out.println("Você está na primeira página.");
        } else {
            System.out.println("Livro já aberto.");
        }
    }

    @Override
    public void fechar() {
        if (this.getAberto()) {
            this.setAberto(false);
        } else {
            System.out.println("O livro já está fechado.");
        }
        
    }

    @Override
    public void folhear() {
        if (this.getAberto()) {
            Random r1 = new Random();
            this.setPagAtual(r1.nextInt((this.getTotPaginas() + 1)));
            System.out.println("~ Folheando livro...");
            System.out.println("Você está na página " + this.getPagAtual());
            System.out.println("...");
        }
    }

    @Override
    public void avançarPag() {
        if (this.getPagAtual() < this.getTotPaginas()) {
            this.setPagAtual(this.getPagAtual() + 1);
            System.out.println("~ Passando a página... pg " + this.getPagAtual());
        } else {
            System.out.println("Livro finalizado e fechado.");
            this.setAberto(false);
        }
    }

    @Override
    public void voltarPag() {
        if (this.getPagAtual() > 1) {
            this.setPagAtual(this.getPagAtual() - 1);
            System.out.println("~ Passando a página... pg " + this.getPagAtual());            
        } else {
            System.out.println("Livro fechado.");
            this.setAberto(false);
        }
    }

    //MÉTODOS PÚBLICOS
    public void detalhes() {
        if (this.getAberto()) {
            System.out.println("--- " + this.getTitulo() + " ---");
            System.out.println("Autor: " + this.getAutor());
            System.out.println(this.getTotPaginas() + " páginas");
            System.out.println("Reserva: " + this.getLeitor().getNome());
            System.out.println("Página atual: " + this.getPagAtual());
        } else {
            System.out.println("--- " + this.getTitulo() + " ---");
            System.out.println("Autor: " + this.getAutor());
            System.out.println("Para ver mais informações, abra o livro...");
        }
        
    }

    //MÉTODOS ACESSORES
    public String getTitulo() {
        return titulo;
    }
    
    public String getAutor() {
        return autor;
    }
    
    public int getTotPaginas() {
        return totPaginas;
    }
    
    public int getPagAtual() {
        return pagAtual;
    }
    
    public boolean getAberto() {
        return aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    //MÉTODOS MODIFICADORES
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    public void setAutor(String autor) {
        this.autor = autor;
    }
    
    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }
    
    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }
    
    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }
    
}
