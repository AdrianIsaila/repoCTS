package Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import SimpleFactory.Angajat;
import SimpleFactory.DefinesteActiune;
import SimpleFactory.Receptioner;
import junit.framework.TestCase;

public class TestReceptioner extends TestCase {

	protected void setUp() throws Exception {
		super.setUp();
	}

	//constructor
	public TestReceptioner(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	public void testAdaugaRezervareEmptyString(){
		DefinesteActiune actiune= new DefinesteActiune();

		
		String nume = "";
		SimpleDateFormat sdf = new SimpleDateFormat("dd-M-yyyy");
		String dateInString = "26-08-2016";
		java.util.Date dataRezervare;
		try {
			Angajat angajatReceptioner=actiune.getAngajat("RECEPTIONER");
			angajatReceptioner.executaActiune();
			
			dataRezervare = sdf.parse(dateInString);
			System.out.println(dataRezervare.toString());
			((Receptioner)angajatReceptioner).adaugaRezervare(nume, dataRezervare);
			fail("Metoda nu arunca exceptie empty string");
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	}
	
	public void testAdaugaRezervareNullString(){
		DefinesteActiune actiune= new DefinesteActiune();

		String nume = null;
		SimpleDateFormat sdf = new SimpleDateFormat("dd-M-yyyy");
		String dateInString = "25-08-2016";
		java.util.Date dataRezervare;
		try {
			Angajat angajatReceptioner=actiune.getAngajat("RECEPTIONER");
			angajatReceptioner.executaActiune();
			
			dataRezervare = sdf.parse(dateInString);
			System.out.println(dataRezervare.toString());
			((Receptioner)angajatReceptioner).adaugaRezervare(nume, dataRezervare);
			fail("Metoda nu arunca exceptie pe null string");
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void testAdaugaRezervareInsuficienteCaractere(){
		DefinesteActiune actiune= new DefinesteActiune();

		String nume = "Da";
		SimpleDateFormat sdf = new SimpleDateFormat("dd-M-yyyy");
		String dateInString = "24-08-2016";
		java.util.Date dataRezervare;
		try {
			Angajat angajatReceptioner=actiune.getAngajat("RECEPTIONER");
			angajatReceptioner.executaActiune();
			
			dataRezervare = sdf.parse(dateInString);
			System.out.println(dataRezervare.toString());
			((Receptioner)angajatReceptioner).adaugaRezervare(nume, dataRezervare);
			fail("Metoda nu arunca exceptie pe caractere putine");
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	}
	
	public void testAdaugaRezervarePreaMulteCaractere(){
		DefinesteActiune actiune= new DefinesteActiune();

		String nume = "testtesttesttesttesttesttesttesttest";
		SimpleDateFormat sdf = new SimpleDateFormat("dd-M-yyyy");
		String dateInString = "23-08-2016";
		java.util.Date dataRezervare;
		try {
			Angajat angajatReceptioner=actiune.getAngajat("RECEPTIONER");
			angajatReceptioner.executaActiune();
			
			
			dataRezervare = sdf.parse(dateInString);
			System.out.println(dataRezervare.toString());
			((Receptioner)angajatReceptioner).adaugaRezervare(nume, dataRezervare);
			fail("Metoda nu arunca exceptie pe caractere prea multe");
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	}
	
	public void testAdaugaRezervareLimitaInferioaraString(){
		DefinesteActiune actiune= new DefinesteActiune();

		
		String nume = "Ada";
		SimpleDateFormat sdf = new SimpleDateFormat("dd-M-yyyy");
		String dateInString = "22-08-2016";
		java.util.Date dataRezervare;
		try {
			Angajat angajatReceptioner=actiune.getAngajat("RECEPTIONER");
			angajatReceptioner.executaActiune();
			
			dataRezervare = sdf.parse(dateInString);
			System.out.println(dataRezervare.toString());
			((Receptioner)angajatReceptioner).adaugaRezervare(nume, dataRezervare);
			assertEquals("Probleme la limita inferioara", 
					dataRezervare,
					((Receptioner)angajatReceptioner).getRezervari().get(nume));
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	
	}
	public void testAdaugaRezervareLimitaSuperioaraString(){
		DefinesteActiune actiune= new DefinesteActiune();
		
		String nume = "AdaAdaAdaAdaAdaAdaAdaAdaAdaAda";
		SimpleDateFormat sdf = new SimpleDateFormat("dd-M-yyyy");
		String dateInString = "21-08-2016";
		java.util.Date dataRezervare;
		try {
			Angajat angajatReceptioner=actiune.getAngajat("RECEPTIONER");
			angajatReceptioner.executaActiune();

			dataRezervare = sdf.parse(dateInString);
			System.out.println(dataRezervare.toString());
			((Receptioner)angajatReceptioner).adaugaRezervare(nume, dataRezervare);
			
			assertEquals("Probleme la limita inferioara", 
					dataRezervare,
					((Receptioner)angajatReceptioner).getRezervari().get(nume));

		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	}
	
	public void testAdaugaRezervareValoriNormale(){
		DefinesteActiune actiune= new DefinesteActiune();

		String nume = "Adriana";
		SimpleDateFormat sdf = new SimpleDateFormat("dd-M-yyyy");
		String dateInString = "19-08-2016";
		java.util.Date dataRezervare;
		try {
			Angajat angajatReceptioner=actiune.getAngajat("RECEPTIONER");
			angajatReceptioner.executaActiune();
			
			dataRezervare = sdf.parse(dateInString);
			System.out.println(dataRezervare.toString());
			((Receptioner)angajatReceptioner).adaugaRezervare(nume, dataRezervare);
			

			assertEquals("Probleme la limita inferioara", 
					dataRezervare,
					((Receptioner)angajatReceptioner).getRezervari().get(nume));

		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	}
	
	public void testAdaugaRezervareDataInTrecut(){
		DefinesteActiune actiune= new DefinesteActiune();

		String nume = "Adriana";
		SimpleDateFormat sdf = new SimpleDateFormat("dd-M-yyyy");
		String dateInString = "19-01-2016";
		java.util.Date dataRezervare;
		try {
			Angajat angajatReceptioner=actiune.getAngajat("RECEPTIONER");
			angajatReceptioner.executaActiune();
			
			dataRezervare = sdf.parse(dateInString);
			System.out.println(dataRezervare.toString());
			((Receptioner)angajatReceptioner).adaugaRezervare(nume, dataRezervare);
		
			fail("Metoda nu arunca exceptie pe data din trecut");

		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	}
	
	public void testAdaugaRezervareInAceiasZi(){
		DefinesteActiune actiune= new DefinesteActiune();
	
		String nume = "Adriana";
		SimpleDateFormat sdf = new SimpleDateFormat("dd-M-yyyy");
		String dateInString = "19-01-2016";
		java.util.Date dataRezervare;
		try {
			Angajat angajatReceptioner=actiune.getAngajat("RECEPTIONER");
			angajatReceptioner.executaActiune();
		
			dataRezervare = sdf.parse(dateInString);
			System.out.println(dataRezervare.toString());
			((Receptioner)angajatReceptioner).adaugaRezervare(nume, dataRezervare);
			nume = "Isaila";
			((Receptioner)angajatReceptioner).adaugaRezervare(nume, dataRezervare);
			
			fail("Metoda nu arunca exceptie pe aceias data");

		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	}
	
}
