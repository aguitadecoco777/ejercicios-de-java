public class ejercicio26 {
        public static int incrementar(int x) {
            x += 1;
            System.out.println(x);
            return x;
        }
        public static void main(String[] args) {
            int x = 5;
            System.out.println("Antes " + x);
            x = incrementar(x);  
            System.out.println("Después " + x);
        }
    }
