import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class StringUtil {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testReverseString() {
	assertEquals("olleh",StringUtils.reverseString("hello"));
	assertEquals("nihtin",StringUtils.reverseString("nithin"));
	assertEquals("elppa",StringUtils.reverseString("apple"));
	assertEquals("retaw",StringUtils.reverseString("water"));
	assertEquals("lukog",StringUtils.reverseString("gokul"));
	}

	@Test
	public void testIsPalindrome() {
     assertTrue(StringUtils.isPalindrome("mom"));
     assertTrue(StringUtils.isPalindrome("Race Car"));
     assertTrue(StringUtils.isPalindrome("Nitin"));
     assertFalse(StringUtils.isPalindrome("Nithin9"));
	
	
	}

}
