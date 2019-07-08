package br.com.aceleradora.calculaimposto.classes;

public class CalculaImposto {
    private Double icms = 0.18;
    private Double ipi = 0.04;
    private Double pis = 0.0186;
    private Double cofins = 0.0854;
    NotaFiscal nota;

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

    public Double calculaIcms(int qtdEnergetico){
        return qtdEnergetico * this.icms;
    }

    public Double calculaIpi(int qtdEnergetico){
        return qtdEnergetico * this.ipi;
    }

    public Double calculaPis(int qtdEnergetico){
        return qtdEnergetico * this.pis;
    }

    public Double calculaCofins(int qtdEnergetico){
        return qtdEnergetico * this.cofins;
    }

    public Double calculaTotalNota(int qtdEnergetico) {
        this.nota = new NotaFiscal();
        return qtdEnergetico * nota.getValorEnergetico() + (nota.getIcms() + nota.getIpi() + nota.getPis() + nota.getCofins());
    }
}
