class Contenedor {
    int valor;

    public Contenedor(int valor) {
        this.valor = valor;
    }
}

public class ejercicio33 {
    public static void modificarAtributo(Contenedor contenedor) {
        contenedor.valor = 42;
        System.out.println("Dentro del método: " + contenedor.valor);
    }

    public static void main(String[] args) {
        Contenedor contenedorOriginal = new Contenedor(10);
        System.out.println("Antes del método: " + contenedorOriginal.valor);
        modificarAtributo(contenedorOriginal);
        System.out.println("Después del método: " + contenedorOriginal.valor);
    }
}

