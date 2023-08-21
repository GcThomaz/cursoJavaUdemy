package Section_6.Collections;

import java.util.HashMap;
import java.util.Map;

public class Mapa {
    public static void main(String[] args) {

        Map<Integer, String> usuario = new HashMap<>();

        usuario.put(1, "Gustavo");
        usuario.put(2, "Ludmila");
        usuario.put(3, "Eliane");
        usuario.put(4, "Pedro");
        usuario.put(5, "Marcos");

        System.out.println(usuario.size());
        //System.out.println(usuario.isEmpty());
        System.out.println(usuario.keySet());
        System.out.println(usuario.values());
        System.out.println(usuario.entrySet());

        System.out.println(usuario.containsKey(1));
        System.out.println(usuario.containsValue("Gustavo"));

        System.out.println(usuario.get(2));
        System.out.println(usuario.remove(1));
        System.out.println(usuario.remove(5, "Marcos"));
        
        //Percorrendo o map pela chave

        for (int chave :
                usuario.keySet()) {
            System.out.println(chave);
        }

        for (String valor :
                usuario.values()) {
            System.out.println(valor);
        }

        for (Map.Entry<Integer, String> registro :
                usuario.entrySet()) {
            System.out.print(registro.getKey() + " ");
            System.out.println(registro.getValue());
        }
    }
}
