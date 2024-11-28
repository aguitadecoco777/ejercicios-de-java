public class ejercicio27 {
    public static void intercambiar(int a, int b) {
        int tempA = a;
        a = b;
        b = tempA;
        System.out.println("Dentro del método: a = " + a + ", b = " + b);
    }

    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        System.out.println("Antes  a = " + a + ", b = " + b);
        intercambiar(a, b);
        System.out.println("Después  a = " + a + ", b = " + b);
    }
}
