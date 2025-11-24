/*
 * Crie um programa simples que solicita dois números ao usuário e realiza a divisão do primeiro pelo segundo.
 *  Utilize o bloco try/catch para tratar a exceção que pode ocorrer caso o usuário informe 0 como divisor.
 */

package divisao;

import java.util.Scanner;

public class DivisorDeNumeros {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("SISTEMA DE DIVISAO DE NUMEROS");

        System.out.print("\nDigite o numerador: ");
        int numerador = scanner.nextInt();

        System.out.print("Digite o denominador: ");
        int denominador = scanner.nextInt();

        try {
            int resultado = ( numerador / denominador );

            System.out.println("Resultado da operação: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Aconteceu um erro ao tentar fazer uma divisão por zero...");
        }


    }

}
