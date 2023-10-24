import static org.junit.Assert.*;
import org.junit.*;

public class LinkedListTests {

    @Test
    public void testAppend_SingleElement() {
        LinkedList list = new LinkedList();
        list.append(5);
        assertEquals(5, list.first());
        assertEquals(5, list.last());
        assertEquals(1, list.length());
    }

    @Test
    public void testAppend_MultipleElements() {
        LinkedList list = new LinkedList();
        list.append(5);
        list.append(10);
        list.append(15);
        assertEquals(5, list.first());
        assertEquals(15, list.last());  
        assertEquals(3, list.length());
    }

    @Test
    public void testPrepend() {
        LinkedList list = new LinkedList();
        list.prepend(5);
        list.prepend(10);
        assertEquals(10, list.first());
        assertEquals(5, list.last());
        assertEquals(2, list.length());
    }

    @Test(expected = NoSuchElementException.class)
    public void testFirst_EmptyList() {
        LinkedList list = new LinkedList();
        list.first();  // 
    }

    @Test(expected = NoSuchElementException.class)
    public void testLast_EmptyList() {
        LinkedList list = new LinkedList();
        list.last();  
    }

    @Test
    public void testToString() {
        LinkedList list = new LinkedList();
        list.append(5);
        list.append(10);
        list.append(15);
        assertEquals("5 10 15 ", list.toString());
    }
}
