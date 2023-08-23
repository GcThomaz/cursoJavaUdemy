package Section_7.Encapsulamento.CasaB;

import Section_7.Encapsulamento.CasaA.Ana;

public class Julia {
    Ana sogra = new Ana();

    void testeAcessos() {

        //segredo
        //facoDentroDeCasa
        //formaDeFalar
        //todosSabem

        System.out.println(sogra.segredo); //Mesmo morando na mesma casa, nao se pode ver o atributo private.
        System.out.println(sogra.facoDentroDeCasa);
        System.out.println(sogra.formaDeFalar);
        System.out.println(sogra.todosSabem);
}
