
    class Punto {
        int x, y;
    
        public Punto(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
        public class ejercicio32 {
            public static void modificarReferencia(Punto punto) {
            punto = new Punto(5, 5);
            System.out.println("Dentro del método: (" + punto.x + ", " + punto.y + ")");
        }
    
        public static void main(String[] args) {
            Punto puntoOriginal = new Punto(1, 1);
            System.out.println("Antes del método: (" + puntoOriginal.x + ", " + puntoOriginal.y + ")");
            modificarReferencia(puntoOriginal);
            System.out.println("Después del método: (" + puntoOriginal.x + ", " + puntoOriginal.y + ")");
        }
    }
