package DataStructures;

public class MyStack {
    private int count;                    // tracks number of elements (starts at 0)
    private String[] items = new String[5];  // fixed capacity of 5

    public boolean isEmpty() {
        if (count == 0) return true;
        return false;
    }

    public void push(String item) {
        items[count] = item;
        count++;
    }

    public String pop() {
        if (isEmpty()) throw new IllegalArgumentException("stack is empty");
        String popped = items[--count];
        return popped;
    }

    public String peek() {
        String output = items[count-1];
        count++;
        return output;
    }
}

