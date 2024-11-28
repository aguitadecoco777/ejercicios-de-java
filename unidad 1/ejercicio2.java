import java.util.Scanner;
public class ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese dos numeros para operar");
        System.out.println("ingrese el primer numero");
        int numero_1=sc.nextInt();
        System.out.println("escriba el segundo numero");
        int numero_2=sc.nextInt();
        int suma=numero_1+numero_2;
        int resta=numero_1-numero_2;
        int multiplicacion=numero_1*numero_2;
        double division=(double)numero_1/numero_2;
        double modulo=(double)numero_1%numero_2;
        System.out.println("la suma es de "+suma);
        System.out.println("la resta es de "+resta);
        System.out.println("la multiplicscion es de "+multiplicacion);
        System.out.println("la division es de "+division);
        System.out.println("el modulo es de "+modulo);
    }
}
