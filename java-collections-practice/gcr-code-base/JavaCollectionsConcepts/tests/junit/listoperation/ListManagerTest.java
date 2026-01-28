package junit.listoperation;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.regexandjunit.junit.listoperation.ListManager;

import java.util.ArrayList;
import java.util.List;

class ListManagerTest {

	// ListManager object for testing
	private ListManager listManager;

	// Test list used in each test
	private List<Integer> list;

	// Initializes objects before each test
	@BeforeEach
	void setUp() {
		listManager = new ListManager();
		list = new ArrayList<>();
	}

	// Tests adding elements to the list
	@Test
	void testAddElement() {
		listManager.addElement(list, 10);
		listManager.addElement(list, 20);

		assertEquals(2, list.size());
		assertTrue(list.contains(10));
		assertTrue(list.contains(20));
	}

	// Tests removing an element from the list
	@Test
	void testRemoveElement() {
		list.add(10);
		list.add(20);
		list.add(30);

		listManager.removeElement(list, 20);

		assertEquals(2, list.size());
		assertFalse(list.contains(20));
	}

	// Tests list size after operations
	@Test
	void testGetSize() {
		listManager.addElement(list, 5);
		listManager.addElement(list, 15);

		assertEquals(2, listManager.getSize(list));

		listManager.removeElement(list, 5);
		assertEquals(1, listManager.getSize(list));
	}
}
