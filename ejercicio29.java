public class ejercicio29 {
    public static String modificarCadena(String texto) {
        texto = texto + " XD";
        System.out.println("Dentro del método " + texto);
        return texto;
    }

    public static void main(String[] args) {
        String textoOriginal = "No se q poner";
        System.out.println("Antes " + textoOriginal);
        textoOriginal=modificarCadena(textoOriginal);
        System.out.println("Después  " + textoOriginal);  
}

}
