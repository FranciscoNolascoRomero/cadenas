package Ejercicios;

import java.util.List;

public class  ejercicio2 {
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

       String csv1 = crearCampoCSV1(Listas);
        System.out.println(csv1);
        //mostramos en consola la cadena anterior, pero en mayúscula
        //Pasamos la cadena anterior a un método y nos devuelva una nueva cadena
        //pero sin espacios y en mayúscula:
        //"NOMBRE,APELLIDOS,DIRECCIÓN,TELÉFONO" USANDO STRINGBUILDER

        String csv2 = crearCampoCSV1mayusculas(csv1);
        System.out.println(csv2);

        //Un método, que se le pase la cadena anterior y nos devuelva el nombre
        //con el formato apellidos, nombre USANDO UN STRINGBUILDER
        StringBuilder csv3 = mostrarNombre(Listas);
        System.out.println(csv3);
        //un metodo que se le pasa la cadena  "NOMBRE,APELLIDOS,DIRECCIÓN,TELÉFONO"
        // y un codigo postal devuelva "NOMBRE,APELLIDOS,DIRECCIÓN,TELÉFONO,CP" USANDO EL STRING BUILDER
        String csv4 = añairCodigopostal(Listas);
        System.out.println(csv4);


    }

    private static String añairCodigopostal(List<String> Listas) {
        StringBuilder sBuilder = new StringBuilder();

        String csv = String.valueOf(sBuilder);
        for (int i = 0; i < Listas.size(); i++) {
            sBuilder.append(Listas.get(i) + ", ");
        }
        sBuilder.append("23002" + ", ");

        // else
        return sBuilder.substring(0, sBuilder.length() - 2);
    }

    private static StringBuilder mostrarNombre(List<String> Listas) {
        StringBuilder sBuilder = new StringBuilder();
         StringBuilder csv =  sBuilder.append(Listas.get(1) + ", " + Listas.get(0));

        return csv;
    }

    private static String crearCampoCSV1mayusculas(String csv) {
        StringBuilder sBuilder = new StringBuilder(csv);

        return sBuilder.toString().replaceAll(", ",",").toUpperCase();
    }

    private static String crearCampoCSV1(List<String> Listas) {
        StringBuilder sBuilder = new StringBuilder();
        for (int i = 0; i < Listas.size(); i++) {
            sBuilder.append(Listas.get(i) + ", ");
        }

        // else
        //devuelve un string el sbuilder substring
        return sBuilder.substring(0, sBuilder.length() - 2);
    }
}
