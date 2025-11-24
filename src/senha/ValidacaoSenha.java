package senha;

public class ValidacaoSenha {

    public void ValidaSenhaDigitada(String senha) {

        String mensagemDeErro = "";

        if (senha.length() < 8) {
            mensagemDeErro += "A senha deve conter, no mínimo, 8 caracteres!\n";
        }

        if (senha.contains(" ")) {
            mensagemDeErro += "A senha não pode conter espaços!\n";
        }

        if (!senha.matches(".*[A-Z].*")) {
            mensagemDeErro += "A senha deve conter letra maiúscula!\n";
        }

        if (!senha.matches(".*[0-9].*")) {
            mensagemDeErro += "A senha deve conter número!\n";
        }

        if (!senha.matches(".*[!@#$%¨&*-+].*")) {
            mensagemDeErro += "A senha deve conter caracter especial!\n";
        }

        if (!mensagemDeErro.isEmpty()) {
            throw new SenhaInvalidaException(mensagemDeErro);
        }

    }

}
