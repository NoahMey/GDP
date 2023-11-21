import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;

public class StackTests {


    @Test(timeout = 1000)
	public void basicSanityTest() {
        Stack stack = new Stack(17);
        for (int i = 0; i < 17; i = i + 1) {
            stack.push(Integer.valueOf(i));
        }

        for (int i = 16; i >= 0; i = i - 1) {
            assertEquals(Integer.valueOf(i), stack.pop());            
        }        
	}

    @Test(timeout = 1000)
	public void sizeTest() {

		Stack q = new Stack(17);
        q.push(Integer.valueOf(7));
        assertEquals(1, q.size());
        q.push(Integer.valueOf(9));
        assertEquals(2, q.size());
        q.pop();
        assertEquals(1, q.size());
        q.pop();
        assertEquals(0, q.size());
	}

    @Test(timeout = 1000)
	public void capacityTests() {

		Stack q = new Stack(0);
        assertNull(q.pop());
        assertFalse(q.push(Integer.valueOf(7)));        
	}


}
