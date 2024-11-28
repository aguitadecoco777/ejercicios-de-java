public class ejercicio14 {
    public static void main(String[] args) {
        final int NUMERO=100;
        int contador=0;
        for (int i=1;i<=NUMERO;i++){
            if (i%2==0){
                contador++;
            }
        }
        System.out.println("la cantidad de pares en los cien primeros numeros es de "+contador);
    }
}
