package TemplateSiBuilder;

import SimpleFactory.Medic;

public class OperatieCaine extends TemplateOperatie {
	private Medic medicOperatie;
	private String numeCaine;
	private int varstaCaine;
	private float greutateCaine;
	private float inaltime;
	private String rasaCaine;
	

	public OperatieCaine(Medic medicOperatie, String numeCaine) {
		super();
		this.medicOperatie = medicOperatie;
		this.numeCaine = numeCaine;
	}	
	
	public OperatieCaine(Medic medicOperatie, 
			String numeCaine, 
			int varstaCaine, 
			float greutateCaine, 
			float inaltime,
			String rasaCaine) {
		super();
		this.medicOperatie = medicOperatie;
		this.numeCaine = numeCaine;
		this.varstaCaine = varstaCaine;
		this.greutateCaine = greutateCaine;
		this.inaltime = inaltime;
		this.rasaCaine = rasaCaine;
	}

	public float getInaltime() {
		return inaltime;
	}

	public void setInaltime(float inaltime) {
		this.inaltime = inaltime;
	}

	
	public String getNumeCaine() {
		return numeCaine;
	}

	public void setNumeCaine(String numeCaine) {
		this.numeCaine = numeCaine;
	}

	public int getVarstaCaine() {
		return varstaCaine;
	}

	public void setVarstaCaine(int varstaCaine) {
		this.varstaCaine = varstaCaine;
	}

	public float getGreutateCaine() {
		return greutateCaine;
	}

	public void setGreutateCaine(float greutateCaine) {
		this.greutateCaine = greutateCaine;
	}

	public String getRasaCaine() {
		return rasaCaine;
	}

	public void setRasaCaine(String rasaCaine) {
		this.rasaCaine = rasaCaine;
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
		System.out.println("catelul tuns");		
	}

	@Override
	public void anesteziazaAnimalul() {
		// TODO Auto-generated method stub
		System.out.println("catelul anesteziat");
	}
	


}
