package com.simuladordedado;

import java.util.Random;
public class Dado {

    public static int obtenerNumero() {
        Random number = new Random();
        return number.nextInt(6) + 1;
    }

    public static void mostrarNumero(int numero) {
        System.out.println("Número del dado: " + numero);
    }

}
