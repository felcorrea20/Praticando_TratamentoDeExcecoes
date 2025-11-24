/*
* Desenvolva um programa em Java que permite aos usuários consultar informações sobre um
* usuário do GitHub (utilize a API pública do GitHub para obter os dados).
* Crie uma classe de exceção personalizada, ErroConsultaGitHubException, que estende RuntimeException.
* Lance essa exceção quando o nome de usuário não for encontrado.
* No bloco catch, trate de forma específica essa exceção, exibindo uma mensagem amigável.
*/

package busca;

import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class MainBusca {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("SISTEMA DE BUSCA DE USUARIOS DO GITHUB");
        System.out.print("\nDigite um nome de usuário:");
        String nomeParaBusca = scanner.next();

        String endereco = "https://api.github.com/users/" + nomeParaBusca;


        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .header("Accept", "application/vnd.github.v3+json")
                .build();

        try {
            HttpResponse<String> response = client.send(request , HttpResponse.BodyHandlers.ofString());

            if (response.statusCode() == 404) {
                throw new ErroConsultaGitHubException("Usuário não encontrado no GitHub.");
            }

            String json = response.body();
            System.out.println(json);

        } catch (IOException | InterruptedException e) {
            System.out.println("Opss… Houve um erro durante a consulta à API do GitHub.");
            e.printStackTrace();
        } catch (ErroConsultaGitHubException e) {
            System.out.println(e.getMessage());
        }


    }

}
