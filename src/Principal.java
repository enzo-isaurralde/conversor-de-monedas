import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Principal {
    static void main(String[] args) {

            System.out.println("Conversor de Monedas\n" +
                "Opcion 1.- USD a ARS\n" +
                "Opcion 2.- USD a BOB\n" +
                "Opcion 3.- USD a CHP\n" +
                "Opcion 4.- USD a BRL\n" +
                "Opcion 5.- USD a COP\n");

            Scanner respuestaUsuario = new Scanner(System.in);

            int opcionUsuario = respuestaUsuario.nextInt();

            ConversorAPI consulta = new ConversorAPI();



            switch (opcionUsuario){
                case 1:
                try {

                    Moneda moneda = consulta.consultaMoneda();

                    System.out.println("Ingrese monto USD");

                    Scanner montoUsd = new Scanner(System.in);

                    double ingresoUsd = montoUsd.nextDouble();

                    CalculadoraMoneda.resultadoCalculo(ingresoUsd, moneda.monedaArs());


                } catch (NullPointerException e){
                    System.out.println("no se pudo realizar el calculo");
                    break;
                } case 2:
                    Moneda moneda = consulta.consultaMoneda();

                    System.out.println("Ingrese monto USD");

                    Scanner montoUsd = new Scanner(System.in);

                    double ingresoUsd = montoUsd.nextDouble();


                    CalculadoraMoneda.resultadoCalculo(ingresoUsd, moneda.monedaBob());
                    break;

                }



            }




        }



