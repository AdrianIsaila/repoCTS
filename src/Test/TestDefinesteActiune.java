package Test;

import SimpleFactory.Angajat;
import SimpleFactory.Asistent;
import SimpleFactory.DefinesteActiune;
import SimpleFactory.Medic;
import SimpleFactory.Receptioner;
import junit.framework.TestCase;

public class TestDefinesteActiune extends TestCase {

	protected void setUp() throws Exception {
		super.setUp();
	}

	//constructor
	public TestDefinesteActiune(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}
	
	public void testGetAngajatMedic(){
		DefinesteActiune actiune= new DefinesteActiune();
		try {
			assertEquals("Probleme la angajat medic", Medic.class, actiune.getAngajat("MEDIC").getClass());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void testGetAngajatAsistent(){
		DefinesteActiune actiune= new DefinesteActiune();
		try {
			assertEquals("Probleme la angajat asistent", Asistent.class, actiune.getAngajat("ASISTENT").getClass());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void testGetAngajatReceptioner(){
		DefinesteActiune actiune= new DefinesteActiune();
		try {
			assertEquals("Probleme la angajat receptioner", Receptioner.class, actiune.getAngajat("RECEPTIONER").getClass());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void testGetAngajatFemeiServici(){
		DefinesteActiune actiune= new DefinesteActiune();
		try {
			assertEquals("Probleme la angajat femeie de serviciu", null, actiune.getAngajat("FEMEIESERVICI").getClass());
			fail("Metoda nu arunca exceptie pe alt tip de angajat");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void testGetAngajatNull(){
		DefinesteActiune actiune= new DefinesteActiune();
		try {
			assertEquals("Probleme la angajat null", null, actiune.getAngajat(null).getClass());
			fail("Metoda nu arunca exceptie pe angajat null");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


}
