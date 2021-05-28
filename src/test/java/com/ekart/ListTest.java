package com.ekart;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class ListTest {


	@Test
	public void test() {

		List mockListObj = mock(List.class);
		
		when(mockListObj.size()).thenReturn(3);
		
		assertEquals(3,mockListObj.size());		
		
		}
	
	
	@Test
	public void test2() {
		
		List mockListObj = mock(List.class);
		
		when(mockListObj.get(2)).thenReturn("Lenevo").thenReturn("Dell");
		
		assertEquals("Lenevo",mockListObj.get(2));
		assertEquals("Dell",mockListObj.get(2));
			
		}
	
	
	@Test
	public void test3() {
		
		List mockListObj = mock(List.class);
		
	
		when(mockListObj.get(anyInt())).thenReturn("Lenevo").thenReturn("Dell");
		
		assertEquals("Lenevo",mockListObj.get(2));
		assertEquals("Dell",mockListObj.get(2));
			
		}
	
	
	@Test(expected=ArrayIndexOutOfBoundsException.class)
	public void test4() {
		
		List mockListObj = mock(List.class);
			
		when(mockListObj.get(-1)).thenThrow(new ArrayIndexOutOfBoundsException("invalid argument.!"));
		
		mockListObj.get(-1);
			
		}
}