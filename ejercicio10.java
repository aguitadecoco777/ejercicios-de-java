import java.util.Scanner;
public class ejercicio10 {
    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("ingrese el numero a validar");
            int numero=sc.nextInt();
            int contador=0;
            for (int i=0;i<numero;i++){
                if (i%2!=0){
                    contador++;
                }
            }
            System.out.println("hay un todal de "+contador+" impares");
        }
}
