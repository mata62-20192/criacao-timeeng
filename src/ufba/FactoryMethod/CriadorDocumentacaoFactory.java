package ufba.FactoryMethod;

class CriadorDocumentacaoFactory {

	public CriadorDocumentacao getDocumentacao(String tipoDocumento) {
		if (tipoDocumento.equals("HTML")) 
			return new CriadorDocumentacaoHTML();
		if (tipoDocumento.equals("Markdown"))
			return new CriadorDocumentacaoMarkdown();
		else return null;		
	}
}
