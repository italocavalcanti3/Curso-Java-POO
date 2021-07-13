package aula05;

import java.util.Scanner;

public class Aula05 {

    public static void main(String[] args) {
        
        ContaBanco c1 = new ContaBanco();
        c1.abrirConta("CP", "Jubileu");        
        ContaBanco c2 = new ContaBanco();
        c2.abrirConta("CC", "Creuza");
        
        c1.depositar(300);
        c2.depositar(500);
        c1.pagarMensal();
        c2.pagarMensal();
        c1.sacar(1000);
        c2.sacar(4411);
        System.out.println("");
        c1.fecharConta();
        c2.fecharConta();
        c1.sacar(430);
        c2.sacar(538);
        System.out.println("");
        c1.extrato();
        c2.extrato();
        c1.fecharConta();
        c2.fecharConta();
        
    }
    
}
