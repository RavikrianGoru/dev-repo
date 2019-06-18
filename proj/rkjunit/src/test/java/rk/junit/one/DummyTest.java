package rk.junit.one;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTimeout;
import static org.junit.jupiter.api.Assertions.assertTimeoutPreemptively;
import static org.junit.jupiter.api.Assumptions.assumeFalse;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

import java.time.Duration;
import java.util.function.Supplier;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("development")
public class DummyTest {

	Dummy obj = new Dummy();

	private static String message() {
		return "TEST Execution Failed :: ";
	}

	@Test
	@Tag("development")
	@Tag("production")
	void sumPTest() {
		assertEquals(4, obj.sum(2, 2));

	}

	@Test
	@Tag("production")
	void sumNTest() {
		Supplier<String> messageSupplier = () -> "sum(2, 2) is not extected 4  for N+ test failed";
		assertNotEquals(5, obj.sum(2, 2), messageSupplier);
	}

	@Test
	@Disabled("This TC is disabled & @Disable can be applied at class level")
	void sayHiTest() {
		assertEquals("Hi", obj.sayHi());
	}

	@Test
	@Tag("production")
	void testOnDec() {
		System.setProperty("ENV", "DEV");
		assumeTrue("PROD".equals(System.getProperty("ENV")), DummyTest::message);
	}

	@Test
	void testOnProd() {
		System.setProperty("ENV", "PROD");
		assumeFalse("DEV".equals(System.getProperty("ENV")), DummyTest::message);
	}

	@Test
	@RepeatedTest(value = 5, name = "{displayName} - repetition {currentRepetition} of {totalRepetitions}")
	@DisplayName("Nothing Test operation")
	void nothingTest() {
		assertThrows(Exception.class, () -> {
			obj.nothing();
		});
	}

	@Test
	void testCase() {

		assertTimeout(Duration.ofMinutes(1), () -> {
			return "result";
		});

		assertTimeout(Duration.ofMillis(100), () -> {
			Thread.sleep(200);
			return "result";
		});

		assertTimeoutPreemptively(Duration.ofMillis(100), () -> {
			Thread.sleep(200);
			return "result";
		});
	}

}
