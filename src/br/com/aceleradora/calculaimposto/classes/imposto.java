package br.com.aceleradora.calculaimposto.classes;

public class imposto {
    private Double icms = 0.18;
    private Double ipi = 0.04;
    private Double pis = 0.186;
    private Double cofins = 0.854;


    public Double getIcms() {
        return icms;
    }

    public void setIcms(Double icms) {
        this.icms = icms;
    }

    public Double getIpi() {
        return ipi;
    }

    public void setIpi(Double ipi) {
        this.ipi = ipi;
    }

    public Double getPis() {
        return pis;
    }

    public void setPis(Double pis) {
        this.pis = pis;
    }

    public Double getCofins() {
        return cofins;
    }

    public void setCofins(Double cofins) {
        this.cofins = cofins;
    }
}
