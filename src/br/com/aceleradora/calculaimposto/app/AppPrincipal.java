package br.com.aceleradora.calculaimposto.app;
import java.util.Scanner;

import br.com.aceleradora.calculaimposto.domain.NotaFiscal;
import br.com.aceleradora.calculaimposto.domain.Relatorios;

public class AppPrincipal {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Relatorios relatorios = new Relatorios();
        int qtdEnergetico, opcaoInserida = 1;
        String nomeCliente;

        while(opcaoInserida == 1 || opcaoInserida == 2) {

            System.out.println("Energéticos Accelerator - Calculadora de impostos.");
            System.out.println("Digite 1 para inserir uma nota.");
            System.out.println("Digite 2 para ver o relatório de notas inseridas.");
            System.out.println("Digite qualquer outro numero para sair.");
            System.out.println("Insira a opção desejada:");

            opcaoInserida = teclado.nextInt();

            switch (opcaoInserida) {
                case 1: {

                    System.out.println("\nDigite o nome do cliente:");
                    nomeCliente = teclado.next();

                    System.out.println("Digite a quantidade de energeticos comprados:");
                    qtdEnergetico = teclado.nextInt();

                    NotaFiscal nota = new NotaFiscal(nomeCliente, qtdEnergetico);
                    relatorios.gerarRelatorio(nota);

                    System.out.println("Nota adicionada com sucesso!\n");

                    break;
                }
                case 2: {

                    relatorios.mostrarRelatorio();

                    break;
                }

                default: {
                    break;
                }
            }
        }
    }
}

