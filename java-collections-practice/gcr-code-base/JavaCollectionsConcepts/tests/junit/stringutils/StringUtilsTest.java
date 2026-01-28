package junit.stringutils;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.regexandjunit.junit.stringutils.StringUtils;

class StringUtilsTest {

	// StringUtils object for testing
	private StringUtils stringUtils;

	// Initializes object before each test
	@BeforeEach
	void setUp() {
		stringUtils = new StringUtils();
	}

	// Tests reverse method
	@Test
	void testReverse() {
		assertEquals("cba", stringUtils.reverse("abc"));
		assertEquals("", stringUtils.reverse(""));
		assertNull(stringUtils.reverse(null));
	}

	// Tests palindrome checking
	@Test
	void testIsPalindrome() {
		assertTrue(stringUtils.isPalindrome("madam"));
		assertTrue(stringUtils.isPalindrome("level"));
		assertFalse(stringUtils.isPalindrome("hello"));
		assertFalse(stringUtils.isPalindrome(null));
	}

	// Tests uppercase conversion
	@Test
	void testToUpperCase() {
		assertEquals("HELLO", stringUtils.toUpperCase("hello"));
		assertEquals("JAVA", stringUtils.toUpperCase("Java"));
		assertNull(stringUtils.toUpperCase(null));
	}
}
