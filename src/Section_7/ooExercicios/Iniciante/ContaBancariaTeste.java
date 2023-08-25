package Section_7.ooExercicios.Iniciante;

import com.sun.security.auth.UnixNumericUserPrincipal;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class ContaBancariaTeste {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria(1111);


        System.out.println(conta.getSaldo());
        System.out.println(conta.depositar(100));
        System.out.println(conta.sacar(50));
        System.out.println(conta.getSaldo());
    }
}
