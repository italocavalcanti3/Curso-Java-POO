package aula.pkg04;

public class Caneta {
    
    public String modelo;
    private float ponta;
    private boolean tampada;
    private String cor;
    
    // ATALHOS ALT + INSERT PARA CRIAR MÉTODOS
    
    public Caneta(String modelo, float ponta, String cor) { //MÉTODO CONSTRUTOR
        this.modelo = modelo;
        this.ponta = ponta;
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getPonta() {
        return ponta;
    }

    public void setPonta(float ponta) {
        this.ponta = ponta;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
    
    public void tampar() {
        this.tampada = true;
    }
    
    public void destampar() {
        this.tampada = false;
    }

}
