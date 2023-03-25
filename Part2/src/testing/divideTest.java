package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class divideTest {

	@Test
	void test() {
		JunitTesting test = new JunitTesting();
		double output = test.divide(6, 2);
		assertEquals(3, output);
	}

}
