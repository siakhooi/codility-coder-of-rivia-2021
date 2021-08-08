package nsh.codility;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public abstract class AbstractCoderOfRivia2021Test {
	abstract CoderOfRivia2021Interface getTestObject();

	@Test
	void test01() {
		int[] A = new int[] { 0, 2, 3, 4, 1, 1, 1, 3, 1 };
		int[] R = new int[] { 1, 2, 3, 4, 1, 1, 1, 3, 2 };

		assertArrayEquals(R, getTestObject().solution(A));
	}

	@Test
	void test02() {
		int[] A = new int[] { 1, 1, 1, 2, 2, 1, 2, 2, 1 };
		int[] R = new int[] { 1, 1, 3, 2, 2, 1, 2, 2, 1 };

		assertArrayEquals(R, getTestObject().solution(A));
	}

	@Test
	@DisplayName("Magic Square")
	void test03() {
		int[] A = new int[] { 1, 7, 6, 9, 5, 1, 4, 3, 7 };
		int[] R = new int[] { 2, 7, 6, 9, 5, 1, 4, 3, 8 };

		assertArrayEquals(R, getTestObject().solution(A));
	}

	@Test
	@DisplayName("Already done")
	void test03a() {
		int[] A = new int[] { 2, 7, 6, 9, 5, 1, 4, 3, 8 };
		int[] R = new int[] { 2, 7, 6, 9, 5, 1, 4, 3, 8 };

		assertArrayEquals(R, getTestObject().solution(A));
	}

	@Test
	@DisplayName("All zero")
	void test04() {
		int[] A = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		int[] R = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0 };

		assertArrayEquals(R, getTestObject().solution(A));
	}

	@Test
	@DisplayName("One 100m")
	void test05() {
		int[] A = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 100000000 };
		int[] R = new int[] { 100000000, 0, 0, 0, 100000000, 0, 0, 0, 100000000 };

		assertArrayEquals(R, getTestObject().solution(A));
	}

	@Test
	@DisplayName("Max value of solution> Max value of given matrix")
	void test06() {
		int[] A = new int[] { 0, 2, 9, 0, 0, 0, 0, 0, 0 };
		int[] R = new int[] { 0, 2, 9, 11, 0, 0, 0, 9, 2 };

		assertArrayEquals(R, getTestObject().solution(A));
	}

}
