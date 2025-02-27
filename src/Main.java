import java.sql.SQLOutput;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int a = 2+2;
        int b = 2-1;
        int c = 3*3;
        int m = 4%3;
        int d = 10/3;   // redondea al entero más próximo
        float d1 = 10 / 3;  // esto devuelve el reondeo en formato float en este caso 3.0
        float d2 = 10f / 3f;  // Hay que convertir los dividendos en flotantes primero así o con souble como abajo:
        double d3 = 10.0 / 3.0;
//        System.out.println(d);
//        System.out.println(d1);
//        System.out.println(d2);
//        System.out.println(d3);
        int x = 5;
//        ++x;   // aumenta el valor de x en 1
//        x++;   // Esto también aumenta en 1 el valor de x
        // Nota: Pero el orden sí importa!:
        int y = x++;   // Aquí primero se asigna x a y, i.e. y = 5 y luego se le agrega 1 a x, i.e. x=6
        System.out.println(x);  // imprime 6
        System.out.println(y);  // imprime 5
        /**
         * Si se imprimiera por ejemplo:
         * System.out.println(x++) // primero se imprime x y luego se actualiza x
         * System.out.println(++x) // primero se actualiza x y luego se imprime x actualizada
         */
        /**
         * También se puede hacer como en python:
         * x+=5; // o x = x + 5
         * Esto sirve para la suma, resta, división y multiplicación.
         */

        
        // Finalmente, Java sí sigue la jerarquía de operaciones como debería de ser.
    }
}