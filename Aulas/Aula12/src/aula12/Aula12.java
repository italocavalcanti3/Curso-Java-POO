package aula12;

public class Aula12 {

    public static void main(String[] args) {
        
        //PARTE 02
        Mamifero m = new Mamifero();
        Canguru c = new Canguru();
        Cachorro k = new Cachorro();
        
        System.out.println("Mamíferos...");
        m.setPeso(5.70f);
        m.setIdade(8);
        m.setMembros(4);
        m.locomover();
        m.alimentar();
        m.emitirSom();
        System.out.println("--------------");
        
        System.out.println("Canguru...");
        c.setPeso(55.30f);
        c.setIdade(3);
        c.setMembros(4);
        c.locomover();
        c.emitirSom();
        c.usarBolsa();
        System.out.println("--------------");
        
        System.out.println("Cachorro...");
        k.setPeso(3.94f);
        k.setIdade(5);
        k.setMembros(4);
        k.locomover();
        k.alimentar();
        k.emitirSom();
        k.abanarRabo();
        System.out.println("--------------");
        
        
        //PARTE 01
        /*
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();
                        
        System.out.println("Mamíferos...");
        m.setPeso(82.5f);
        m.setIdade(2);
        m.setMembros(4);;
        m.locomover();
        m.alimentar();
        m.emitirSom();
        System.out.println("--------------");
        
        System.out.println("Peixes...");
        p.setPeso(0.35f);
        p.setIdade(1);
        p.setMembros(0);
        p.locomover();
        p.alimentar();
        p.emitirSom();
        p.soltarBolha();
        System.out.println("--------------");
        
        System.out.println("Aves...");
        a.setPeso(0.89f);
        a.setIdade(2);
        a.setMembros(2);
        a.locomover();
        a.alimentar();
        a.emitirSom();
        a.fazerNinho();
        System.out.println("--------------");
        */
        
        
    }
    
}
