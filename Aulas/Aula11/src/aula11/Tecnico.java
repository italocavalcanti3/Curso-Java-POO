package aula11;

public class Tecnico extends Aluno {

    private int registroProfissional;

    //MÉTODOS PÚBLICOS
    public final void  praticar() { //EXEMPLO DE MÉTODO FINAL
        System.out.println("Praticando...");
    }

    //MÉTODOS ESPECIAIS
    public int getRegistroProfissional() {
        return registroProfissional;
    }

    public void setRegistroProfissional(int registroProfissional) {
        this.registroProfissional = registroProfissional;
    }

}
