/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pratica6ex8;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Pratica6Ex8 {

    /*
    8.	Crie um jogo para o usuário descobrir um número sorteado de 1 a 100. A cada tentativa dele, 
    forneça uma dica falando se o número é maior ou menor. Quando ele descobrir exiba uma mensagem de parabéns e apresente em 
    quantas tentativas ele conseguiu.
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int tentativa = 0, cont = 0;
        int numero = (int)(Math.random()*100);
        while(tentativa != numero || cont == 0) {
            System.out.println("Digité um número de 0 a 100: ");
            tentativa = entrada.nextInt();
            if (numero < tentativa) {
                System.out.println("O número é menor que: "+tentativa);
            }
            if (numero > tentativa) {
                System.out.println("O número é maior que: "+tentativa);
            }
            cont++;
        }
        if (tentativa == numero) {
            System.out.println("Parabéns você acertou !! e sua quantidade de tentativas foram: " +cont+ " tentativas");
        }
    }
}
