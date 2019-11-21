package ufba.factorymethod;

import java.util.Date;

import ufba.elementos.Cabecalho;
import ufba.elementos.Corpo;
import ufba.elementos.Rodape;
import ufba.elementos.html.CabecalhoHTML;
import ufba.elementos.html.CorpoHTML;
import ufba.elementos.html.RodapeHTML;


class CriadorDocumentacaoHTML extends CriadorDocumentacao{
	public CriadorDocumentacaoHTML() {
		Cabecalho cabecalho;
		Corpo corpo;
		Rodape rodape;
		cabecalho = new CabecalhoHTML();
		cabecalho.setTitulo("Padroes de projeto");
		cabecalho.setEmpresa("Universidade Federal da Bahia");
		corpo = new CorpoHTML();
		corpo.setTexto("Aula de padroes de projeto na disciplina Engenharia de Software I.");
		rodape = new RodapeHTML();
		rodape.setData(new Date());
		System.out.println(cabecalho.getOutput() + corpo.getOutput() + rodape.getOutput());
	}
	
}
