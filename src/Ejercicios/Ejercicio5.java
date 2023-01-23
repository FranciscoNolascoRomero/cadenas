package Ejercicios;

import java.security.PublicKey;
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("-------------------------");
        System.out.println("--INTRODUCE UNA PALABRA--");
        System.out.println("-------------------------");
        String palabra = scanner.nextLine();

        String letra;
        do {
            System.out.println("--------------------------------------------");
            System.out.println("-INTRODUCE UNA LETRA PARA SABER SI LA LLEVA-");
            System.out.println("--------------------------------------------");
            letra = scanner.nextLine();
        }while (!letra.matches("[a-zA-Z]"));

        System.out.println("-------------------------");
        System.out.println("-INTRODUCE OTRA PALABRA-");
        System.out.println("-------------------------");
        String palabra2 = scanner.nextLine();

        System.out.println("La palabra " + palabra + " tiene " +  obtenerNumeroDeLetras(palabra) + " letras");

        if (empiezaPorVocal(palabra))
            System.out.println("La palabra " + palabra + " empieza por vocal");
        else
            System.out.println("La palabra " + palabra + " no empieza por vocal");

        if (acabaEnVocal(palabra))
            System.out.println("La palabra " + palabra + " acaba por vocal");
        else
            System.out.println("La palabra " + palabra + " no acaba por vocal");

        System.out.println("La palabra " + palabra + " tiene " + obtenerNumeroDeVocales(palabra) + " vocales");

        if (contieneLetra(palabra,letra))
            System.out.println("La palabra " + palabra + " si contiene la letra " + letra);
        else
            System.out.println("La palabra " + palabra + " no contiene la letra " + letra);

        if (esUnPalindromo(palabra))
            System.out.println("La palabra " + palabra + " si es palindromo");
        else
            System.out.println("La palabra " + palabra + " no es palindromo");

        if (sonIguales(palabra,palabra2))
            System.out.println("La palabra " + palabra + " si es igual que " + palabra2);
        else
            System.out.println("La palabra " + palabra + " no es igual que " + palabra2);

    }
    public static int obtenerNumeroDeLetras(String palabra){
        int letras=palabra.length();
        return letras;
    }
    public static boolean empiezaPorVocal(String palabra){

        return palabra.matches("[aeiouáéíóúÁÉÍÓÚAEUIO].*");
    }
    public static boolean acabaEnVocal(String palabra){

        return palabra.matches(".*[aeiouáéíóúÁÉÍÓÚAEUIO]");
    }
    public static int obtenerNumeroDeVocales(String palabra){
        int contadorVocales = 0;
        for (int i = 0; i < palabra.length(); i++) {
            if (palabra.toLowerCase().charAt(i) == 'a' || palabra.toLowerCase().charAt(i) == 'e' || palabra.toLowerCase().charAt(i) == 'i'|| palabra.toLowerCase().charAt(i) == 'o'|| palabra.toLowerCase().charAt(i) == 'u'|| palabra.toLowerCase().charAt(i) == 'á'|| palabra.toLowerCase().charAt(i) == 'ó' )
                contadorVocales++;
        }
        return contadorVocales;
    }
    public static boolean contieneLetra(String palabra, String letra){
        for (int i = 0; i < palabra.length(); i++) {
            if (palabra.charAt(i) == letra.charAt(0))
                return true;
        }
        return false;
    }
    public static boolean esUnPalindromo(String palabra){
        String invertida = new StringBuilder(palabra).reverse().toString();
        return invertida.equals(palabra);
    }
    public static boolean sonIguales(String palabra,String palabra2){
        return palabra.equals(palabra2);
    }


}
