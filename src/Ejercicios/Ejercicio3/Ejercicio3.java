package Ejercicios.Ejercicio3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("nombres.txt"));
        Scanner sccanner = new Scanner(System.in);
        List<String> listaNombres= new ArrayList<>();


        while (sc.hasNextLine()){
            String nombre = sc.nextLine();
            listaNombres.add(nombre);
        }
        System.out.println("Se han leido " + listaNombres.size() + " palabras");
        System.out.println("Pon una letra por la cual quieres que empiezen las palabras");
        String letra =sccanner.nextLine();

        System.out.println("Palabras que comienzan por " + letra + " :" +comienzaPorLetra(letra,listaNombres));
        System.out.println("Palabras que terminan en consonante "+terminaPorConsonante(listaNombres));

        System.out.println("¿Que nombre quieres buscar?");
        String palabra=sccanner.nextLine();
        System.out.println("¿Esta en la lista la palabra "+palabra+"? "+comprobarPalabra(palabra,listaNombres));
//        System.out.println(comienzaPorLetra(letra,listaNombres));
//        System.out.println(terminaEnVocal(listaNombres));
        System.out.println("¿Que secuencia quieres buscar?");
        String secuencia=sccanner.nextLine();

       System.out.println(secuenciadecaracteres(secuencia,listaNombres));

    }

    public static List<String> comienzaPorLetra (String letra,List<String> listaNombres){
        List<String> comienzaPorLetraSolicitada =new ArrayList<>();
        for (String lista:listaNombres) {
            if (lista.startsWith(letra)){
                comienzaPorLetraSolicitada.add(lista);
            }
        }
        return comienzaPorLetraSolicitada;
    }
    public static List<String> terminaPorConsonante (List<String> listaNombres){
        List<String> terminaEnConsonante =new ArrayList<>();
        for (String lista:listaNombres) {
            if (lista.matches(".*[^aeiouAEIOUáéíóúÁÉÍÓÚ]")){
                terminaEnConsonante.add(lista);
            }
        }
        return terminaEnConsonante;
    }
    public static boolean comprobarPalabra (String palabra,List<String> listaNombres){
        for (String lista:listaNombres) {
            if (lista.equalsIgnoreCase(palabra))
                return true;
        }

        return false; //return lista.contains(nombre.tolowercase)
    }
    public static boolean secuenciadecaracteres (String secuencia,List<String> listaNombres){
        for (String lista:listaNombres) {
            if (lista.contains(secuencia))
                return true;
        }

        return false;
    }


}
