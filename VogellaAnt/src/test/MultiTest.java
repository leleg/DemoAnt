package test;
import math.MyMath;
import static org.junit.Assert.*;

import org.junit.Test;

public class MultiTest {

	@Test
	public void test() {
		MyMath mtest = new MyMath();
		int output = mtest.multi(5, 5);
		assertEquals(25, output);
	}

}
