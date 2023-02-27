package Ejercicio2;

import java.util.concurrent.TimeUnit;
import java.lang.InterruptedException;

public class Principal {
    /*import java.util.concurrent.TimeUnit;
import java.lang.InterruptedException;
public class Principal{
public static void main(String[] args){
try
{
Tablero tablero = new Tablero();
System.out.println("SIMULACIÓN CON TABLERO LEÍDO
");
CAPÍTULO 2. PRÁCTICAS 9
tablero.leerEstadoActual();
System.out.println(tablero);
for(int i = 0; i <= 5; i++)
{
TimeUnit.SECONDS.sleep(1);
tablero.transitarAlEstadoSiguiente();
System.out.println(tablero);
}
System.out.println("SIMULACIÓN CON TABLERO
GENERADO MEDIANTE MONTECARLO");
tablero.generarEstadoActualPorMontecarlo();
System.out.println(tablero);
for(int i = 0; i <= 15; i++)
{
TimeUnit.SECONDS.sleep(1);
tablero.transitarAlEstadoSiguiente();
System.out.println(tablero);
}
}catch(InterruptedException e)
{
System.out.println(e);
}
}
}
A continuación se muestra el resultado del método toString() de la
clase Tablero.java para el tablero de la matriz de ceros y unos presentada
anteriormente:
x
x x
xx*/
    /*public static void main(String[] args) {
        Tablero tablero = new Tablero();
        System.out.println("SIMULACIÓN CON TABLERO LEÍDO");
        //tablero.leerEstadoActual();
        tablero.toString();
        System.out.println(tablero);
        for (int i = 0; i <= 5; i++) {
            tablero.transitarAlEstadoSiguiente();
            System.out.println(tablero);
        }
        System.out.println("SIMULACIÓN CON TABLERO GENERADO MEDIANTE MONTECARLO");
        tablero.generarEstadoActualPorMontecarlo();
        System.out.println(tablero);
        for (int i = 0; i <= 15; i++) {
            tablero.transitarAlEstadoSiguiente();
            System.out.println(tablero);
        }
    }

*/

        public static void main(String[] args){
            try
            {
                Tablero tablero = new Tablero();
                System.out.println("SIMULACIÓN CON TABLERO LEÍDO");

                //tablero.leerEstadoActual();
                System.out.println(tablero);
                for(int i = 0; i <= 5; i++)
                {
                    TimeUnit.SECONDS.sleep(1);
                    tablero.transitarAlEstadoSiguiente();
                    System.out.println(tablero);
                }
                System.out.println("SIMULACIÓN CON TABLERO GENERADO MEDIANTE MONTECARLO");
                        tablero.generarEstadoActualPorMontecarlo();
                System.out.println(tablero);
                for(int i = 0; i <= 15; i++)
                {
                    TimeUnit.SECONDS.sleep(1);
                    tablero.transitarAlEstadoSiguiente();
                    System.out.println(tablero);
                }
            }catch(InterruptedException e)
            {
                System.out.println(e);
            }
        }
    }


