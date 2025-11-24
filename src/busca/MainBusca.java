/*
* Desenvolva um programa em Java que permite aos usuários consultar informações sobre um
* usuário do GitHub (utilize a API pública do GitHub para obter os dados).
* Crie uma classe de exceção personalizada, ErroConsultaGitHubException, que estende RuntimeException.
* Lance essa exceção quando o nome de usuário não for encontrado.
* No bloco catch, trate de forma específica essa exceção, exibindo uma mensagem amigável.
*/

package busca;

import java.util.Scanner;

public class MainBusca {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("SISTEMA DE BUSCA DE USUARIOS DO GITHUB");
        System.out.print("\nDigite um nome de usuário:");
        String nomeParaBusca = scanner.next();



    }

}
