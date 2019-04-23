package org.studyeasy;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.Test;

@SuppressWarnings("unused")
public class ArrayDemoTest {

	@Test
	public void test() {
		ArrayDemo demo = new ArrayDemo();
		int[] actual = demo.returnArray();
		int[] expected = {1,2,3};
		assertArrayEquals(actual, expected, "Revisa el orden");
	}

}
