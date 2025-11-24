/*
* Crie um programa que lê uma senha do usuário.
* Utilize o bloco try/catch para capturar a exceção SenhaInvalidaException, uma classe de exceção personalizada
* que deve ser lançada caso a senha não atenda a critérios específicos (por exemplo, ter pelo menos 8 caracteres).
* Crie um programa que lê uma senha do usuário. Utilize o bloco try/catch para capturar
* a exceção SenhaInvalidaException, uma classe de exceção personalizada que deve ser lançada caso a
* senha não atenda a critérios específicos (por exemplo, ter pelo menos 8 caracteres).
*/

package senha;

import java.util.Scanner;

public class MainSenha {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String requisitosSenha = """
                                  A senha deve conter: 
                                  - No mínimo 8 caracteres;   
                                  - A senha não pode conter espaços;
                                  - Uma letra maiúscula; 
                                  - Um caracter especial; 
                                  - Um número; 
                                  """;

        System.out.println(requisitosSenha);

        try {
            System.out.print("Senha: ");
            String senha = scanner.nextLine();

            new ValidacaoSenha().ValidaSenhaDigitada(senha);
            System.out.println("Senha validada com sucesso!");

        } catch (SenhaInvalidaException e) {
            System.out.println(e.getMessage());
        }

    }

}
