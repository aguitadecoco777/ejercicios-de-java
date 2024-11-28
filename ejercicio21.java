import java.util.Scanner;

public class ejercicio21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el tamaño del array:");
        int tamaño = sc.nextInt();
        int[] array = new int[tamaño];

        System.out.println("Introduce los elementos del array:");
        for (int i = 0; i < tamaño; i++) {
            array[i] = sc.nextInt();
        }

        System.out.println("Array invertido:");
        for (int i = tamaño - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }
}
