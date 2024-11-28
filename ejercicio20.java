import java.util.Scanner;
public class ejercicio20 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el tamaño del array:");
        int tamaño = sc.nextInt();
        int[] array = new int[tamaño];
        System.out.println("Introduce los elementos del array:");
        for (int i = 0; i < tamaño; i++) {
            array[i] = sc.nextInt();
        }
        int mayor = array[0];
        int menor = array[0];
        for (int i = 1; i < tamaño; i++) {
            if (array[i] > mayor) {
                mayor = array[i];
            }
            if (array[i] < menor) {
                menor = array[i];
            }
        }
        System.out.println("El número mayor es: " + mayor);
        System.out.println("El número menor es: " + menor);
        sc.close();
    }
}

