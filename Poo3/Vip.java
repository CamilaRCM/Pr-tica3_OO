package br.com.Poo3;

public class Vip extends Ingresso{

    private double valorAdicional;

    public double getValorAdicional() {
        return valorAdicional;
    }

    public void setValorAdicional(double valorAdicional) {
        this.valorAdicional = valorAdicional;
    }

    public Vip(Double valorIngresso, double valorAdicional) {
        super(valorIngresso);
        this.valorAdicional = valorAdicional;

    }

    public String ImprimeIngressoVip (){
        return "ingressoVip: " + (getValorIngresso()+getValorAdicional());
    }
}
