package Teoria;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("-------------------------");
        System.out.println("-INTRODUCE LA CONTRASEÑA-");
        System.out.println("-------------------------");
        String passwd = scanner.nextLine();

        boolean segura =esContreseñasegura(passwd);
        System.out.printf("¿ES SEGURA? %B%n",segura);

        //boolean longitud = passwd.length() >= 8;//? true : false;
//        if (passwd.length() < 8){
//            System.out.println("LA CONTRASEÑA NO ES SEGURA");
//            return;
//        }
//        boolean letra = false, numero = false, simbolo = false,mayuscula = false, minuscula = false;
//        for (int i = 0; i < passwd.length(); i++) {
//            if (Character.isDigit(passwd.charAt(i))){
//                numero=true;
//            }
//            if (Character.isLetter(passwd.charAt(i))){
//                letra=true;
//            }
//            if (Character.isUpperCase(passwd.charAt(i))){
//                mayuscula=true;
//            }
//            if (Character.isLowerCase(passwd.charAt(i))){
//                minuscula=true;
//            }
//            if (!Character.isLetterOrDigit(passwd.charAt(i))){
//                simbolo=true;
//            }
//        }
//        boolean segura = numero && letra && mayuscula && minuscula && simbolo;
//        System.out.printf("¿ES SEGURA? %B%n",segura);

        //MIS COSAS
//        if (letra == true && numero==true && mayuscula==true &&  minuscula==true && simbolo==true){
//            System.out.println("LA CONTRASEÑA ES SEGURA");
//        }else {
//            System.out.println("DEBES INGLUIR UNA MAYUSCULA , MINUSCULA, SIMBOLO, LETRAS Y NUMEROS");
//        }

//        if (letra == false){
//            System.out.println("HA TU CONTRASEÑA LE FALTA UNA letra");
//        }
//        if (numero==false){
//            System.out.println("HA TU CONTRASEÑA LE FALTA UN numero");
//        }
//        if (mayuscula==false){
//            System.out.println("HA TU CONTRASEÑA LE FALTA UNA mayuscula");
//        }
//        if (minuscula==false{
//            System.out.println("HA TU CONTRASEÑA LE FALTA UNA minuscula");
//        }
//        if (simbolo==false){
//            System.out.println("HA TU CONTRASEÑA LE FALTA UN SIMBOLO");
//        }

    }
    public static boolean esContreseñasegura(String passswd){
        if (passswd.length() < 8)
            return false;
        boolean longitud =false, letra = false, numero = false, simbolo = false,mayuscula = false, minuscula = false;

        for (int i = 0; i < passswd.length(); i++) {
            if (Character.isDigit(passswd.charAt(i))){
                numero=true;
            }
            if (Character.isLetter(passswd.charAt(i))){
                letra=true;
            }
            if (Character.isUpperCase(passswd.charAt(i))){
                mayuscula=true;
            }
            if (Character.isLowerCase(passswd.charAt(i))){
                minuscula=true;
            }
            if (!Character.isLetterOrDigit(passswd.charAt(i))){
                simbolo=true;
            }
        }
        return numero && letra && mayuscula && minuscula && simbolo;
    }
}
