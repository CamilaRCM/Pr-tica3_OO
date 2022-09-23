package br.com.Poo3;

public class Camarote extends Ingresso {

    private double ValorAdicional;
    private String Localizacao;

    public Camarote(double valorIngresso, double valorAdicional, String localizacao) {
        super(valorIngresso);
        ValorAdicional = valorAdicional;
        this.Localizacao = localizacao;
    }

    public double getValorAdicional() {
        return ValorAdicional;
    }

    public void setValorAdicional(double valorAdicional) {
        ValorAdicional = valorAdicional;
    }

    public String getLocalizacao() {
        return Localizacao;
    }

    public void setLocalizacao(String Localizacao) {
        this.Localizacao = Localizacao;
    }

    public String ImprimirIngressoCamarote() {
        return "Ingresso Camarote: " + (getValorIngresso() + getValorAdicional()) + "\n"+ getLocalizacao();

    }
}