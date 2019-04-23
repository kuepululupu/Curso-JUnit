package org.studyeasy;

import static org.junit.jupiter.api.Assertions.*; //no se si este deba de ir, ya que estoy usando Junit 4 y el ejemplo menciona al 5
import org.junit.Test;

public class MathFunctionsTest {

	@Test
	public void testadd() {
		MathFunctions bb = new MathFunctions(); //Aqui se toman la clase de MathFunction y se renombra por una nueva
		int expected = 40;						//Asi se crea bb. Esta la necesitamos declarar como new MathFunctions
		int actual = bb.add(10, 30);			//Asi bb, tiene los valores de MF y los podemos modificar.
		assertEquals(expected, actual, "Adding Fail");
	}
	
	@Test
	public void tessubs() {
		MathFunctions bb = new MathFunctions(); 
		int expected = -20;						
		int actual = bb.sub(10, 30);			
		assertEquals(expected, actual, "substraing Fail");
	}
	
	@Test
	public void testmul() {
		MathFunctions bb = new MathFunctions(); 
		int expected = 300;					
		int actual = bb.mul(10, 30);			
		assertEquals(expected, actual, "multiplaing Fail");
	}

	
	@Test
	public void testdiv() {
		MathFunctions bb = new MathFunctions(); 
		int expected = 0;						
		int actual = bb.div(10, 30);			
		assertEquals(expected, actual, "Dividen Fail");
		assertThrows(ArithmeticException.class, () -> MathFunctions.div(10,0),"Artic");
	}


}