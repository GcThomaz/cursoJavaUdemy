package Section_5;

public class ValorVsReferencia {
    public static void main(String[] args) {

        double a = 2;
        double b = a; //Atribuiçao por valor (Tipo primitivo)

        a++;
        b--;

        System.out.println(a + " " + b);

        Data d1 = new Data(1, 2, 1999);
        Data d2 = d1; // Atribuiçao por referencia (Objeto)

        d1.dia = 31;
        d2.mes = 12;

        System.out.println(d1); //Referencia da Memoria
        System.out.println(d2);//Referencia da Memoria
        System.out.println(d1.dataFormatada());//Data formatada
        System.out.println(d2.dataFormatada());//Data formatada
    }
}
