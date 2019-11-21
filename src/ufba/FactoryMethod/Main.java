package ufba.FactoryMethod;

public class Main {

	public static void main(String[] args) {
		CriadorDocumentacaoFactory factory = new CriadorDocumentacaoFactory();
		factory.getDocumentacao("html");
	}

}
