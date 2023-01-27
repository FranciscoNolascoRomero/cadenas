package Ejercicios.Ejercicio2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import static strings.StringHelper.createSafePassword;

public class TestClaveSegura {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int numeroDeClaves;
        do {
            System.out.println("¿Cuantas claves quieres generar? (5-15)");
            numeroDeClaves = scanner.nextInt();
        }while (numeroDeClaves > 4 && numeroDeClaves < 16);

        int lenght;
        do {
            System.out.println("¿De que tamaño?");
            lenght = scanner.nextInt();
        }while (lenght<4);


        String [ ] claves = new String[numeroDeClaves];
        for (int i = 0; i < numeroDeClaves; i++) {
            claves[i]=createSafePassword(lenght);
        }
        System.out.println(Arrays.toString(claves));
        System.out.printf("Su clave segura es %s ",claves[random.nextInt(numeroDeClaves)]);
        scanner.close();

    }
}
