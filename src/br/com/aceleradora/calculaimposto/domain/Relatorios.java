package br.com.aceleradora.calculaimposto.domain;


import java.util.ArrayList;
import java.util.List;

public class Relatorios {
    List<NotaFiscal> notas = new ArrayList<>();

    public void gerarRelatorio(NotaFiscal nota){
        notas.add(nota);
    }

    public void mostrarRelatorio(){
        double totalImpostos = 0, totalMercadorias = 0, totalGeral = 0;
        for (NotaFiscal nota : notas){
            if (nota.getDescontoNota() != 0.00){
                System.out.println("Cliente ganhou desconto de 15%!");
                System.out.println("Cliente: " +nota.getNomeCliente()+"\nICMS: R$"+nota.getIcms()+"; IPI: R$"+nota.getIpi()+"; PIS: R$"+nota.getPis()+"; COFINS: "+nota.getCofins()+"; Total com desconto: R$"+nota.getTotalNotaComImposto()+"\n");
            }else {
                System.out.println("Cliente: " +nota.getNomeCliente()+"\nICMS: R$"+nota.getIcms()+"; IPI: R$"+nota.getIpi()+"; PIS: R$"+nota.getPis()+"; COFINS: "+nota.getCofins()+"; Total: R$"+nota.getTotalNotaComImposto()+"\n");
            }

            totalImpostos += nota.getIcms() + nota.getIpi() + nota.getPis() + nota.getCofins();
            totalMercadorias += nota.getTotalNotaSemImposto();
            totalGeral += nota.getTotalNotaComImposto();
        }
        System.out.println("Total Impostos: R$"+totalImpostos+"\nTotal Mercadorias: R$"+totalMercadorias+"\nTotal Geral: R$"+totalGeral);
    }
}
