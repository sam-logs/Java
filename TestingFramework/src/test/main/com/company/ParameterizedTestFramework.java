package test.main.com.company;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import service.com.company.ServiceClass;

class ParameterizedTestFramework {

	@ParameterizedTest
	@ValueSource(ints = { 10, 15, 20, 40 })
	@DisplayName(value = "ValueSource")
	public void testWithValueSource(int num) {
		ServiceClass obj = new ServiceClass();
		assertEquals(false, obj.oddEven(num));
	}

	@ParameterizedTest
	@CsvSource({ "10,true", "15,false", "20,true", "25,true" })
	@DisplayName(value = "CSVSource")
	public void testWithCSVSource(int num, boolean check) {
		ServiceClass obj = new ServiceClass();
		assertEquals(check, obj.oddEven(num));
	}

	@ParameterizedTest
	@CsvFileSource(resources = "Demo.csv")
	@DisplayName(value = "CSVFileSource")
	public void testWithCSVFileSource(int num, boolean check) {
		ServiceClass obj = new ServiceClass();
		assertEquals(check, obj.oddEven(num));
	}

}
