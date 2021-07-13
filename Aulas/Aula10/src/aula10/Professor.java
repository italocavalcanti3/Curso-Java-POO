package aula10;

public class Professor extends Pessoa {

    private String especialidade;
    private float salario;

    //MÉTODOS PÚBLICOS
    public void receberAum(float aum) {
        this.salario += aum;
    }

    //MÉTODOS ESPECIAIS
//    public Professor(String especialidade, float salario) {
//        this.especialidade = especialidade;
//        this.salario = salario;
//    }
    
    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

}
