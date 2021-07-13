package aula06;

public class Aula06 {

    public static void main(String[] args) {
        
        ControleRemoto c = new ControleRemoto();
        
        c.ligar();
        c.play();
        c.maisVolume();
        c.abrirMenu();
        System.out.println("");
        c.pause();
        c.abrirMenu();
        System.out.println("");
        c.ligarMudo();
        c.abrirMenu();
        System.out.println("");
        c.desligarMudo();
        c.abrirMenu();
    }
    
}
