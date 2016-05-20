package SimpleFactory;

import java.sql.Date;
import java.util.HashMap;
import java.util.Map;

public class Receptioner implements Angajat{

	private Map<String, java.util.Date> rezervari;
	
	public Map<String, java.util.Date> getRezervari() {
		return rezervari;
	}

	public Receptioner() {
		super();
		this.rezervari = new HashMap<String, java.util.Date>();
		
		
	}

	@Override
	public void executaActiune() {
		// TODO Auto-generated method stub
		System.out.println("Preia programarea ");

	}
	
	public void adaugaRezervare(String nume, java.util.Date dataRezervare) throws Exception{
		java.util.Date today = new java.util.Date();
		if(nume.isEmpty())
			throw new Exception("Numele e gol");
		else if(nume.length() < 3)
			throw new Exception("Numele e mai mic de 3 caractere");
		else if(nume.length() > 30)
			throw new Exception("Numele e mai mare de 30 caractere");
		else if(dataRezervare.compareTo(today) == -1)
			throw new Exception("Rezervare se doreste a fi facuta in trecut");
		else if(this.rezervari.containsValue(dataRezervare))
			throw new Exception("Exista deja rezervare in aceasta ziua");
		else
			this.rezervari.put(nume, dataRezervare);

		
	}
	
}
