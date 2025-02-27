import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        String text = "Hola Mundo!";
        // Nota: Los Strings son inmutables!

        int largo = text.length(); // Metodo del largo del string
        System.out.println(largo);

        String texto = text.replace("Hola", "Chao");
        System.out.println(texto);

        System.out.println(texto.endsWith("undo!"));
        System.out.println(texto.startsWith("Ch"));
        System.out.println(texto.contains("und"));
        System.out.println(texto.indexOf("Mund"));  // Regresa el índice en el que empieza el argumneto. Regresa -1 si no lo encuentra

        System.out.println(texto.toUpperCase());
        System.out.println(texto.toLowerCase());

        String malo = "   they're not like us   ";
        System.out.println(malo);
        System.out.println(malo.trim());   // Elimina los espacios en blanco al inicio y al final.
    }
}