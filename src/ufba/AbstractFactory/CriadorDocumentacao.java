package ufba.AbstractFactory;

import java.util.Date;
import ufba.elementos.Cabecalho;
import ufba.elementos.Corpo;
import ufba.elementos.Rodape;

public class CriadorDocumentacao {
	private DocumentacaoFactory fabrica;
	public CriadorDocumentacao(DocumentacaoFactory factory) {
    this.factory = factory;
	}

    public DocumentacaoFactory getFactory() {
        return this.factory;
    }

    public void setFactory(DocumentacaoFactory factory) {
        this.factory = factory;
    }

    public Cabecalho gerarCabecalho() {
        Cabecalho cabecalho = this.factory.criaCabecalho();
        cabecalho.setTitulo("Padroes de projeto");
        cabecalho.setEmpresa("Universidade Federal da Bahia");
        return cabecalho;
    }

    public Corpo gerarCorpo() {
        Corpo corpo = this.factory.criaCorpo();
        corpo.setTexto("Aula de padroes de projeto na disciplina Engenharia de Software I.");
        return corpo;
    }

    public Rodape gerarRodape() {
        Rodape rodape = this.factory.criaRodape();
        rodape.setData(new Date());
        return rodape;
    }
}
