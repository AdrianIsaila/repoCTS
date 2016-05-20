package TemplateSiBuilder;



public abstract class TemplateOperatie {
	public void initializare(){
		pregatesteTrusa();
		tundeAnimalul();
		anesteziazaAnimalul();
		
	}
	
	public abstract void pregatesteTrusa();	
	public abstract void tundeAnimalul();
	public abstract void anesteziazaAnimalul();
	
}
