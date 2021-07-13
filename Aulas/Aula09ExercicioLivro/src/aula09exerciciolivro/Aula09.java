package aula09exerciciolivro;

public class Aula09 {

    public static void main(String[] args) {
        
        Livro livro[] = new Livro[10];
        Pessoa pessoa[] = new Pessoa[10];
        
        pessoa[0] = new Pessoa("Italo Braga Cavalcanti", "Masculino", 27);
        pessoa[1] = new Pessoa("Mariana Costa", "Feminino", 26);
        
        livro[0] = new Livro ("Harry Potter e a Pedra Filosofal", "J. K. Rowling", 304, pessoa[0]);
        livro[1] = new Livro ("Harry Potter e a Câmara Secreta", "J. K. Rowling", 345, pessoa[1]);
        
//        pessoa[0].fazerAniver();
//        pessoa[1].fazerAniver();
        
        livro[0].setLeitor(pessoa[1]);
        livro[0].abrir();
//        livro[0].detalhes();
        livro[0].folhear();
        
    }
    
}
