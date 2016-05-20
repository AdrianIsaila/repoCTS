package TemplateSiBuilder;

import SimpleFactory.Medic;

public class OperatiePisica extends TemplateOperatie {

	private Medic medicOperatie;

	
	public OperatiePisica(Medic medicOperatie) {
		super();
		this.medicOperatie = medicOperatie;
	}

	public Medic getMedicOperatie() {
		return medicOperatie;
	}

	public void setMedicOperatie(Medic medicOperatie) {
		this.medicOperatie = medicOperatie;
	}

	@Override
	public void pregatesteTrusa() {
		// TODO Auto-generated method stub
		System.out.println("trusa pregatita");
	}

	@Override
	public void tundeAnimalul() {
		// TODO Auto-generated method stub
		System.out.println("Pisica tuns");		
	}

	@Override
	public void anesteziazaAnimalul() {
		// TODO Auto-generated method stub
		System.out.println("Pisica anesteziat");
	}

	public float calculeazaCostOperatie(int varsta, float greutate)throws Exception{
		float cost;
		
		if(varsta <=0)
			throw new Exception("Varsta negativa sau zero");
		else if(varsta > 30)
			throw new Exception("Varsta prea mare");
		if(greutate <1)
			throw new Exception("Greutate prea mica");
		else if(greutate > 100)
			throw new Exception("greutate prea mare");
		else
			cost = (greutate * 2 + varsta)*100;
		
		return cost;
	}
	
}
