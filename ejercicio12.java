import java.util.Scanner;
public class ejercicio12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("-----------------------------------------");
        System.out.println("1 parar hallar el area de un triangulo");
        System.out.println("2 para hallar el area de un cuadrado");
        System.out.println("3 para hallar el area de un rectangulo");
        System.out.println("------------------------------------------");
        System.out.println("ingrese el numero de la accion que desea realizar");
        int numeroAccion=sc.nextInt();
        switch (numeroAccion){
            case 1:
            System.out.println("ingrese el valor de la base del triangulo");
            int baseTriangulo=sc.nextInt();
            System.out.println("ingrese el valor de la altura del triangulo");
            int alturaTriangulo=sc.nextInt();
            double areaTriangulo=(baseTriangulo*alturaTriangulo)/2;
            System.out.println("el area de triangulo es de "+areaTriangulo);
            break;
            case 2:
            System.out.println("ingrese el valor del lado del cuadrado");
            int ladoCuadrado=sc.nextInt();
            int areaCuadrado=ladoCuadrado*ladoCuadrado;
            System.out.println("el area del cuadrado es "+areaCuadrado);
            break;
            case 3:
            System.out.println("ingrese el valor de la base del rectangulo");
            int baseRectangulo=sc.nextInt();
            System.out.println("ingrese el valor de la altura del rectangulo");
            int alturaRectangulo=sc.nextInt();
            int areaRectangulo=baseRectangulo*alturaRectangulo;
            System.out.println("el area del rectangulo es "+areaRectangulo);
            break;
            default:
            System.out.println("no escojio una de las opciones disponibles");
            break;
        }
    }
}
