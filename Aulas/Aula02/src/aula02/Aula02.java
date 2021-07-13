/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula02;

import javax.swing.JOptionPane;

/**
 *
 * @author italo
 */
public class Aula02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
//        Caneta c1 = new Caneta();
//        c1.modelo = "Bic";
//        c1.cor = "Azul";
//        c1.ponta = (float) 0.5; //ou 0.5f
//        c1.tampar();
//        c1.carga = 90;
//        
//        Caneta c2 = new Caneta();
//        c2.modelo = "Hostnet";
//        c2.cor = "Preta";
//        c2.destampar();
//        c1.status();
//        
//        System.out.println("");        
//        System.out.println(c1.modelo);
//        c1.rabiscar();        
//        System.out.println("");        
//        System.out.println(c2.modelo);
//        c2.rabiscar();

        //EXERCÍCIO DO FIM DA AULA: RG
        
        
        RG italo = new RG();
        italo.nome = JOptionPane.showInputDialog(null, "Digite seu nome:", "Cadastro de RG", JOptionPane.INFORMATION_MESSAGE);
        italo.nr = JOptionPane.showInputDialog(null, "Digite seu RG: ", "Cadastro de RG", JOptionPane.INFORMATION_MESSAGE);
        italo.nasc = JOptionPane.showInputDialog(null, "Data de Nascimento: ", "Cadastro de RG", JOptionPane.INFORMATION_MESSAGE);
        
        italo.apresentarRg();
        System.out.println("---");
        italo.corrigirNome("Italo Braga");
        italo.apresentarRg();
        
    }
    
}
