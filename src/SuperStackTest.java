import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SuperStackTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void testSuperStack() {
		fail("Not yet implemented");
	}

	@Test
	void testIsEmpty() {//create empty stack and check if it is empty
		//fail("Not yet implemented");	//also add a few elemtns and check it is empty
		SuperStack<Integer> stack = new SuperStack<>(1);
		boolean result = stack.isEmpty();
		assertTrue(result);
		stack.push(new Integer(0));
		result = stack.isEmpty();
		assertFalse(result);
	
	}

	@Test
	void testIsFull() {
		fail("Not yet implemented");

	}

	@Test
	void testPush() {
		
		fail("Not yet implemented");
	}

	@Test
	void testPop() {
		fail("Not yet implemented");
	}

	@Test
	void testToString() {
		fail("Not yet implemented");
	}

}
