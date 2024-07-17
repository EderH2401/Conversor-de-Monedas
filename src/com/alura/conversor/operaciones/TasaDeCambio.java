package com.alura.conversor.operaciones;


import com.alura.conversor.modelos.Moneda;
import com.google.gson.Gson;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class TasaDeCambio {
    public Moneda buscarTasa(String divisaBase, String divisaTarget){
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/cf60b0ae1b0ee5f0c75e42ad/pair/"
                +divisaBase+"/"+divisaTarget);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri (direccion)
                .build();

        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Moneda.class);
        } catch (Exception e){
            throw new RuntimeException("No se encontró la moneda especificada");
        }
    }
}
