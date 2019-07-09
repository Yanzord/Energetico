package br.com.aceleradora.calculaimposto.classes;

public class CalculaImposto {
    private Double icms = 0.18;
    private Double ipi = 0.04;
    private Double pis = 0.0186;
    private Double cofins = 0.0854;

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

    public Double calcularIcms(int qtdEnergetico, double valorEnergetico){
        return (qtdEnergetico * valorEnergetico) * this.icms;
    }

    public Double calcularIpi(int qtdEnergetico, double valorEnergetico){
        return (qtdEnergetico * valorEnergetico) * this.ipi;
    }

    public Double calcularPis(int qtdEnergetico, double valorEnergetico){
        return (qtdEnergetico * valorEnergetico) * this.pis;
    }

    public Double calcularCofins(int qtdEnergetico, double valorEnergetico){
        return (qtdEnergetico * valorEnergetico) * this.cofins;
    }
}
