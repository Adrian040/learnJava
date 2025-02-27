import java.sql.SQLOutput;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String empresa = "Hola mundo BBB";
        empresa = "Hola mundo bb"; // Se actualiza el string empresa.
        System.out.println(empresa);

        final String empresa2 = "Hola mundo LL"; // Este es constante, ya no se puede actualizar más adelante.
//        empresa2 = "Hola mundo ll"; // Esto arrojaría un error.
        System.out.println(empresa2);
    }
}