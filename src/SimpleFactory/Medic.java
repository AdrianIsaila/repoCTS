package SimpleFactory;

public class Medic implements Angajat{

	@Override
	public void executaActiune() {
		// TODO Auto-generated method stub

		System.out.println("Opereaza");
	}
	
	public double CalculeazaSalariu(int  varsta, float vechime, float salariuMediu) throws Exception{
		double salariu;
		
		//formula este salariu = varsta*0.1 + salariuMediu/2 * vechime*0.7
		if (varsta < 0)
			throw new Exception("Varsta negativa");
		else if (varsta > 70)
			throw new Exception("Varsta prea mare");
		else if (varsta < 30)
			throw new Exception("Varsta prea mica");
		else if (vechime < 0)
			throw new Exception("Vechime negativa");
		else if (vechime < 1)
			throw new Exception("Vechime prea mica");
		else if (vechime > 40)
			throw new Exception("Vechime prea mare");
		else if (salariuMediu < 0)
			throw new Exception("Salariu mediu negativ");
		else if (salariuMediu < 1000)
			throw new Exception("Salariu mediu prea mic");
		else if (salariuMediu > 10000)
			throw new Exception("Salariu mediu prea mare");
		else
			salariu = varsta*0.1 + salariuMediu/2 * vechime*0.7;
		
		return salariu;
	}
}
