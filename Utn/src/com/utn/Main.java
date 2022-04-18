package com.utn;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ejercicioTrece();
    }

    public static void ejercicioUno() {
        int n = 1;
        double a = 2d;
        char c = '3';

        System.out.println("n=" + n + " a=" + a + "c=" + c);
        System.out.println(n + a);
        System.out.println(a - n);
        System.out.println(Integer.valueOf(c));
    }

    public static void ejercicioDos() {
        int x = 13, y = 12;
        double n = 15d, m = 32d;

        System.out.println(n + m);
        System.out.println(x - n);
        System.out.println(x * m);
    }

    public static void ejercicioTres() {
        int n = 15;

        n = (n + 77 - 3) * 2;
        System.out.println(n);
    }

    /* Programa java que declare cuatro variables enteras A, B, C y D y asignarle un valor a
    cada una. A continuación realiza las instrucciones necesarias para que: B tome el
    valor de C, C tome el valor de A, A tome el valor de D, D tome el valor de B.*/
    public static void ejercicioCuatro() {
        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;
        int bAux = b;

        b = c;
        c = a;
        a = d;
        d = bAux;
        System.out.println(b);
        System.out.println(c);
        System.out.println(a);
        System.out.println(d);
    }

    /*Programa Java que declare una variable A de tipo entero, asignarle un valor. A
     continuación mostrar un mensaje indicando si A es par o impar.*/
    public static void ejercicioCinco(int a) {
        //int a = 15;

        System.out.println(a % 2 == 0 ? "es par" : "no es par");
    }

    /*. Programa Java que declare una variable B de tipo entero y asignarle un valor. A
    continuación mostrar un mensaje indicando si el valor de B es positivo o negativo. */
    public static void ejercicioSeis(int b) {
        //int a = 15;

        System.out.println(b < 0 ? "es negativo" : "es positivo");
    }

    /*Programa Java que declare una variable C de tipo entero y asignarle un valor. A
    continuación mostrar un mensaje indicando si el valor de C es positivo o negativo,
    si es par o impar, si es múltiplo de 5, si es múltiplo de 10 y si es mayor o menor que
    100.*/
    public static void isMultiple(final int numero, final int multiplo) {
        System.out.println(numero % multiplo == 0 ? "Es multiplo de " + multiplo : "No es multiplo de " + multiplo);
    }

    public static void isHigherThan(final int numero, final int limit) {
        System.out.println(numero < limit ? numero + " es mayor que " + limit : numero + " es menor que " + limit);
    }

    public static void ejercicioSiete() {
        int c = 15;

        ejercicioCinco(c);
        ejercicioSeis(c);
        isMultiple(c, 5);
        isMultiple(c, 10);
        isHigherThan(c, 100);
    }

    /*8. Programa Java que lea un nombre y muestre por pantalla:
    “Buenos días, {NOMBRE}”.*/
    public static void ejercicioOcho() {
        String nombre = "Emi";
        System.out.println("Buenos Días " + nombre);
    }

    /*9. Programa Java que lea un número entero por teclado y calcule el doble y el triple de
    ese número y lo muestre por pantalla.*/

    public static void ejercicioNueve() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("ingrese un numero");
        int numero = 0;
        numero = scanner.nextInt();
        System.out.println("Ingreso numero");
        System.out.println("/nEl doble es " + numero * 2);
        System.out.println("/nEl triple es " + numero * 3);
    }

    /*Programa que lea una cantidad de grados Fahrenheit y lo convierta a grados
      centígrados.*/
    public static void ejercicioDiez() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("ingrese un numero");
        int farenheit = 0;
        farenheit = scanner.nextInt();
        int centigrados = (farenheit - 32) * 5 / 9;
        System.out.println(farenheit + " grados farenheit es igual a " + centigrados + " grados centigrados");
    }

    /*Programa que lee por teclado el valor del radio de una circunferencia, calcula y
    muestra por pantalla la longitud y el área de la circunferencia.
    */
    public static void ejercicioOnce() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("ingrese un numero");
        int radio = 0;
        radio = scanner.nextInt();
        int diametro = radio + 2;
        double area = Math.PI * Math.pow(radio, 2);
        System.out.println("El diametro de la circunferencia es " + diametro + " y el area de la circunferencia es " + area);
    }

    /* Programa que pase una velocidad en Km/h a m/s. La velocidad se lee por teclado.*/
    public static void ejercicioDoce() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("ingrese un numero");
        int velocidad = scanner.nextInt();

        double conversion = (velocidad * 1000.0) / 3600.0;
        System.out.println(conversion + " velocidad en m/s");
    }

    /*Programa que lea la longitud de los catetos de un triángulo rectángulo y calcule la
    longitud de la hipotenusa según el teorema de Pitágoras.
    */

    public static void ejercicioTrece() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese cateto 1");
        double cateto1 = scanner.nextDouble();
        System.out.println("Ingrese cateto 2");
        double cateto2 = scanner.nextDouble();
        double hipotenusa = Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));
        System.out.println("Hipotenusa = " + hipotenusa);
    }

    /*. Programa que calcula el volumen de una esfera.*/
    public static void ejercicioCatorce() {
        Scanner scanner = new Scanner(System.in);
        double radio = 15;
        double volumen = 4/3 * Math.PI * Math.pow(radio, 3);
        System.out.println("Volumen = " + volumen);
    }

    /*. Programa que calcula el área de un triángulo a partir de la longitud de sus lados.*/
    public static void ejercicioQuince() {
        Scanner scanner = new Scanner(System.in);
        double base = 15;
        double altura = 6;
        System.out.println("area del triangulo = " + base * altura / 2);
    }

    public static void ejercicioDieciseis() {
        int number1 = 12223;
        String number = String.valueOf(number1);
        char[] digits1 = number.toCharArray();

        for(int i = 0; i < digits1.length; i++) {
            System.out.println(digits1[i]);
        }
    }
}
