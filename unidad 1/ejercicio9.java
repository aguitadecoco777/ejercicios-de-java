public class ejercicio9 {
    public static void main(String[] args) {
        long numeroFibo=0;
        long numeroAnterior;
        long numeroInicial=1;
        for (int i=1;i<=50;i++){
            System.out.print(numeroFibo+",");
            numeroAnterior=numeroInicial;
            numeroInicial=numeroFibo;
            numeroFibo=numeroAnterior+numeroInicial;
        }
    }
}
