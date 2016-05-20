package Observer;

import java.util.ArrayList;

public abstract class Anuntat {




ArrayList<HandlerRezervare> observatori= new ArrayList<HandlerRezervare>();

public ArrayList<HandlerRezervare> getObservatori() {
	return observatori;
}
	//functie care permite abonarea unui nou observator
	public void programare(HandlerRezervare handlerRezervare) throws Exception
	{
		if(observatori==null)
			throw new Exception("Lista observatorii este null");
		else if(handlerRezervare==null)
			throw new Exception("HandlerRezervare este null");
		else
			observatori.add(handlerRezervare);


	}
	
	//functie care permite dezabonarea unui abonat
	public void anuleazaProgramarea(HandlerRezervare handlerRezervare)
	{
		if(observatori!=null){
			observatori.remove(handlerRezervare);
		}			
	}
	
	
	public void notificareAsistenti()
	{
		//daca lista de observatori nu este null
		if(observatori!=null){
			//pentru fiecare observator se trimite informatii 
			for(int i=0;i<observatori.size();i++)
			{
				observatori.get(i).doRezervare();
			}
		}
	}

}
