package DataStructures;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MyQueueTest {

    private MyQueue queue;

    @BeforeEach
    public void setUp() {
        queue = new MyQueue();
    }

    @Test
    public void queueIsEmptyTest() {
        assertTrue(queue.isEmpty());
    }

    @Test
    public void offerX_queueIsNotEmptyTest() {
        queue.offer("Ada");
        assertFalse(queue.isEmpty());
    }
    @Test
    public void addXIsFullQueue_queueThrowsException() {
        queue.add("Ada");
        queue.add("Ada");
        queue.add("Ada");
        queue.add("Ada");
        queue.add("Ada");
        assertThrows(IllegalStateException.class, queue.add("Obi"));
    }

    @Test
    public void addX_removeX_queueIsEmptyTest() {
        queue.offer("Ada");
        queue.poll();
        assertTrue(queue.isEmpty());
    }

    @Test
    public void addX_addY_removeXTest() {
        queue.offer("Ada");
        queue.offer("Obi");

        assertEquals("Ada", queue.poll()); // First in, first out!
    }

    @Test
    public void removeWithoutAddTest() {
        assertThrows(IllegalArgumentException.class, () -> queue.poll());
    }

    @Test
    public void addXY_PeekXTest() {
        queue.offer("Ada");
        queue.offer("Obi");
        assertEquals("Ada", queue.peek());
    }
}
