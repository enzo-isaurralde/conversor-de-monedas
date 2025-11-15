import com.google.gson.annotations.SerializedName;

import java.math.BigDecimal;

public record Moneda(
        @SerializedName("USD") double monedaUsd,
        @SerializedName("ARS") double monedaArs,
        @SerializedName("BRL") double monedaBrl,
        @SerializedName("COP") double monedaCop,
        @SerializedName("CLP") double monedaClp,
        @SerializedName("BOB") double monedaBob) {
}
