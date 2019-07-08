package br.com.aceleradora.calculaimposto.classes;

public class NotaFiscal {
    private String nomeCliente;
    private int qtdEnergetico;
    private Double valorEnergetico = 4.50;
    private Double icms;
    private Double ipi;
    private Double pis;
    private Double cofins;
    private Double totalNota;
    CalculaImposto calculaImposto;

    public NotaFiscal (String nomeCliente, int qtdEnergetico){
        this.calculaImposto = new CalculaImposto();
        this.nomeCliente = nomeCliente;
        this.qtdEnergetico = qtdEnergetico;
        this.icms = calculaImposto.calculaIcms(qtdEnergetico);
        this.ipi = calculaImposto.calculaIpi(qtdEnergetico);
        this.pis = calculaImposto.calculaPis(qtdEnergetico);
        this.cofins = calculaImposto.calculaCofins(qtdEnergetico);
        this.totalNota = calculaImposto.calculaTotalNota(qtdEnergetico);
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public int getQtdEnergetico() {
        return qtdEnergetico;
    }

    public Double getValorEnergetico() {
        return valorEnergetico;
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

    public Double getTotalNota() {
        return totalNota;
    }

    // calcularTotalNota
}
