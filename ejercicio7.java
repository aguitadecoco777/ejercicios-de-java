import java.util.Scanner;
public class ejercicio7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ingrese el primer numero");
        int numero_1=sc.nextInt();
        System.out.println("Ingrese el segundo numero");
        int numero_2=sc.nextInt();
        System.out.println("Ingrese el tercer numero");
        int numero_3=sc.nextInt();
        if (numero_1>numero_2 && numero_1>numero_3){
            System.out.println("El primer numero es el mayor ");
        }else if (numero_2>numero_1 && numero_2>numero_3){
            System.out.println("El segundo numero es el mayor");
        }else if (numero_3>numero_1 && numero_3>numero_2){
            System.out.println("El tercer numero es el mayor");
        }
    }
}
