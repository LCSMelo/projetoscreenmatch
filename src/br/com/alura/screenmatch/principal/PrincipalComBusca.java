package br.com.alura.screenmatch.principal;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class PrincipalComBusca {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner leitura  = new Scanner(System.in);
        System.out.println("Digite um livro para busca: ");
        var busca = leitura.nextLine();

//        String endereco = "https://www.googleapis.com/books/v1/volumes?q=intitle:" + busca + "&key=" + "&apikey=AIzaSyDK-JhGWQjfbbN6m2kTCg8XHOE3X9mNVdI";
        String endereco = "https://api.coingecko.com/api/v3/ping";


        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());
    }
}
