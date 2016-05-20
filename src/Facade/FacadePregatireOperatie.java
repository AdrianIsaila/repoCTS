package Facade;

import Prototip.PrototipAparatOperatie;
import SimpleFactory.Angajat;
import SimpleFactory.DefinesteActiune;
import SimpleFactory.Medic;
import TemplateSiBuilder.BuilderOperatieCaine;
import TemplateSiBuilder.OperatieCaine;

public class FacadePregatireOperatie {
	public static void pregatire(){
		//1. stabilirea medicului 

		DefinesteActiune actiune= new DefinesteActiune();
		Angajat angajatMedic;
		try {
			angajatMedic = actiune.getAngajat("MEDIC");

			angajatMedic.executaActiune();
			
			//2. stabilirea animalului bolnav
			String numeCatel = "Asi";
			System.out.println("\n");
			OperatieCaine operatieCatel = new BuilderOperatieCaine((Medic)angajatMedic, numeCatel)
					.setGreutate(20)
					.setInaltime(50)
					.setVarsta(3)
					.setRasaCaine("buldog")
					.build();
			
			operatieCatel.initializare();
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

				
		//3. stabilirea aparaturi pe care o foloseste
				
		PrototipAparatOperatie aparat = new PrototipAparatOperatie("enb12zn8", "laser");
		
		try {
			PrototipAparatOperatie aparatSecundar = (PrototipAparatOperatie)aparat.clone();
			
		} catch (CloneNotSupportedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
	}

}
