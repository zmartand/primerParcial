package mates;

import java.util.Scanner;

public class Matematicas {

    //Ejercicio 1

    public void MetodoMontecarlo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de puntos a generar: ");
        int puntosTotales = sc.nextInt();
        int aciertos = 0;
        double areaCuadrado = 4;
        for (int i = 1; i <= puntosTotales; i++) {
            double x = Math.random() * 2 - 1;
            double y = Math.random() * 2 - 1;
            if (Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2)) <= 1) {
                aciertos++;
            }
        }
        System.out.println("El valor de pi es: " + areaCuadrado * (aciertos / puntosTotales));

    }


}
