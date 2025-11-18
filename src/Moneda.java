import com.google.gson.annotations.SerializedName;



public record Moneda(
        @SerializedName("USD") double monedaUsd,
        @SerializedName("ARS") double monedaArs,
        @SerializedName("BRL") double monedaBrl,
        @SerializedName("COP") double monedaCop,
        @SerializedName("CLP") double monedaClp,
        @SerializedName("BOB") double monedaBob,
        @SerializedName("MXN") double monedaMxn){

}
