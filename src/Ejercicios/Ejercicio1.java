package Ejercicios;

import java.sql.SQLOutput;

public class Ejercicio1 {
    public static void main(String[] args) {
        //creamos un array de string que aparezca: nombre apellidos direccion telefono.
        String telefono="6891872342";
        String nombre="Francisco";
        String apellidos="Nolasco Romero";
        String direccion="alonso de freylas";
        String[] persona ={nombre,apellidos,direccion,telefono};
        //usamos un bucle mejorado aparezca en una linea cada uno de los valores
        for (String personas : persona) {
            System.out.println(personas);
        }
        //nombre
        //apellidos
        //..
        // un metodo que pasemos el array anterior y devuelva un string como una linea
        //"nombre, apellidos, direccion, telefono"
        //mostramos en consola la cadena anterior
        //pasamos la cadena anterior a un metodo y nos devuelve una nueva cadena
        //pero esta sin espacios y en mayusculas
        //"NOMBRE,APELLIDOS,DIRECCION,TELEFONO"
        //Un metodo,que se le pase a la cadena anterior y nos devuelva el nombre
        //con el formato apellidos, nombre
        //un metodo que se le pase el string anterior de apellidos y nombre,nos diga cuantas
        //vocales tiene entre apellidos y nombre

    }
}

