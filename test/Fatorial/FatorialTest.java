package Fatorial;
import junit.framework.TestCase;

public class FatorialTest extends TestCase{
	Fatorial fat = new Fatorial();
	
	//Inválido
	/*public void testT0() {
		assertEquals(0, fat.fat(-1));
	}*/
	
	//Valor 1 = 1
	public void testT1() {
		assertEquals(1, fat.fat(0));
	}
	
	//Valor 2 = 1
	public void testT2() {
		assertEquals(1, fat.fat(1));
	}
	
	//Valor 3 = 120
	public void testT3() {
		assertEquals(120, fat.fat(5));
	}
	
	//Valor 4 = 479001600
	public void testT4() {
		assertEquals(479001600, fat.fat(12));
	}
	
	//Valor 5 = 6227020800 = Estouro da memória
	public void testT5() {
		assertEquals(1932053504, fat.fat(13));
	}
}
