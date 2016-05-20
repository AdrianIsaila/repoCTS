package Observer;

public class Buton extends Anuntat {

	public boolean isClicked=false;
	
	//functie care verifica daca a fost sau nu apasat butonul
	public void setButton(){
		if(!isClicked)
		{
			isClicked=true;
			this.notificareAsistenti();
		}else{
			isClicked=false;
		}
	}
	
	//mesaj pentru apasare
	public void Click(){
		System.out.println("A fost facuta programarea");
		setButton();
	}

}
