package Program;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.sound.midi.Receiver;

import Facade.FacadePregatireOperatie;
import Observer.Buton;
import Observer.HandlerRezerva;
import Observer.HandlerSuna;
import Prototip.PrototipAparatOperatie;
import SimpleFactory.Angajat;
import SimpleFactory.DefinesteActiune;
import SimpleFactory.Medic;
import SimpleFactory.Receptioner;
import Singleton.Cabinet;
import State.Context;
import State.stateRezervare;
import State.stateUrgente;
import TemplateSiBuilder.BuilderOperatieCaine;
import TemplateSiBuilder.OperatieCaine;


public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//verificare singleton
		
		Cabinet cabinetVeterinar=Cabinet.getInstance();
		cabinetVeterinar.showMessage();
		
		//verificare simple factory
		
		System.out.println("\nActiunile SUNT: ");
		DefinesteActiune actiune= new DefinesteActiune();
		Angajat angajatMedic;
		try {
			angajatMedic = actiune.getAngajat("MEDIC");
			angajatMedic.executaActiune();
			
			//anagajam noul medic
			cabinetVeterinar.angajeazaAngajat(angajatMedic);
			
			//verificare builder
			String numeCatel = "Asi";
			System.out.println("\n");
			OperatieCaine operatieCatel = new BuilderOperatieCaine((Medic)angajatMedic, numeCatel)
					.setGreutate(20)
					.setInaltime(50)
					.setVarsta(3)
					.setRasaCaine("buldog")
					.build();
					
			//verificare template					
			operatieCatel.initializare();
		} catch (Exception e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}

		


		
		Angajat angajatReceptioner;
		try {
			angajatReceptioner = actiune.getAngajat("RECEPTIONER");
			angajatReceptioner.executaActiune();
			
			//anagajam noul receptioner
			cabinetVeterinar.angajeazaAngajat(angajatReceptioner);
		} catch (Exception e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}

		
		Angajat angajatAsistent;
		try {
			angajatAsistent = actiune.getAngajat("ASISTENT");
			
			angajatAsistent.executaActiune();
			
			//anagajam noul asistent
			cabinetVeterinar.angajeazaAngajat(angajatAsistent);
		} catch (Exception e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}

		
		
		//verificare state
		
		System.out.println("\nSolicitarea clientului");
		Context context=new Context();
		stateRezervare R=new stateRezervare();
		R.doAction(context);
		System.out.println(context.getState().toString());
		stateUrgente U=new stateUrgente();
		U.doAction(context);
		System.out.println(context.getState().toString());

		
		// verificare observer
		
		System.out.println("\nSuna pentru a face o programare");
		Buton buton=new Buton();	
		HandlerSuna suna=new HandlerSuna();
		HandlerRezerva rezerva=new HandlerRezerva();

		try {
			buton.programare(suna);
			buton.programare(rezerva);
		} catch (Exception e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		buton.Click();
		

		 
		//testare prototip
		
		PrototipAparatOperatie aparat = new PrototipAparatOperatie("enb12zn8", "laser");
		
		try {
			PrototipAparatOperatie aparatSecundar = (PrototipAparatOperatie)aparat.clone();
			
		} catch (CloneNotSupportedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		//testare facade
		FacadePregatireOperatie.pregatire();
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd-M-yyyy");
		String dateInString = "20-08-2016";
		java.util.Date dataRezervare;
		try {
			angajatReceptioner = actiune.getAngajat("RECEPTIONER");
			
			dataRezervare = sdf.parse(dateInString);
			System.out.println(dataRezervare.toString());
			((Receptioner)angajatReceptioner).adaugaRezervare("ddd", dataRezervare);
			
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
