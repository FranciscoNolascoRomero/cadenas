package Ejercicios.Ejercicio2;

import java.util.Random;
import java.util.Scanner;

import static strings.StringHelper.createSafePassword;

public class TestClaveSegura {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.println("¿Cuantas claves quieres generar?");
        int numeroDeClaves = scanner.nextInt();

        System.out.println("¿De que tamaño?");
        int lenght = scanner.nextInt();

        String [ ] claves = new String[numeroDeClaves];
        for (int i = 0; i < numeroDeClaves; i++) {
            claves[i]=createSafePassword(lenght);
        }

        System.out.printf("Su clave segura es %s ",claves[random.nextInt(lenght)]);


    }
}
