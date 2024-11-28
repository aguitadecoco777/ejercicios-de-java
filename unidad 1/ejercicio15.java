import java.util.Scanner;
public class ejercicio15 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese el primer numero");
        int numero1=sc.nextInt();
        System.out.println("Ingrese el segundo numero");
        int numero2=sc.nextInt();
        System.out.println("-----------------------------");
        System.out.println("1 para restar ");
        System.out.println("2 para sumar");
        System.out.println("3 para multiplicar");
        System.out.println("4 para dividir");
        System.out.println("------------------------------");
        System.out.println("Que accion va a realizar");
        int accion=sc.nextInt();
        switch (accion){
            case 1:
            int sumar=numero1+numero2;
            System.out.println(sumar);
            break;
            case 2:
            int restar=numero1-numero2;
            System.out.println(restar);
            break;
            case 3:
            int multiplicar=numero1*numero2;
            System.out.println(multiplicar);
            break;
            case 4:
            double dividir=(double)(numero1/numero2);
            System.out.println(dividir);
            break;
            default:
            System.out.println("Esta accion no se puede realizar");
            break;
        }
    }
}
