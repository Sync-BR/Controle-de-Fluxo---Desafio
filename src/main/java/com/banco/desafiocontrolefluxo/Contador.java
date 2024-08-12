package com.banco.desafiocontrolefluxo;

import java.util.Scanner;

/**
 *
 * @author Eduar
 */
public class Contador {

    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int parametroDois = terminal.nextInt();

        try {
            contar(parametroUm, parametroDois);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        //validar se parametroUm é MAIOR que parametroDois e lançar a exceção
        if(parametroUm > parametroDois){
            throw new ParametrosInvalidosException("Segundo parametro deve ser maior que o primeiro");
        }
        int contagem = parametroDois - parametroUm;
        for(int index = 0; index <= contagem; index++){
            System.out.println("Imprimindo número: " +index);
        }
    }
}
