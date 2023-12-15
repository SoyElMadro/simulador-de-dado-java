package com.simuladordedado;

import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido a este simulador de dado.");

        String repetir;
        do {
            int numero = Dado.obtenerNumero();
            Dado.mostrarNumero(numero);
            System.out.println("---------------------------------------------");
            System.out.println("Deseas tirar nuevamente el dado? (s/n)");
            repetir = scanner.next();
        } while (Objects.equals(repetir, "s") || Objects.equals(repetir, "S"));

        System.out.println("Se dejará de ejecutar el búcle de tirar el dado. ¡Hasta la próxima!");
    }
}