import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public interface CalculadoraMoneda {
    static void resultadoCalculo(double montoUSD, double monedaConvertida ) {

        double resultadoCalculo = montoUSD * monedaConvertida;

        NumberFormat nf = NumberFormat.getInstance(new Locale("es","AR"));

        String resultado = nf.format(resultadoCalculo);

        System.out.println(resultado + "$");



    }
}

