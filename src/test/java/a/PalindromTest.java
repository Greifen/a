package a;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PalindromTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testisPalindrom() {
		assertEquals(true, new Palindrom().isPalindrom("abba"));
	}
	
	@Test
	void testisPalindrom2() {
		assertEquals(true, new Palindrom().isPalindrom("aba"));
	}

	@Test
	void testisnoPalindrom() {
		assertEquals(false, new Palindrom().isPalindrom("daa"));
	}
}
