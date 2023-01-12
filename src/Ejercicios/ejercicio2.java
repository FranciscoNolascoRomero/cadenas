package Ejercicios;

import java.util.ArrayList;
import java.util.List;

public class ejercicio2 {
    public static void main(String[] args) {
//        creamos un list de string que aparezca:nombre, apellidos, direccoion, telefono
//        List<String> Lista = new ArrayList<>();//lista que se puede modificar
//        Lista.add("Jueaquin");
        List<String> Listas =List.of("Jueaquin","Gomez Naguer" , "avda. madrid 35", "953222222");
//        Listacsv.add("avenidas");es inmutable

        //usamos un bucle mejorado aparezca en una línea cada uno de los valores:
        //        //nombre
        //        //apellidos
        //        //...
        for (String listascsv : Listas) {
           System.out.println(listascsv);
       }
        //Un método que pasemos la lista anterior y devuelva un String como una línea CSV
        //"nombre, apellidos, direccion, telefono" trabajando con string builder
        String csv1 = crearCampoCSV1(Listas.toString());
        System.out.println(csv1);
        //mostramos en consola la cadena anterior, pero en mayúscula
        //Pasamos la cadena anterior a un método y nos devuelva una nueva cadena
        //pero sin espacios y en mayúscula:
        //"NOMBRE,APELLIDOS,DIRECCIÓN,TELÉFONO" USANDO STRINGBUILDER
        //Un método, que se le pase la cadena anterior y nos devuelva el nombre
        //con el formato apellidos, nombre USANDO UN STRINGBUILDER
        //un metodo que se le pasa la cadena  "NOMBRE,APELLIDOS,DIRECCIÓN,TELÉFONO"
        // y un codigo postal devuelva "NOMBRE,APELLIDOS,DIRECCIÓN,TELÉFONO,CP" USANDO EL STRING BUILDER

    }

    private static String crearCampoCSV1(String Listas) {
//        StringBuilder sBuilder = new StringBuilder();
//        sBuilder.insert(1,Listas , 0,4);
//       String csv1 = "";
//        for (String Lista : sBuilder) {
//           csv1 += apend + ", ";
//       }
//       if (csv1.isEmpty())
//            return csv1;
        // else
        return null;//sBuilder.substring(0, sBuilder.length() - 2);
    }
}
