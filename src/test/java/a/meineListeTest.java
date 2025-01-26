package a;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class meineListeTest {

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
	void test() {
		List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(3);
        list1.add(5);
        
        List<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(4);
        
        List<Integer> listExpected = new ArrayList<>();
        listExpected.add(1);
        listExpected.add(2);
        listExpected.add(3);
        listExpected.add(4);
        listExpected.add(5);
		
		assertEquals(listExpected, new meineListe().mergeAndSortLists(list1, list2));	
	}
	
	@Test
	void test2() {
		List<Integer> list1 = Arrays.asList(5, 3, 9, 1);
        List<Integer> list2 = Arrays.asList(8, 6, 5, 3);      
        List<Integer> listExpected = Arrays.asList(1, 3, 5, 6, 8, 9);

		assertEquals(listExpected, new meineListe().mergeAndSortLists(list1, list2));
	}
	
	
	@Test
	void testnull() {
		List<Integer> list1 = null;
        List<Integer> list2 = Arrays.asList(8, 6, 5, 3);      
        List<Integer> listExpected = Arrays.asList(3, 5, 6, 8);

		assertEquals(listExpected, new meineListe().mergeAndSortLists(list1, list2));
	}
	
	@Test
	void testnull2() {
		List<Integer> list1 = Arrays.asList(5, 3, 9, 1);
        List<Integer> list2 = null;    
        List<Integer> listExpected = Arrays.asList(1, 3, 5, 9);

		assertEquals(listExpected, new meineListe().mergeAndSortLists(list1, list2));
	}
	
	@Test
	void testnull3() {
		List<Integer> list1 = null;
        List<Integer> list2 = null;      
        List<Integer> listExpected = null;

		assertEquals(listExpected, new meineListe().mergeAndSortLists(list1, list2));
	}
}
