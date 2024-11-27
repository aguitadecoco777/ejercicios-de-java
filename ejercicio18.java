import java.util.Scanner;

public class ejercicio18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[5];
        int acumulador = 0;
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Ingresa un número: ");
            numeros[i] = sc.nextInt();
            acumulador += numeros[i]; 
        }
        double promedio = acumulador / (double) numeros.length;
        System.out.println("El promedio es: " + promedio);
    }
}
