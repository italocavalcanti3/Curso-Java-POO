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
public class Caneta {

    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
    
    void status() {
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga + "%");
        System.out.println("Está tampada? " + this.tampada);
    }
    
    void rabiscar() {
        if (tampada) {
            System.out.println("A caneta não pode estar tampada.");
        } else {
            System.out.println("~~~ Aqui está um belo rabisco. ~~~");
        }
    }
    
    void tampar() {
        this.tampada = true;
    }
    
    void destampar() {
        this.tampada = false;
    }
    
}
