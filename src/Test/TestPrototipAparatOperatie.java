package Test;

import Prototip.PrototipAparatOperatie;
import junit.framework.TestCase;

public class TestPrototipAparatOperatie extends TestCase {

	protected void setUp() throws Exception {
		super.setUp();
	}
	//constructor
	public TestPrototipAparatOperatie(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}
	
	public void testVerificaAnimalCaine(){
		String caine = "caine";
		PrototipAparatOperatie aparat = new PrototipAparatOperatie("888*6612", "laser");
		assertEquals("Probleme la valori reale caine", true,  aparat.verificaAnimal(caine));
	}
	
	public void testVerificaAnimalPisica(){
		String pisica = "pisica";
		PrototipAparatOperatie aparat = new PrototipAparatOperatie("888*6612", "laser");
		assertEquals("Probleme la valori reale pisica", true,  aparat.verificaAnimal(pisica));
	}
	
	public void testVerificaAnimalZebra(){
		String zebra = "zebra";
		PrototipAparatOperatie aparat = new PrototipAparatOperatie("888*6612", "laser");
		assertEquals("Probleme la valori reale zebra", false,  aparat.verificaAnimal(zebra));
	}

}
