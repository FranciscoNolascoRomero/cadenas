package Ejercicios.Ejercicio3;

import javax.script.ScriptContext;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {

        Scanner sccanner = new Scanner(System.in);
        Scanner sc = new Scanner(new File("nombres.txt"));
        List<String> listaNombres= new ArrayList<>();
        System.out.println("Pon una letra por la cual quieres que empiezen las palabras");
        String letra =sccanner.nextLine();
        System.out.println(comienzaPorLetra(letra,listaNombres));
        System.out.println(terminaEnVocal(listaNombres));
        System.out.println("¿Que palabra quieres buscar?");
        String palabra=sccanner.nextLine();
        System.out.println();

    }
    public static String comienzaPorLetra (String letra,String[] listaNombres){
        List<String> cadena =new ArrayList<>();
        for (int i = 0; i < listaNombres.length; i++) {
            if (listaNombres[i].matches(letra+".*")){
                cadena.add(listaNombres[i]);
            }
        }
        return cadena.toString();
    }
    public static String terminaEnVocal (String[] listaNombres){
        List<String> terminanVocal =new ArrayList<>();
        for (int i = 0; i < listaNombres.length; i++) {
            if (listaNombres[i].matches(".*[aeiouAEIOUáéíóúÁÉÍÓÚ]")){
                terminanVocal.add(listaNombres[i]);
            }
        }
        return terminanVocal.toString();
    }
    public static boolean comprobarPalabra (String palabra,String[] listaNombres){
        for (String lista:listaNombres) {
            if (lista ==palabra)
                return true;
        }

        return false;
    }

}
