public class ejercicio28 {
    public static void modificarArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] *= 2;
        }
        System.out.println("Dentro del método: " + java.util.Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 5};
        System.out.println("Antes  " + java.util.Arrays.toString(num));
        modificarArray(num);
        System.out.println("Después  " + java.util.Arrays.toString(num));
    }
}
