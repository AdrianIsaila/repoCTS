package Test;

import Observer.Anuntat;
import Observer.Buton;
import Observer.HandlerRezerva;
import junit.framework.TestCase;

public class TestAnuntat extends TestCase {

	protected void setUp() throws Exception {
		super.setUp();
	}
	

	//constructor
	public TestAnuntat(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}
	
	public void testProgramareHandlerRezerva(){
		HandlerRezerva myHandler = new HandlerRezerva();
		Buton myButon = new Buton();
		try {
			myButon.programare(myHandler);
			assertEquals("Probleme la adaugarea de Handler", myHandler,
					myButon.getObservatori().get(0));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	}
	public void testProgramareNull(){
		Buton myButon = new Buton();
		
		try {
			myButon.programare(null);
			fail("Metoda nu arunca exceptie pe null");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
