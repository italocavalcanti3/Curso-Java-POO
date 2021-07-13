/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula02;

/**
 *
 * @author italo
 */
public class RG {
    String nr, nome, nasc;
    
    void apresentarRg() {
        System.out.println("~~~ RG ~~~");
        System.out.println("Nome: " + this.nome);
        System.out.println("Número: " + this.nr);
        System.out.println("Data de Nascimento: " + this.nasc);
        System.out.println("~~~~~~~~~~");
    }
    
    void corrigirNome(String nome) {
        this.nome = nome;
    }
    
}
