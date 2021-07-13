package aula05;

public class ContaBanco {
    
    public int numConta;
    protected String tipo;
    private String dono;
    private double saldo;
    private boolean status;

    public ContaBanco() {
        this.saldo = 0;
        this.status = false;
        this.setNumConta(this.getNumConta()+1);
    }
    
    public void abrirConta(String t, String d) {
        this.setTipo(t);
        this.setDono(d);
        this.setStatus(true);
        System.out.println("");
        System.out.println("Conta aberta");
        System.out.println("-------");
        System.out.println("Olá " + d + "!");
        if (this.getTipo() == "CC") {
            this.setSaldo(this.getSaldo()+50);
            System.out.println("Você recebeu R$ 50 de incentivo.");
        } else if (this.getTipo() == "CP") {
            this.setSaldo(this.getSaldo()+150);
            System.out.println("Você recebeu R$ 150 de incentivo.");
        } else {
            System.out.println("Tipo de conta inválida.");
            this.setStatus(false);
        }
        System.out.println("-------");
    }
    
    public void fecharConta() {
        if (this.getSaldo() == 0) {
            this.setStatus(false);
            System.out.println("");
            System.out.println("----------");
            System.out.println("Conta fechada -> " + this.getDono());
            System.out.println("Obrigado por utilizar nossos serviços.");
        } else if (this.getSaldo() < 0) {
            System.out.println("Você precisa acertar as contas primeiro.");
        } else {
            System.out.println("Retire seu saldo primeiro.");
        }
    }
    
    public void depositar(double d) {
        if (this.isStatus()) {
            if (d > 0) {
                this.setSaldo(this.getSaldo()+d);
                System.out.println("R$ " + d + " adicionado à conta.");
            } else {
                System.out.println("Valor inválido.");
            }
        } else {
            System.out.println("Abra uma conta para depositar.");
        }
    }
    
    public void sacar(double d) {
        if (d <= this.getSaldo()) {
            //this.saldo -= d;
            this.setSaldo(this.getSaldo()-d);
            System.out.println("R$ " + d + " retirado.");
        } else {
            System.out.println("Você não pode sacar este valor.");
        }
    }
    
    public void pagarMensal() {
        if (this.getTipo() == "CC") {
            if (this.getSaldo() >= 12) {
                this.setSaldo(this.getSaldo()-12);
                System.out.println("Foram descontados R$ 12 da mensalidade.");
            } else {
                System.out.println("Saldo indisponível para pagar mensalidade.");
            }
        } else {
            if (this.getSaldo() >= 20) {
                this.setSaldo(this.getSaldo()-20);
                System.out.println("Foram descontados R$ 20 da mensalidade.");
            } else {
                System.out.println("Saldo indisponível para pagar mensalidade.");
            }
        }
    }
    
    public void extrato() {
        if (this.isStatus()) {
        System.out.println("");
        System.out.println("----------");
        System.out.println("Extrato -> " + this.getDono());
        System.out.println("");
        System.out.println("Nº da conta: " + this.getNumConta());
        System.out.println("");
        System.out.println("Tipo de conta: " + (this.getTipo() == "CC"?"Conta Corrente":"Conta Poupança"));
        System.out.println("");
        System.out.println("Saldo: R$ " + this.getSaldo());
        } else {
            System.out.println("Abra uma conta para retirar um extrato.");
        }
        System.out.println("----------");
    }
    
    
    //GETTERS & SETTERS

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    
    
    
    
    
}
