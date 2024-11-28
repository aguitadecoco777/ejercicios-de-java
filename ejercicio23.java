import java.util.Scanner;
public class ejercicio23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el lado A:");
        int ladoA = sc.nextInt();
        System.out.println("Introduce el lado B:");
        int ladoB = sc.nextInt();
        System.out.println("Introduce el lado C:");
        int ladoC = sc.nextInt();
        
        if (ladoA == ladoB && ladoB == ladoC) {
            System.out.println("El triángulo es equilátero.");
        } else if (ladoA == ladoB || ladoA == ladoC || ladoB == ladoC) {
            System.out.println("El triángulo es isósceles.");
        } else {
            System.out.println("El triángulo es escaleno.");
        }
    }
}

