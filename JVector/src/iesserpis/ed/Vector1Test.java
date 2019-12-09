package iesserpis.ed;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Vector1Test {

	@Test
	void max() {
		//fail("Not yet implemented");
		
		//assertEquals(23, Vector1.max((new int [] {22,15,12,8,9,23} )));
		assertEquals(22, Vector1.max((new int [] {22,15,12,8,9,22} )));
	}
	
	
	@Test
	void min() {
		//fail("Not yet implemented");
		
		assertEquals(8, Vector1.min((new int [] {22,15,12,8,9,23} )));
		//sale error en esta caso
		assertEquals(22, Vector1.min((new int [] {22,15,12,8,9,22} )));
	}

}
