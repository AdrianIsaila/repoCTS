package Test;

import SimpleFactory.Angajat;
import SimpleFactory.DefinesteActiune;
import SimpleFactory.Medic;
import junit.framework.TestCase;

public class TestMedic extends TestCase {

	//constructor
	public TestMedic(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	int  varsta;
	float vechime;
	float salariuMediu;
	DefinesteActiune actiune;
	Angajat angajatMedic;
	double salariu;
	
	protected void setUp() throws Exception {
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}
	
	//salariu
	
	public void testCalculeazaSalariuVarstaSubValoareaMinima(){
		
		this.varsta = 29;
		this.vechime = 1;
		this.salariuMediu = 2000;
		//Angajat angajatMedic;
		this.actiune= new DefinesteActiune();


		
		try {
			this.angajatMedic= actiune.getAngajat("MEDIC");
			angajatMedic.executaActiune();
			salariu = ((Medic)angajatMedic).CalculeazaSalariu(varsta, vechime, salariuMediu);
			fail("Metoda nu arunca exceptie pe varsta mai mica");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void testCalculeazaSalariuVarstaNegativa(){
		
		this.varsta = -1;
		this.vechime = 1;
		this.salariuMediu = 2000;
		//Angajat angajatMedic;
		this.actiune= new DefinesteActiune();

		
		try {
			this.angajatMedic= actiune.getAngajat("MEDIC");
			angajatMedic.executaActiune();
			salariu = ((Medic)angajatMedic).CalculeazaSalariu(varsta, vechime, salariuMediu);
			fail("Metoda nu arunca exceptie pe varsta negativa");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void testCalculeazaSalariuVarstaZero(){
		
		this.varsta = 0;
		this.vechime = 1;
		this.salariuMediu = 2000;
		//Angajat angajatMedic;
		this.actiune= new DefinesteActiune();

		
		try {
			this.angajatMedic= actiune.getAngajat("MEDIC");
			angajatMedic.executaActiune();
			salariu = ((Medic)angajatMedic).CalculeazaSalariu(varsta, vechime, salariuMediu);
			fail("Metoda nu arunca exceptie pe varsta 0");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void testCalculeazaSalariuVarstaPreaMare(){
		
		this.varsta = 78;
		this.vechime = 1;
		this.salariuMediu = 2000;
		//Angajat angajatMedic;
		this.actiune= new DefinesteActiune();

		
		try {
			this.angajatMedic= actiune.getAngajat("MEDIC");
			angajatMedic.executaActiune();
			salariu = ((Medic)angajatMedic).CalculeazaSalariu(varsta, vechime, salariuMediu);
			fail("Metoda nu arunca exceptie pe varsta mai mare");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void testCalculeazaSalariuValoriNOrmale(){
		
		this.varsta = 40;
		this.vechime = 10;
		this.salariuMediu = 5000;
		//Angajat angajatMedic;
		this.actiune= new DefinesteActiune();

		double salariuMeidc = varsta*0.1 + salariuMediu/2 * vechime*0.7;
		
		try {
			this.angajatMedic= actiune.getAngajat("MEDIC");
			angajatMedic.executaActiune();
			salariu = ((Medic)angajatMedic).CalculeazaSalariu(varsta, vechime, salariuMediu);
			assertEquals("Probleme la setter pe valori normale", 
					salariuMeidc,
					salariu);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	//vechime
	
	public void testCalculeazaSalariuVechimeNegativa(){
		
		this.varsta = 35;
		this.vechime = -1;
		this.salariuMediu = 2000;
		//Angajat angajatMedic;
		this.actiune= new DefinesteActiune();

		
		try {
			this.angajatMedic= actiune.getAngajat("MEDIC");
			angajatMedic.executaActiune();
			salariu = ((Medic)angajatMedic).CalculeazaSalariu(varsta, vechime, salariuMediu);
			fail("Metoda nu arunca exceptie pe vechime negativa");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void testCalculeazaSalariuVechimeZero(){
		
		this.varsta = 35;
		this.vechime = 0;
		this.salariuMediu = 2000;
		//Angajat angajatMedic;
		this.actiune= new DefinesteActiune();

		
		try {
			this.angajatMedic= actiune.getAngajat("MEDIC");
			angajatMedic.executaActiune();
			salariu = ((Medic)angajatMedic).CalculeazaSalariu(varsta, vechime, salariuMediu);
			fail("Metoda nu arunca exceptie pe vechime Zero");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void testCalculeazaSalariuVechimePreaMica(){
		
		this.varsta = 35;
		this.vechime = (float)0.5;
		this.salariuMediu = 2000;
		//Angajat angajatMedic;
		this.actiune= new DefinesteActiune();

		
		try {
			this.angajatMedic= actiune.getAngajat("MEDIC");
			angajatMedic.executaActiune();
			salariu = ((Medic)angajatMedic).CalculeazaSalariu(varsta, vechime, salariuMediu);
			fail("Metoda nu arunca exceptie pe vechime prea mica");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
public void testCalculeazaSalariuVechimePreaMare(){
		
		this.varsta = 35;
		this.vechime = 100;
		this.salariuMediu = 2000;
		//Angajat angajatMedic;
		this.actiune= new DefinesteActiune();

		
		try {
			this.angajatMedic= actiune.getAngajat("MEDIC");
			angajatMedic.executaActiune();
			salariu = ((Medic)angajatMedic).CalculeazaSalariu(varsta, vechime, salariuMediu);
			fail("Metoda nu arunca exceptie pe vechime prea mare");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}


	//salariu mediu

	public void testCalculeazaSalariuSalariuMediuNegativa(){
		
		this.varsta = 35;
		this.vechime = 5;
		this.salariuMediu = -1;
		//Angajat angajatMedic;
		this.actiune= new DefinesteActiune();

		
		try {
			this.angajatMedic= actiune.getAngajat("MEDIC");
			angajatMedic.executaActiune();
			salariu = ((Medic)angajatMedic).CalculeazaSalariu(varsta, vechime, salariuMediu);
			fail("Metoda nu arunca exceptie pe SalariuMediu negativ");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void testCalculeazaSalariuSalariuMediuZero(){
		
		this.varsta = 35;
		this.vechime = 5;
		this.salariuMediu = 0;
		//Angajat angajatMedic;
		this.actiune= new DefinesteActiune();

		
		try {
			this.angajatMedic= actiune.getAngajat("MEDIC");
			angajatMedic.executaActiune();
			salariu = ((Medic)angajatMedic).CalculeazaSalariu(varsta, vechime, salariuMediu);
			fail("Metoda nu arunca exceptie pe SalariuMediu Zero");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void testCalculeazaSalariuSalariuMediuPreaMic(){
		
		this.varsta = 35;
		this.vechime = 5;
		this.salariuMediu = 1;
		//Angajat angajatMedic;
		this.actiune= new DefinesteActiune();

		
		try {
			this.angajatMedic= actiune.getAngajat("MEDIC");
			angajatMedic.executaActiune();
			salariu = ((Medic)angajatMedic).CalculeazaSalariu(varsta, vechime, salariuMediu);
			fail("Metoda nu arunca exceptie pe SalariuMediu prea mic");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void testCalculeazaSalariuSalariuMediuPreaMare(){
		
		this.varsta = 35;
		this.vechime = 5;
		this.salariuMediu = 200000;
		//Angajat angajatMedic;
		this.actiune= new DefinesteActiune();

		
		try {
			this.angajatMedic= actiune.getAngajat("MEDIC");
			angajatMedic.executaActiune();
			salariu = ((Medic)angajatMedic).CalculeazaSalariu(varsta, vechime, salariuMediu);
			fail("Metoda nu arunca exceptie pe SalariuMediu prea mare");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
