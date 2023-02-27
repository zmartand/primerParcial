package Ejercicio2;

import java.util.Arrays;

public class Tablero {
    private static int DIMENSION = 30;
    private int[][] estadoActual;
    private int[][] estadoSiguiente = new int[DIMENSION][DIMENSION];

    public void leerEstadoActual() {
        int contador = 0;
        for (int i = 0; i < DIMENSION; i++) {
            for (int j = 0; j < DIMENSION; j++) {
                estadoActual[i][j] = (int) (Math.random() * 2);
                if (estadoActual[i][j] == 1) {
                    contador++;
                }
            }
        }
        System.out.println("El numero de celdas vivas es: " + contador);
    }
    public void crearEstadoActual() {
        estadoActual = new int[DIMENSION][DIMENSION];
        for (int i = 0; i < DIMENSION; i++) {
            for (int j = 0; j < DIMENSION; j++) {
                estadoActual[i][j] = (int) (Math.random() * 2);
            }
        }
    }
    public void crearEstadoSiguiente() {
        estadoSiguiente = new int[DIMENSION][DIMENSION];
        for (int i = 0; i < DIMENSION; i++) {
            for (int j = 0; j < DIMENSION; j++) {
                estadoSiguiente[i][j] = (int) (Math.random() * 2);
            }
        }
    }
    public void generarEstadoActualPorMontecarlo() {
        int contador = 0;
        for (int i = 0; i < DIMENSION; i++) {
            for (int j = 0; j < DIMENSION; j++) {
                estadoActual[i][j] = (int) (Math.random() * 2);
                if (estadoActual[i][j] == 1) {
                    contador++;
                }
            }
        }
        System.out.println("El numero de celdas vivas es: " + contador);
        estadoSiguiente = estadoActual;
    }



    public void transitarAlEstadoSiguiente() {
        estadoActual = estadoSiguiente;
        for (int i = 0; i < DIMENSION; i++) {
            for (int j = 0; j < DIMENSION; j++) {
                int contador = 0;
                if (estadoActual[i][j] == 1) {
                    contador++;
                } else if (estadoActual[i][j] == 0) {
                    contador--;
                }
                if (contador == 3) {
                    estadoSiguiente[i][j] = 1;
                } else if (contador == 2) {
                    estadoSiguiente[i][j] = estadoActual[i][j];
                } else {
                    estadoSiguiente[i][j] = 0;
                }
            }


        }


    }
    /*@Override
public String toString(){
return ""; // Esta línea hay que modificarla.
}*/


    @Override
    public String toString() {
        return "Tablero{" +
                "estadoActual=" + Arrays.toString(estadoActual) +
                ", estadoSiguiente=" + Arrays.toString(estadoSiguiente) +
                '}';
    }
}










