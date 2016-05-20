package Test;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class Test_Suite extends TestCase {

	public static Test suite(){
		TestSuite colectie = new TestSuite();
		
            colectie.addTestSuite(TestReceptioner.class);	
            colectie.addTestSuite(TestAnuntat.class);
            colectie.addTestSuite(TestAsistent.class);
            colectie.addTestSuite(TestDefinesteActiune.class);
            colectie.addTestSuite(TestMedic.class);
            colectie.addTestSuite(TestOperatiePisica.class);
            colectie.addTestSuite(TestPrototipAparatOperatie.class);

		
		return colectie;
	}
}
