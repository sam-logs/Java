package test.main.com.company;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;
import service.com.company.ServiceClass;

class TestFramework {

	@Test
	public void test() {
		System.out.println("In testing");
	}

	@Test
	public void testAddition() {
		ServiceClass obj = new ServiceClass();
		assertEquals(30, obj.addition(10, 20));
	}

	@Test
	public void testCheckName() {
		ServiceClass obj = new ServiceClass();
		assertNull(obj.nameCheck("Ram"));
		assertNotNull("HCL");
	}

	@Test
	@DisplayName(value = "Testing")
	public void testCheckEquals() {
		assertNotEquals(20, 10);
	}

	@Test
	public void testWithoutLogicalCall() {
		assertTrue(10 > 5);
		assertFalse(10 > 20);
	}
	


	@BeforeEach
	public void display() {
		System.out.println("Displaying Before Each");
	}

	@BeforeAll
	public static void beforeAll() {
		System.out.println("Displaying Before All");
	}

	@AfterEach
	public void afterEach() {
		System.out.println("Displaying After Each");
	}

	@AfterAll
	public static void afterAll() {
		System.out.println("displaying After All");
	}
}
