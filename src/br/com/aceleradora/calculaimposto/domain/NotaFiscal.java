package br.com.aceleradora.calculaimposto.domain;

public class NotaFiscal {
    private String nomeCliente;
    private int qtdEnergetico;
    private Double valorEnergetico = 4.50;
    private Double icms;
    private Double ipi;
    private Double pis;
    private Double cofins;
    private Double totalNotaSemImposto;
    private Double totalNotaComImposto;
    private CalculaImposto calculaImposto;
    private Double descontoNota = 0.00;

    public NotaFiscal (String nomeCliente, int qtdEnergetico){
        calculaImposto = new CalculaImposto();
        this.nomeCliente = nomeCliente;
        this.qtdEnergetico = qtdEnergetico;
        descontoNota = calcularDesconto();
        calcularValoresNota();
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public Double getIcms() {
        return icms;
    }

    public Double getIpi() {
        return ipi;
    }

    public Double getPis() {
        return pis;
    }

    public Double getCofins() {
        return cofins;
    }

    public Double getTotalNotaSemImposto() {
        return totalNotaSemImposto;
    }

    public Double getTotalNotaComImposto() {
        return totalNotaComImposto;
    }

    public Double getDescontoNota() {
        return descontoNota;
    }

    public void calcularValoresNota(){
        totalNotaSemImposto = calcularTotalNotaSemImposto();
        icms = calculaImposto.calcularIcms(totalNotaSemImposto);
        ipi = calculaImposto.calcularIpi(totalNotaSemImposto);
        pis = calculaImposto.calcularPis(totalNotaSemImposto);
        cofins = calculaImposto.calcularCofins(totalNotaSemImposto);
        totalNotaComImposto = calcularTotalNotaComImposto();
    }

    public Double calcularDesconto(){
        if (qtdEnergetico >= 400){
            Double percentualDesconto = 0.15;
            return qtdEnergetico * valorEnergetico * percentualDesconto;
        }
        return 0.00;
    }

    public Double calcularTotalNotaSemImposto(){
        return (qtdEnergetico * valorEnergetico) - descontoNota;
    }

    public Double calcularTotalNotaComImposto() {
        return totalNotaSemImposto + (icms + ipi + pis + cofins);
    }
}
