import  java.util.Scanner;
public class ejercicio4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ingrese la cantidad de camisas");
        int cantidadShirt=sc.nextInt();
        final int PRECIO_SHIRT=25;
        final int PRECIO_PANTALON=30;
        if (cantidadShirt==1){
            double descuento=0.85;
            double precioTotal=(double)(descuento)*(PRECIO_SHIRT+PRECIO_PANTALON);
            System.out.println("el precio total es de "+precioTotal);
        }else if(cantidadShirt==2) {
            double descuentoShirt=0.80;
            double descuentoPantalon=0.85;
            double precioTotal=(double)(descuentoShirt*PRECIO_SHIRT)+(descuentoPantalon*PRECIO_PANTALON);
            System.out.println("el precio total es de "+precioTotal);
        }
    }
}
