package Test;

import SimpleFactory.Angajat;
import SimpleFactory.Asistent;
import SimpleFactory.DefinesteActiune;
import junit.framework.TestCase;

public class TestAsistent extends TestCase {

	//constructor
	public TestAsistent(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	protected void setUp() throws Exception {
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}
	
	public void testCalculeazaZileLibereZileLucrateNegative(){
		
		DefinesteActiune actiune= new DefinesteActiune();
		Angajat angajatAsistent;
		int zileLucrate = -1;
		try {
			angajatAsistent = actiune.getAngajat("ASISTENT");
			((Asistent)angajatAsistent).calculeazaZileLibere(zileLucrate);
			fail("Metoda nu arunca exceptie pe valoare negativa");
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}
	
	public void testCalculeazaZileLibereZileLucratePreaMulte(){
		
		DefinesteActiune actiune= new DefinesteActiune();

		int zileLucrate = 400;
		try {
			Angajat angajatAsistent=actiune.getAngajat("ASISTENT");
			((Asistent)angajatAsistent).calculeazaZileLibere(zileLucrate);
			fail("Metoda nu arunca exceptie pe valoare prea mare");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void testCalculeazaZileLibereZileLucrateValoriBune(){

		int zileLucrate = 100;
		try {
			DefinesteActiune actiune= new DefinesteActiune();
			Angajat angajatAsistent=actiune.getAngajat("ASISTENT");
			assertEquals("Probleme la valori normale", (100*21)/365 ,
					((Asistent)angajatAsistent).calculeazaZileLibere(zileLucrate));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
