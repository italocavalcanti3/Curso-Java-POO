package aula13;

public abstract class Lobo extends Mamifero {
    
    public abstract void reagir(String reagir);
    public abstract void reagir(int h, int m);
    public abstract void reagir(boolean dono);
    public abstract void reagir(int idade, float peso);
    
    @Override
    public void emitirSom() {
        System.out.println("uuuuuuuuuuuuuh!");
    }
    
}
