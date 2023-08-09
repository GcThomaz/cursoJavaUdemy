package Section_5;

public class Data {
    int dia;
    int mes;
    int ano;

    public Data(int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public String dataFormatada() {

        return String.format("%d / %d / %d", dia, mes, ano);
    }
}
