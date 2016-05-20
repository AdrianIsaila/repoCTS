package TemplateSiBuilder;

import SimpleFactory.Medic;


public class BuilderOperatieCaine {
	private OperatieCaine operatieCatel;
	
	public BuilderOperatieCaine(Medic medicOperatie, String numeCaine) {
		super();
		operatieCatel = new OperatieCaine(medicOperatie, numeCaine, 0, 0, 0, "");

	}
	
	public OperatieCaine build(){
		return this.operatieCatel;
	}
	
	public BuilderOperatieCaine setVarsta(int varsta){
		operatieCatel.setVarstaCaine(varsta);
		return this;
		
	}
	
	public BuilderOperatieCaine setInaltime(float inaltime){
		operatieCatel.setInaltime(inaltime);
		return this;
		
	}
	
	public BuilderOperatieCaine setGreutate(float greutate){
		operatieCatel.setGreutateCaine(greutate);
		return this;
		
	}
	
	public BuilderOperatieCaine setRasaCaine(String rasa){
		operatieCatel.setRasaCaine(rasa);
		return this;
		
	}
}
