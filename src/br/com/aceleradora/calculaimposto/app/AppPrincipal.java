package br.com.aceleradora.calculaimposto.app;
import java.io.IOException;
import java.util.Scanner;

import br.com.aceleradora.calculaimposto.classes.NotaFiscal;
import br.com.aceleradora.calculaimposto.classes.Relatorios;

public class AppPrincipal {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Relatorios relatorios = new Relatorios();
        int qtdEnergetico, opcaoInserida = 1;
        String nomeCliente;

        while(opcaoInserida == 1 || opcaoInserida == 2) {

            //limparTela();

            System.out.println("Bem vindo ao programa x!");
            System.out.println("Digite 1 para inserir uma nota.");
            System.out.println("Digite 2 para ver o relatório de notas inseridas.");
            System.out.println("Digite qualquer outro numero para sair.");
            System.out.println("Insira a opção desejada:");

            opcaoInserida = teclado.nextInt();

            switch (opcaoInserida) {
                case 1: {
                    //limparTela();

                    System.out.println("Digite o nome do cliente:");
                    nomeCliente = teclado.next();

                    System.out.println("Digite a quantidade de energeticos comprados:");
                    qtdEnergetico = teclado.nextInt();

                    NotaFiscal nota = new NotaFiscal(nomeCliente, qtdEnergetico);
                    relatorios.gerarRelatorio(nota);

                    //limparTela();

                    System.out.println("Nota adicionada com sucesso!");

                    break;
                }
                case 2: {

                    //limparTela();

                    relatorios.mostrarRelatorio();

                    break;
                }

                default: {
                    break;
                }
            }
        }
    }

    /*public static void limparTela() throws IOException {
        if (System.getProperty("os.name").contains("Windows")) {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } else {
            Runtime.getRuntime().exec("clear");
        }

    }*/
}

