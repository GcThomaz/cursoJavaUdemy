package Section_7.ooExercicios.Intermediario.Ex01;

public class Veiculo {

    protected String nome;
    protected String cor;
    protected String modelo;
    protected int velocidade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public String acelerar() {
        if (velocidade >= 0) {
            this.velocidade += 10;
        } else {
            return "Nao é possivel acelerar";
        }
        return "Acelerando";
    }

    public String frear() {
        if (velocidade >= 10) {
            this.velocidade -= 10;
        } else {
            return "Nao é possivel frear se estiver parado";
        }
        return "Freando";
    }
}
