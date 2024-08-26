package com.java.junitwithmockito;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import com.java.junit.parameterized.ReverseString;

public class ReverseStringTest {

	ReverseString rs = new ReverseString();
	
	
	//ParameterizedTest
	
	@DisplayName("Testing Parameterized method - @CsvSource")
	@ParameterizedTest
	@CsvSource({
		"Arun Developer, Developer Arun",
		"Java Developing, Developing Java"
	})
	void testReverseStringMethod_Parameterized(String str, String Expected) {
		String res = rs.reverseString(str);
		assertEquals(Expected, res);
	}
// -----------------------------------------------------------------------------------------------
	
	@DisplayName("Testing Parameterized method - @MethodSource")
	@ParameterizedTest
	@MethodSource("PassingArguments")
	void testReverseStringMethod_ParameterizedMethodSource(String str, String Expected) {
		String res = rs.reverseString(str);
		assertEquals(Expected, res);
	}
	
	private static Stream<Arguments> PassingArguments() {
		return Stream.of(
				Arguments.of("Developer Arun","Arun Developer"),
				Arguments.of("Arguments Passing","Passing Arguments")
				);
	}
// -----------------------------------------------------------------------------------------------	

//	@Test
//	void TestReverseString() {
//		String s = "Programming";
//		String expected = "Programming ";
//		String actual = rs.reverse(s, 0, s.length()-1);
//		System.out.println(actual);
//		assertEquals(expected, actual);
//	}
//	
//	@Test
//	void TestReverseStringMethod() {
//	   String actual = rs.reverseString();
//	   String expected = "Programming Is Java";
//	   assertEquals(expected, actual);
//	}
}
