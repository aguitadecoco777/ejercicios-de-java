import java.util.Scanner;
public class ejercicio3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ingrese el primer dijito");
        int numero_1=sc.nextInt();
        System.out.println("ingrese el segundo dijito");
        int numero_2=sc.nextInt();
        System.out.println("ingrese el tercer dijito");
        int numero_3=sc.nextInt();
        double media=(double)(numero_1+numero_2+numero_3)/3;
        System.out.println("la media de los tres numeros es de "+media);
    }
}
