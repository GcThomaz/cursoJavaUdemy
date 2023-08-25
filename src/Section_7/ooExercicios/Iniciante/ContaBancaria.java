package Section_7.ooExercicios.Iniciante;

public class ContaBancaria {

    //Atributos
    private double saldo = 0;
    private int numeroConta;

    // Construtor

    public ContaBancaria(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    // Métodos Getters e Setters

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }


    //Métodos da classe

    public String depositar(double deposito) {
        setSaldo(getSaldo() + deposito);
        return "Deposito efetuado com sucesso!";
    }

    public String sacar(double saque) {
        if (saldo <= 0) {
            return "Voce nao tem saldo suficiente para sacar.";
        } else {
            setSaldo(getSaldo() - saque);
        }
        return "Saque efetuado com sucesso!";
    }
}
