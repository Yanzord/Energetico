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

    public Nota (String nomeCliente, int qtdEnergetico) {
        this.nomeCliente = nomeCliente;
        this.qtdEnergetico = qtdEnergetico;
        this.icms = calculaIcms(qtdEnergetico);
        this.ipi = calculaIpi(qtdEnergetico);
        this.pis = calculaPis(qtdEnergetico);
        this.cofins = calculaCofins(qtdEnergetico);
        this totalNota = calculaTotalNota();
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public int getQtdEnergetico() {
        return qtdEnergetico;
    }

    public void setQtdEnergetico(int qtdEnergetico) {
        this.qtdEnergetico = qtdEnergetico;
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
}
