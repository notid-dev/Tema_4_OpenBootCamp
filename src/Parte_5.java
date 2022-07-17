public class Parte_5 {
    public static void main(String[] args) {
        var estacion = "Verano";

        switch (estacion){
            case "Verano":
                System.out.println("Es Verano");
                break;
            case "Invierno":
                System.out.println("Es Invierno");
                break;
            case "Otono":
                System.out.println("Es Otono");
                break;
            case "Primavera":
                System.out.println("Es Primavera");
                break;

            default:
                System.out.println("No es una estacion");
        }

    }
}
