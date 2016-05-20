package State;

public class stateUrgente implements State{

	@Override
	public void doAction(Context context) {
		// TODO Auto-generated method stub
		System.out.println("Se solicita Urgenta");
		context.setState(this);
	}
	public String toString(){
		return "URGENTE";
	}


}
