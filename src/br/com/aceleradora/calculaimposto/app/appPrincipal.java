package br.com.aceleradora.calculaimposto.app;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

import br.com.aceleradora.calculaimposto.classes.NotaFiscal;
import br.com.aceleradora.calculaimposto.classes.CalculaImposto;

public class AppPrincipal {

    public static void main(String[] args) {
        List<NotaFiscal> notas = new ArrayList<>();
        Scanner teclado = new Scanner(System.in);
        CalculaImposto calculaImposto = new CalculaImposto();
        int opcaoInserida = 1, qtdEnergetico;
        String nomeCliente;

        while(opcaoInserida == 1 || opcaoInserida == 2) {
            System.out.println("Bem vindo ao programa x!");
            System.out.println("Digite 1 para inserir uma nota.");
            System.out.println("Digite 2 para ver o relatório de notas inseridas.");
            System.out.println("Digite qualquer outro caractere para sair.");
            System.out.println("Insira a opção desejada:");
            opcaoInserida = teclado.nextInt();

            switch (opcaoInserida) {
                case 1: {
                    System.out.println("Digite o nome do cliente:");
                    nomeCliente = teclado.nextLine();
                    System.out.println("Digite a quantidade de energeticos comprados:");
                    qtdEnergetico = teclado.nextInt();



                }

                case 2: {

                }

                default: {
                    System.exit(0);
                }
            }
        }
    }

}
