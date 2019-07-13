package br.com.aceleradora.calculaimposto.classes;

public class CalculaImposto {
    private Double icms = 0.18;
    private Double ipi = 0.04;
    private Double pis = 0.0186;
    private Double cofins = 0.0854;

    public Double calcularIcms(Double totalNotaSemImposto){
        return totalNotaSemImposto * icms;
    }

    public Double calcularIpi(Double totalNotaSemImposto){
        return totalNotaSemImposto * ipi;
    }

    public Double calcularPis(Double totalNotaSemImposto){
        return totalNotaSemImposto * pis;
    }

    public Double calcularCofins(Double totalNotaSemImposto){
        return totalNotaSemImposto * cofins;
    }
}
