import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public interface OpcionMenu {
    static void mostrarConversionFinal(double usdIngresado , double monedaPais) {
        System.out.println("Ingrese monto USD");
        Scanner montoUsdUsuario = new Scanner(System.in);
        double ingresoMontoUsuario = montoUsdUsuario.nextDouble();

        usdIngresado = ingresoMontoUsuario;
        double resultado = usdIngresado * monedaPais;

        NumberFormat nf = NumberFormat.getInstance(new Locale("es","AR"));
        nf.setMaximumFractionDigits(2);
        nf.setMinimumIntegerDigits(2);

        String resultadoOperacion = nf.format(resultado);



        System.out.println((resultadoOperacion)+"$ Pesos\n"+"####################");


    }
}
