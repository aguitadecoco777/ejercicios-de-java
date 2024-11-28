import java.util.Scanner;
public class ejercicio22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número entero");
        int num = sc.nextInt();
        int contador = 0;
        while (num != 0) {
            num /= 10;
            contador++;
        }
        System.out.println("El número de dígitos es" + contador);
    }
}

