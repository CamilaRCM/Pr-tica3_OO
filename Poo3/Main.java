package br.com.Poo3;
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        double valor;
        double valorAdicional;
        String localizacao;


        int opcao = Integer.parseInt(JOptionPane.showInputDialog("<1> Ingresso Normal\n<2>Ingresso vip\n<3>Ingresso Camarote \n<4>Sair"));

        do {

            switch (opcao) {
                case 1:
                    valor = Double.parseDouble(JOptionPane.showInputDialog("Valor do ingresso: "));
                    Normal ingressoNormal = new Normal(valor); //criação do objeto

                    System.out.println(ingressoNormal.ImprimirIngresso());
                    JOptionPane.showMessageDialog(null, ingressoNormal.ImprimirIngresso(), "Mensagem", JOptionPane.DEFAULT_OPTION); //imprimir usando o JOption
                    break;

                case 2:
                    valor = Double.parseDouble(JOptionPane.showInputDialog(" informe valor do ingresso"));
                    valorAdicional = Double.parseDouble(JOptionPane.showInputDialog(" informe valor adicional"));
                    Vip ingressoVip = new Vip(valor, valorAdicional);
                    JOptionPane.showMessageDialog(null, ingressoVip.ImprimeIngressoVip(), "Mensagem", JOptionPane.DEFAULT_OPTION);
                    break;

                case 3:
                    valor = Double.parseDouble(JOptionPane.showInputDialog(" informe valor do ingresso"));
                    valorAdicional = Double.parseDouble(JOptionPane.showInputDialog(" informe valor adicional"));
                    localizacao = JOptionPane.showInputDialog("Localização");

                    Camarote ingressoCamarote = new Camarote(valor, valorAdicional, localizacao);
                    JOptionPane.showMessageDialog(null, ingressoCamarote.ImprimirIngressoCamarote(), "Mensagem", JOptionPane.DEFAULT_OPTION);
                    break;

                case 4:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "opção invalida", "erro", JOptionPane.DEFAULT_OPTION);

            }
        }

            while (opcao != 4) ;
    }
}