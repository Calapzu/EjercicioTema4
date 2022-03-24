package ejerciciodowhile;

public class EjercicioDoWhile {
    public static void main(String[] args) {
        var numeroDoWhile = 90;
        int contador =0;

        do{

            System.out.println(numeroDoWhile);
            contador = numeroDoWhile++;
        }while (numeroDoWhile == contador );
    }
}
