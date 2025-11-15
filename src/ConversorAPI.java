import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConversorAPI {

    public Moneda consultaMoneda() {

        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/db52e00a4a709de90a9dcaa5/latest/USD");

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();
        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());


            return new Gson().fromJson(response.body(), Root.class).conversion_rates();


        }catch (Exception e){
            throw new RuntimeException("No se pudo convertir");
        }
    }
}
