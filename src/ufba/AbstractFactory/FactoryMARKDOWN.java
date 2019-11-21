package ufba.AbstractFactory;
import ufba.elementos.Cabecalho;
import ufba.elementos.Corpo;
import ufba.elementos.Rodape;
import ufba.elementos.markdown.CabecalhoMarkdown;
import ufba.elementos.markdown.CorpoMarkdown;
import ufba.elementos.markdown.RodapeMarkdown;

public class FactoryMARKDOWN extends DocumentacaoFactory{
    public FactoryMARKDOWN() {
    }

    public Cabecalho criarCabecalho() {
        return new CabecalhoMarkdown();
    }

    public Corpo criarCorpo() {
        return new CorpoMarkdown();
    }

    public Rodape criarRodape() {
        return new RodapeMarkdown();
    }
}
