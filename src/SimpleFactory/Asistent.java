package SimpleFactory;

public class Asistent implements Angajat{
	private final static int zileLiberePeAn = 21;
	private final static int zileAn = 365;
	private int zileLibere;
	@Override
	public void executaActiune() {
		// TODO Auto-generated method stub
		System.out.println("Asista la operatie ");
	}
	
	public int calculeazaZileLibere(int zileLucrate) throws Exception{
		if(zileLucrate<=0)
			throw new Exception("Zilele Lucrate sunt negative/nulle");
		else if(zileLucrate > 365)
			throw new Exception("Zilele Lucrate sunt prea multe");
		else
			this.zileLibere = (int)(zileLiberePeAn*zileLucrate)/zileAn;
		
		return this.zileLibere;
	}

}
