package aula06;

public class ControleRemoto implements Controlador {

    // ATRIBUTOS
    private int volume;
    private boolean ligado;
    private boolean tocando;

    // MÉTODO CONSTRUTOR
    public ControleRemoto() {
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }

    // MÉTODOS ACESSORES E MODIFICADORES
    private void setVolume(int volume) {
        this.volume = volume;
    }

    private int getVolume() {
        return volume;
    }

    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    private boolean getLigado() {
        return ligado;
    }

    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    private boolean getTocando() {
        return tocando;
    }

    //MÉTODOS ABSTRATOS
    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        if (this.getLigado()) {
            System.out.println("--- MENU ---");
            System.out.println("Tocando: " + (this.getTocando()?"Sim" : "Não"));
            System.out.println("Volume: " + this.getVolume());
            System.out.println("--- FIM ---");
        }
    }

    @Override
    public void fecharMenu() {
        System.out.println("--- FECHANDO MENU ---");
    }

    @Override
    public void maisVolume() {
        if (this.getLigado()) {
            this.setVolume(this.getVolume() + 5);
        }
    }

    @Override
    public void menosVolume() {
        if (this.getLigado() && this.getVolume() > 0) {
            this.setVolume(this.getVolume() - 5);
        }
    }

    @Override
    public void ligarMudo() {
        if (this.getLigado() && this.getVolume() > 0) {
            this.setVolume(0);
        }
    }

    @Override
    public void desligarMudo() {
        if (this.getLigado() && this.getVolume() == 0) {
            this.setVolume(50);
        }
    }

    @Override
    public void play() {
        if (this.getLigado() && !(this.getTocando())) {
            this.setTocando(true);
        }
    }

    @Override
    public void pause() {
        if (this.getLigado() && this.getTocando()) {
            this.setTocando(false);
        }
    }

}
