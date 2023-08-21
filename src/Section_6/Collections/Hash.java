package Section_6.Collections;

import java.util.HashSet;

public class Hash {
    public static void main(String[] args) {

        HashSet<Usuario> usuarios = new HashSet<>();

        usuarios.add(new Usuario("Gustavo"));
        usuarios.add(new Usuario("Ludmila"));
        usuarios.add(new Usuario("Pedro"));

        System.out.println(usuarios.contains(new Usuario("Gustavo")));
    }
}
