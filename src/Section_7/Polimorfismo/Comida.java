package Section_7.Polimorfismo;

public class Comida {

    private double peso;

    public Comida() {
        setPeso(peso);
    }

    public double getPeso() {
        return this.peso;
    }

    public void setPeso(double peso) {
        if (peso >= 0) {
            this.peso = peso;
        }
    }
}
