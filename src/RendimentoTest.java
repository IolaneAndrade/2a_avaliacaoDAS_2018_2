import static org.junit.Assert.*;

import org.junit.Test;

public class RendimentoBrutoTest {

	static Rendimento rendimento;
	
	@Test
	public void RendimentoBrutoTest() {
		
		double aplicacaoInicial = 1000.00f; // unidade em Reais
		double tempo = 0.16f; //unidade em anos
		
		Investimento invertimento = new Investimento(aplicacaoInicial, tempo);
		 
		 
		 assertEquals(13.97, rendimento.rendimentoBruto(investimento), .2f);
		
	}

}

