public class ejercicio11 {
    public static void main(String[] args) {
        for (int i=1;i<=100;i++){
            int contador=0;
            for (int x=1;x<=i;x++){
                if (i%x==0){
                    contador++;
                }
            }
            if (contador==2){
                System.out.println("es un numero primo");
            }else{
                System.out.println(i);
            }
        }
    }
}
