import java.util.Scanner;
public class ejercicio16 {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Ingrese un número: ");
            int numero = sc.nextInt();
            int factorial = 1;
            int i = 1;
            while (i <= numero) {
                factorial *= i;
                i++;
            System.out.println("El factorial de " + numero + " es: " + factorial);
        }
    }
}