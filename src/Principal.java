
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner respuestaUsuario = new Scanner(System.in);

        ConversorAPI conversorAPI = new ConversorAPI();
        Moneda monedas = conversorAPI.consultaMoneda();

        int opcionUsuario = -1; //Inicializamos con un valor distinto de 0

        while (opcionUsuario != 0) {

            System.out.println("\n💱 Conversor de Monedas\n" +
                    "💵➡️💰 Opción 1.- USD a ARS\n" +
                    "💵➡️💰 Opción 2.- USD a BOB\n" +
                    "💵➡️💰 Opción 3.- USD a CLP\n" +
                    "💵➡️💰 Opción 4.- USD a BRL\n" +
                    "💵➡️💰 Opción 5.- USD a COP\n" +
                    "❌ Opción 0.- Salir\n");



            System.out.print("Seleccione una opción: ");
            opcionUsuario = respuestaUsuario.nextInt();

            try {


                switch (opcionUsuario) {
                    case 1:
                        OpcionMenu.mostrarConversionFinal(monedas.monedaUsd(), monedas.monedaArs());
                        break;
                    case 2:
                        OpcionMenu.mostrarConversionFinal(monedas.monedaUsd(), monedas.monedaBob());
                        break;
                    case 3:
                        OpcionMenu.mostrarConversionFinal(monedas.monedaUsd(), monedas.monedaClp());
                        break;
                    case 4:
                        OpcionMenu.mostrarConversionFinal(monedas.monedaUsd(), monedas.monedaBrl());
                        break;
                    case 5:
                        OpcionMenu.mostrarConversionFinal(monedas.monedaUsd(), monedas.monedaCop());
                        break;
                    case 6:
                        OpcionMenu.mostrarConversionFinal(monedas.monedaUsd(), monedas.monedaMxn());
                    case 0:
                        System.out.println("Saliendo del programa...");
                        break;


                    default:
                        System.out.println("Opcion no valida");
                }

            } catch (RuntimeException e) {
                System.out.println("No se pudo iniciar");
            }
        }
    }
}











