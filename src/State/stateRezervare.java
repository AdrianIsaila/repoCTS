package State;

public class stateRezervare implements State {

	@Override
	public void doAction(Context context) {
		// TODO Auto-generated method stub
		System.out.println("Se solicita rezervare");
		context.setState(this);
	}

	public String toString(){
		return "REZERVARE";
	}

}
