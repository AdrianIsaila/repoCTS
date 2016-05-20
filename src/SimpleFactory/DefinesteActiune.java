package SimpleFactory;

public class DefinesteActiune {

	public Angajat getAngajat(String angajatType) throws Exception
	{
		if(angajatType==null){
			throw new Exception("AngajatType este null");
		}
		if(angajatType.equalsIgnoreCase("MEDIC")){
			return new Medic();
		}else if(angajatType.equalsIgnoreCase("ASISTENT")){
			return new Asistent();
		}else if(angajatType.equalsIgnoreCase("RECEPTIONER")){
			return new Receptioner();
		}
		else 
			throw new Exception("Nu avem angajati de tipul acesta");

	}

}
