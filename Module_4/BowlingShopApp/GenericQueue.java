import java.util.LinkedList;

// GenericQueue class
public class GenericQueue<T> {
    // Private data field to store the queue
    private LinkedList<T> list;

    // Constructor
    public GenericQueue() {
        list = new LinkedList<>();
    }

    // Method to add an item to the queue
    public void enqueue(T item) {
        list.addLast(item);
    }

    // Method to remove and return the first item from the queue
    public T dequeue() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        return list.removeFirst();
    }

    // Method to check if the queue is empty
    public boolean isEmpty() {
        return list.isEmpty();
    }

    // Method to get the size of the queue
    public int size() {
        return list.size();
    }
}
