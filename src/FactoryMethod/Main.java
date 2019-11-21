package ufba.factorymethod;

public class Main {

	public static void main(String[] args) {
		CriadorDocumentacaoFactory factory = new CriadorDocumentacaoFactory();
		factory.getDocumentacao("html");
	}

}
