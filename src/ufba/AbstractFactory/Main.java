package ufba.AbstractFactory;
import java.util.Date;
import ufba.elementos.Cabecalho;
import ufba.elementos.Corpo;
import ufba.elementos.Rodape;

public class Main {
    
    public static void main(String[] Args) {
        DocumentacaoFactory factoryHTML = new FactoryHTML();
        CriadorDocumentacao criador = new CriadorDocumentacao(factoryHTML);
        
        Cabecalho cabecalho = criador.gerarCabecalho();
        Corpo corpo = criador.gerarCorpo();
        Rodape rodape = criador.gerarRodape();
        System.out.println(cabecalho.getOutput());
        System.out.println(corpo.getOutput());
        System.out.println(rodape.getOutput());
        DocumentacaoFactory factoryMARKDOWN = new FactoryMARKDOWN();
        criador.setFactory(factoryMARKDOWN);
        cabecalho = criador.gerarCabecalho();
        corpo = criador.gerarCorpo();
        rodape = criador.gerarRodape();
        System.out.println(cabecalho.getOutput());
        System.out.println(corpo.getOutput());
        System.out.println(rodape.getOutput());
        
        
    }

}
