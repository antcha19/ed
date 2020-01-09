package iesserpis.ed;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Vector1Test {

	@Test
	void max() {
		//fail("Not yet implemented");
		
		//assertEquals(23, Vector1.max((new int [] {22,15,12,8,9,23} )));
		assertEquals(55, Vector1.max((new int [] {22,15,12,8,9,55} )));
		
		Assertions.assertThrows(IllegalArgumentException.class,
				() -> Vector1.max(new int[] {})
		);
	}
	
	
	@Test
	void min() {
		//fail("Not yet implemented");
		
		assertEquals(8, Vector1.min((new int [] {22,15,12,8,9,23} )));
		//sale error en esta caso
		assertEquals(5, Vector1.min((new int [] {22,15,5,8,9,22} )));
	}

}
