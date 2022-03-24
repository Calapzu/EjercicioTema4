package ejercicioswitch;

import java.util.Locale;

public class EjercicioSwitch {
    public static void main(String[] args) {
        var estacion = "VERANO";
        switch (estacion){
            case "INVIERNO":
                System.out.println("INVIERNO");
            break;
            case "VERANO":
                System.out.println("VERANO");
                break;
            case "OTOÑO":
                System.out.println("OTOÑO");
                break;
            case"PRIMAVERA":
                System.out.println("PRIMAVERA");
                break;
            default:
                System.out.println("No es una estacion");
        }
    }
}
