package br.com.aceleradora.calculaimposto.classes;

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
    private Double percentualDesconto = 0.15;
    private Double descontoNota = 0.00;

    public NotaFiscal (String nomeCliente, int qtdEnergetico){
        this.calculaImposto = new CalculaImposto();
        this.nomeCliente = nomeCliente;
        this.qtdEnergetico = qtdEnergetico;

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
        return totalNotaComImposto;
    }

    public Double getTotalNotaComImposto() {
        return totalNotaComImposto;
    }

    public Double getDescontoNota() {
        return descontoNota;
    }

    public void calcularValoresNota(){
        if (this.qtdEnergetico >= 400){
            this.descontoNota = calcularDesconto();
            this.totalNotaSemImposto = calcularTotalNotaSemImposto() - this.descontoNota;
            this.icms = calculaImposto.calcularIcms(this.totalNotaSemImposto);
            this.ipi = calculaImposto.calcularIpi(this.totalNotaSemImposto);
            this.pis = calculaImposto.calcularPis(this.totalNotaSemImposto);
            this.cofins = calculaImposto.calcularCofins(this.totalNotaSemImposto);
            this.totalNotaComImposto = calcularTotalNotaComImposto();
        }else {
            this.totalNotaSemImposto = calcularTotalNotaSemImposto();
            this.icms = calculaImposto.calcularIcms(this.totalNotaSemImposto);
            this.ipi = calculaImposto.calcularIpi(this.totalNotaSemImposto);
            this.pis = calculaImposto.calcularPis(this.totalNotaSemImposto);
            this.cofins = calculaImposto.calcularCofins(this.totalNotaSemImposto);
            this.totalNotaComImposto = calcularTotalNotaComImposto();
        }
    }

    public Double calcularDesconto(){
        return this.qtdEnergetico * this.valorEnergetico * this.percentualDesconto;
    }

    public Double calcularTotalNotaSemImposto(){
        return this.qtdEnergetico * this.valorEnergetico;
    }

    public Double calcularTotalNotaComImposto() {
        return this.totalNotaSemImposto + (this.icms + this.ipi + this.pis + this.cofins);
    }
}
