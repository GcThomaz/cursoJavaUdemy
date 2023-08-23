package Section_7.Encapsulamento.CasaB;

import Section_7.Encapsulamento.CasaA.Ana;

public class Pedro extends Ana {

    void testeAcessos() {

        //segredo
        //facoDentroDeCasa
        //formaDeFalar
        //todosSabem

        System.out.println(segredo); //Mesmo morando na mesma casa, nao se pode ver o atributo private.
        System.out.println(facoDentroDeCasa);
        System.out.println(formaDeFalar);
        System.out.println(todosSabem);
    }
}
