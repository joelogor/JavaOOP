package DataStructures;

public class MyQueue {
    private int count;
    private String[] items = new String[5];

    public boolean isEmpty() {
        return count == 0;
    }


    public void offer(String item) {
        items[count] = item;
        count++;
    }


    public String poll() {
        if (isEmpty()) throw new IllegalArgumentException("queue is empty");
        String polled = items[0];

        for (int index = 0; index < count - 1; index++) {
            items[index] = items[index + 1];
        }

        count--;
        items[count] = null;

        return polled;
    }


    public String peek() {
        if (isEmpty()) throw new IllegalArgumentException("queue is empty");
        return items[0];
    }


//    public Executable add(String obi) {

        //return null;
   // }
}

















