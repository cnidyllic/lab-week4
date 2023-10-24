import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }
	import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {

    @Test 
    public void testReverseInPlace_SingleElement() {
        int[] input1 = { 3 };
        ArrayExamples.reverseInPlace(input1);
        assertArrayEquals(new int[]{ 3 }, input1);
    }

    @Test 
    public void testReverseInPlace_MultipleElements() {
        int[] input = { 1, 2, 3, 4, 5 };
        ArrayExamples.reverseInPlace(input);
        assertArrayEquals(new int[]{ 5, 4, 3, 2, 1 }, input);
    }

    @Test 
    public void testReverseInPlace_EvenNumberOfElements() {
        int[] input = { 1, 2, 3, 4 };
        ArrayExamples.reverseInPlace(input);
        assertArrayEquals(new int[]{ 4, 3, 2, 1 }, input);
    }

    @Test
    public void testReversed_EmptyArray() {
        int[] input1 = { };
        assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
    }

    @Test
    public void testReversed_MultipleElements() {
        int[] input = { 1, 2, 3, 4, 5 };
        int[] result = ArrayExamples.reversed(input);
        assertArrayEquals(new int[]{ 5, 4, 3, 2, 1 }, result);
    }

    @Test
    public void testReversed_EvenNumberOfElements() {
        int[] input = { 1, 2, 3, 4 };
        int[] result = ArrayExamples.reversed(input);
        assertArrayEquals(new int[]{ 4, 3, 2, 1 }, result);
    }
}

}
