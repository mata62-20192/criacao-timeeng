package ufba.AbstractFactory;
import ufba.elementos.Cabecalho;
import ufba.elementos.Corpo;
import ufba.elementos.Rodape;
import ufba.elementos.html.CabecalhoHTML;
import ufba.elementos.html.CorpoHTML;
import ufba.elementos.html.RodapeHTML;

public class FactoryHTML extends FactoryDocuentacao {
    public FactoryHTML() {
    }

    public Cabecalho criarCabecalho() {
        return new CabecalhoHTML();
    }

    public Corpo criarCorpo() {
        return new CorpoHTML();
    }

    public Rodape criarRodape() {
        return new RodapeHTML();
    }
}
