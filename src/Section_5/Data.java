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
        final String formato = "%d / %d / %d"; //Variavel local. Pode ser acessada somente pelo método.
        return String.format(formato, dia, mes, ano);
    }
}
