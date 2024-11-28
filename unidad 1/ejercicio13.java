import java.util.Scanner;
public class ejercicio13  {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ingrese su nombre");
        String nombre=sc.nextLine();
        System.out.println("ingrese su edad");
        int edad=sc.nextInt();
        System.out.println("ingrese su altura");
        double altura=sc.nextDouble();
        System.out.println("hola señor "+nombre+" su edad es de "+edad+" y su estatura es de "+altura);
    }
}
