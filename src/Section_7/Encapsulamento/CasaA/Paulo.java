package Section_7.Encapsulamento.CasaA;

public class Paulo {

    Ana esposa = new Ana();
    void testeAcessos() {

        //segredo
        //facoDentroDeCasa
        //formaDeFalar
        //todosSabem

        System.out.println(esposa.segredo); //Mesmo morando na mesma casa, nao se pode ver o atributo private.
        System.out.println(esposa.facoDentroDeCasa);
        System.out.println(esposa.formaDeFalar);
        System.out.println(esposa.todosSabem);
    }
}
