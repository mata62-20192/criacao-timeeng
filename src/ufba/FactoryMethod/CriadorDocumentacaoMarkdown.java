package ufba.FactoryMethod;

import java.util.Date;

import ufba.elementos.Cabecalho;
import ufba.elementos.Corpo;
import ufba.elementos.Rodape;
import ufba.elementos.markdown.CabecalhoMarkdown;
import ufba.elementos.markdown.CorpoMarkdown;
import ufba.elementos.markdown.RodapeMarkdown;

class CriadorDocumentacaoMarkdown extends CriadorDocumentacao{
	
	public CriadorDocumentacaoMarkdown() {
		Cabecalho cabecalho;
		Corpo corpo;
		Rodape rodape;
		cabecalho = new CabecalhoMarkdown();
		cabecalho.setTitulo("Padroes de projeto");
		cabecalho.setEmpresa("Universidade Federal da Bahia");
		corpo = new CorpoMarkdown();
		corpo.setTexto("Aula de padroes de projeto na disciplina Engenharia de Software I.");
		rodape = new RodapeMarkdown();
		rodape.setData(new Date());
		System.out.println(cabecalho.getOutput() + corpo.getOutput() + rodape.getOutput()); 
	}
}
