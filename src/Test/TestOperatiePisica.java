package Test;

import TemplateSiBuilder.OperatiePisica;
import junit.framework.TestCase;

public class TestOperatiePisica extends TestCase {

	
	//constructor
	public TestOperatiePisica(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	private OperatiePisica operatia;
	private int varsta;
	private float greutate;
	
	protected void setUp() throws Exception {
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}
	
	public void testcalculeazaCostOperatieVarstaZero(){
		this.operatia = new OperatiePisica(null);
		
		this.greutate = 10;
		this.varsta = 0;
		
		try {
			float cost = this.operatia.calculeazaCostOperatie(varsta, greutate);
			fail("Metoda nu arunca exceptie pe varsta nulla");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void testcalculeazaCostOperatieVarstaPreaMare(){
		this.operatia = new OperatiePisica(null);
		
		this.greutate = 10;
		this.varsta = 100;
		
		try {
			float cost = this.operatia.calculeazaCostOperatie(varsta, greutate);
			fail("Metoda nu arunca exceptie pe varsta prea mare");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void testcalculeazaCostOperatieGreutateNulla(){
		this.operatia = new OperatiePisica(null);
		
		this.greutate = 0;
		this.varsta = 10;
		
		try {
			float cost = this.operatia.calculeazaCostOperatie(varsta, greutate);
			fail("Metoda nu arunca exceptie pe greutate nulla");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void testcalculeazaCostOperatieGreutatePreaMare(){
		this.operatia = new OperatiePisica(null);
		
		this.greutate = 1000;
		this.varsta = 10;
		
		try {
			float cost = this.operatia.calculeazaCostOperatie(varsta, greutate);
			fail("Metoda nu arunca exceptie pe greutate prea mare");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void testcalculeazaCostOperatieValoriNOrmale(){
		this.operatia = new OperatiePisica(null);
		
		this.greutate = 10;
		this.varsta = 10;
		
		float costNou = (greutate * 2 + varsta)*100;
		
		try {
			float cost = this.operatia.calculeazaCostOperatie(varsta, greutate);
			assertEquals("Problema cost valori normale", costNou , cost);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
