package br.com.Poo3;

public class Normal extends Ingresso {

    public Normal(Double valorIngresso) {
        super(valorIngresso);
    }

    public String ImprimirIngresso(){
        return "ingresso normal " + getValorIngresso();
    }
}
