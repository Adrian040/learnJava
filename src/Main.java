import java.sql.SQLOutput;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] numeros2 = {{0,1},{2,3}};  // array de dos dimensiones definiendo explícitamente.
        System.out.println(Arrays.deepToString(numeros2));  // Esto muestra el array
        int[][][] numeros3 = new int[3][2][2]; // Array de tres dims definiéndolo como de ceros y luego reemplazando algunos de sus valores a continuación:
        numeros3[0][0][0] = 5;
        numeros3[2][1][1] = 10;
        System.out.println(Arrays.deepToString(numeros3));
    }
}