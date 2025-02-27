import java.sql.SQLOutput;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numeros = new int[5];  // Aquí el 5 indica la dimensión del array.
        numeros[0] = 1;
        numeros[4] = 8;
        // Nota la dimensión es fija en Arrays, los variables en tamaño son las colecciones.
        System.out.println(numeros);  // Esto muestra una dirección en memoria.
        System.out.println(Arrays.toString(numeros));  // Este muestra la lista como tal
        System.out.println(numeros.length);  // Este muestra la longitud del array
        Arrays.sort(numeros); // Ordena los números de menor a mayor.
        // Nota: sort sí modifica el array original. Sí son mutables en sus valores.
        // int[] sorted_array = Arrays.sort(numeros); <--- Esto devuelve void en sorted_array (no regresa nada).
        System.out.println(Arrays.toString(numeros));  // Imprimimos los números ordenados.
//      Para indicar la lista como tal al definirla, se hace esto:
        int[] numeros2 = {0,1,2,3,4};
//        numeros2[9] = 6; // Esto arroja un error. Porque se sale de los límites.
        System.out.println(Arrays.toString(numeros2));
    }
}