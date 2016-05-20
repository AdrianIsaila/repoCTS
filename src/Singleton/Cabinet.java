package Singleton;

import java.util.ArrayList;

import SimpleFactory.Angajat;

public class Cabinet {

private static Cabinet instance=new Cabinet();
	private ArrayList<Angajat> angajatiiCabinetului;
	private Cabinet(){
		angajatiiCabinetului = new ArrayList<Angajat>();
	}
	
	public static Cabinet getInstance()
	{
		return instance;
	}
	
	public void showMessage(){
		System.out.println("A fost creat cabinetul veterinar");
	}
	
	public void angajeazaAngajat(Angajat angajatNou){
		this.angajatiiCabinetului.add(angajatNou);
	}
	
	public void concediazaAngajat(Angajat angajatNou){
		this.angajatiiCabinetului.remove(angajatNou);
	}
	
	

}
