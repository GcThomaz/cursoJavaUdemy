package Section_6.Equals;

public class Equals {
    public static void main(String[] args) {

        Usuario u1 = new Usuario();
        u1.nome = "Pedro Correa";
        u1.email = "pedro.correa@gmail.com";

        Usuario u2 = new Usuario();
        u2.nome = "Pedro Correa";
        u2.email = "pedro.correa@gmail.com";

        System.out.println(u1 == u2); //Quando se compara os dois objetos por mais que os elementos dos atributos
        // sejam iguais, a comparaçao é feita em relaçao a referencia da memoria. Por exemplo: u1(0x1234) e u2
        // (0x5678). O que esta sendo comparado é a referencia de memoria, ou seja, 0x1234 == 0x5678 -> FALSE.

        System.out.println(u1.equals(u2)); // Para o equals funcionar voce precisa definir o que vai comparar. Caso
        // contrario, por padrao, ele vai comparar as referencias da memoria do objeto. Na classe Usuario tem uma
        // preparaçao do equals. Se funcionar o resultado vai ser TRUE, caso contrario ou se nao houver a preparaçao
        // do equals o resultado vai ser FALSE.


    }
}
