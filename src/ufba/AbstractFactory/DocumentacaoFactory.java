package ufba.AbstractFactory;
import ufba.elementos.Cabecalho;
import ufba.elementos.Corpo;
import ufba.elementos.Rodape;

public abstract class DocumentacaoFactory{
    public FabricaDocumentacao() {}

    public abstract Cabecalho criarCabecalho();

    public abstract Corpo criarCorpo();

    public abstract Rodape criarRodape();
}
