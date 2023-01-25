package Ejercicios;

import java.util.Random;
import java.util.Scanner;

public class TestClaveSegura {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        String palabra;

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


    public static String createSafePassword (int length){
        if (length < 4)
            return null;
        final String  FUENTE_CARACTERES =
                "abcdefghijklmnñopqrstuvwxyzABCDEFEGHIJKLMNÑOPQRSTUVWXYZ¿?()=@.:,;!¡&{}012456789";
        StringBuilder stringBuilder = new StringBuilder();
        Random random = new Random();
        // do {
        for (int i = 0; i < length; i++) {
            int posicion = random.nextInt(FUENTE_CARACTERES.length());
            char caracter = FUENTE_CARACTERES.charAt(posicion);
            stringBuilder.append(caracter);
        }
        //}while (!(isSafePassword(4,4,stringBuilder.toString())));

        return stringBuilder.toString();
    }

}
