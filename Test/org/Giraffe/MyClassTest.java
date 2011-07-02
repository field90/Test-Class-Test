package org.Giraffe;

import static org.junit.Assert.*;

import org.junit.Test;



public class MyClassTest {
	@Test
	public void testEntityX() {
		Entity tester = new Entity(30,12,12);
		assertEquals("Result", 12, tester.getX());
	}
	@Test
	public void testEntityCollidable() {
		Entity e = new Entity(20,5,5);
		Entity e2 = new Entity(20,5,5);
		assertEquals("Result", true, e.collidesWith(e2));
	}
	
}
