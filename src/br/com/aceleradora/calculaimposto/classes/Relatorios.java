package br.com.aceleradora.calculaimposto.classes;


import java.util.ArrayList;
import java.util.List;

public class Relatorios {
    List<NotaFiscal> notas = new ArrayList<>();

    public void gerarRelatorio(NotaFiscal nota){
        notas.add(nota);
    }

    public void mostrarRelatorio(){
        int i;
        for (i = 0; i < notas.size(); i++ ){
            System.out.println(notas.get(i));
        }
    }
}
