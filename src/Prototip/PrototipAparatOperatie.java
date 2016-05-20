package Prototip;

public class PrototipAparatOperatie extends PrototipAbstractAparatOperatie {
	private String codAparat;
	private String tehnologieAparat;
	
	public PrototipAparatOperatie(String codAparat, String tehnologieAparat) {
		super();
		this.codAparat = codAparat;
		this.tehnologieAparat = tehnologieAparat;
	}
	
	public boolean verificaAnimal(String animal){
		//se pot opera cu aparatul doar caini si pisicile
		if(animal.toLowerCase().trim().equals("caine") || animal.toLowerCase().trim().equals("pisica")){
			return true;			
		}
		else
			return false;
	}
	
}
