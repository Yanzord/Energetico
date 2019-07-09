package br.com.aceleradora.calculaimposto.classes;


import java.util.ArrayList;
import java.util.List;

public class Relatorios {
    List<NotaFiscal> notas = new ArrayList<>();

    public void gerarRelatorio(NotaFiscal nota){
        notas.add(nota);
    }

    public void mostrarRelatorio(){
        double totalImpostos = 0, totalMercadorias = 0, totalGeral = 0;
        for (NotaFiscal i : notas){
            System.out.println("Cliente: " +i.getNomeCliente()+"\nICMS: R$"+i.getIcms()+"; IPI: R$"+i.getIpi()+"; PIS: R$"+i.getPis()+"; COFINS: "+i.getCofins()+"; Total: R$"+i.getTotalNota()+"\n");
            totalImpostos += i.getIcms() + i.getIpi() + i.getPis() + i.getCofins();
            totalMercadorias += i.getQtdEnergetico() * i.getValorEnergetico();
            totalGeral += i.getTotalNota();
        }
        System.out.println("Total Impostos: R$"+totalImpostos+"\nTotal Mercadorias: R$"+totalMercadorias+"\nTotal Geral: R$"+totalGeral);
    }
}
