import java.util.Scanner;
public class ejercicio6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ingrese el primer numero");
        int numero_1=sc.nextInt();
        System.out.println("Ingrese el segundo numero");
        int numero_2=sc.nextInt();
        System.out.println("Ingrese el tercer numero");
        int numero_3=sc.nextInt();
        if (numero_1>numero_2 && numero_1<numero_3){
            System.out.println("el primer numero es mayor que el segundo y menor que el tercero");
        }else {
            System.out.println("No cumple con la condicion");
        }
    }
}
