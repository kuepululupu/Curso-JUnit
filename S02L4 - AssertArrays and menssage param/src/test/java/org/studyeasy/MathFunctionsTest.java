package org.studyeasy;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.*; //no se si este deba de ir, ya que estoy usando Junit 4 y el ejemplo menciona al 5
import org.junit.Test;

public class MathFunctionsTest {

	@Test
	public void testadd() {
		MathFunctions bb = new MathFunctions(); //Aqui se toman la clase de MathFunction y se renombra por una nueva
		int expected = 40;						//Asi se crea bb. Esta la necesitamos declarar como new MathFunctions
		int actual = bb.add(10, 30);			//Asi bb, tiene los valores de MF y los podemos modificar.
		assertEquals(expected, actual);
	}

}