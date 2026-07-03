package DataStructures;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Stack;

import static org.junit.jupiter.api.Assertions.*;

public class MyStackTest {

    private MyStack stack;

    @BeforeEach
    public void setUp() {
        stack = new MyStack();
    }

    @Test
    public void stackIsEmptyTest() {
        assertTrue(stack.isEmpty());
    }

    @Test
    public void pushX_stackIsNot_EmptyTest() {
        assertTrue(stack.isEmpty());
        stack.push("Ada");
        assertFalse(stack.isEmpty());
    }

    @Test
    public void pushX_PopX_StackIsEmptyTest() {
        assertTrue(stack.isEmpty());
        stack.push("Ada");
        stack.pop();
        assertTrue(stack.isEmpty());
    }

    @Test
public void pushX_PushY_PopYTest() {
    assertTrue(stack.isEmpty());
    stack.push("Ada");
    stack.push("Obi");
    assertEquals("Obi", stack.pop());
}

@Test
public void popWithoutPushTest() {
    assertThrows(IllegalArgumentException.class, () -> stack.pop());
}

@Test
public void pushXY_peekYTest() {
    stack.push("Ada");
    stack.push("Obi");
    assertEquals("Obi", stack.peek());
}

@Test
public void pusXY_peekY_pushZ_peekZTest() {
    stack.push("Ada");
    stack.push("Obi");
    assertEquals("Obi", stack.peek());
    stack.push("Obinna");
    assertEquals("Obinna", stack.peek());
}

}