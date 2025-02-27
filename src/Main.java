public class Main {
    public static void main(String[] args) {
        // Enteros en orden de tamaño en la memoria:
        byte age = 12;
        short n_sh = 123;
        int n_i = 1234;
        long n_l = 12345;
        // Números flotantes en orden de tamaño:
        float n_f = 12.2F; // 12.2f también funciona
        double n_d = 15.66;  // No hace falta poner la f
        // otros:
        boolean idk = false;
        char firstLetter = 'a';
        // Strings:
        String text = "Holabb!";   //= new String("Holabb!")
        //      Cuando no usamos el new String, se les llama strings literales.
        System.out.println("Hola mundo!");
        System.out.println(n_l);
        System.out.println(n_d);
        System.out.println(age);
        System.out.println(idk);
        System.out.println(firstLetter);
        System.out.println(text);
    }
}