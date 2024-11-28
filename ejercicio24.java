import java.util.Scanner;
public class ejercicio24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un año:");
        int año = sc.nextInt();
        boolean esBisiesto = (año % 4 == 0 && año % 100 != 0) || (año % 400 == 0);
        if (esBisiesto) {
            System.out.println("El año " + año + " es bisiesto.");
        } else {
            System.out.println("El año " + año + " no es bisiesto.");
        }
    }
}