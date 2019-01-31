package queue;

import linkedlist.ListReferenceBasedI;
import exceptions.QueueException;

public class ListBased implements IQueueADT {
    private ListReferenceBasedI aList;

    public ListBased() {
        aList = new ListReferenceBasedI();
    }

    public boolean isEmpty() {
        return aList.isEmpty();
    }

    public void enqueue(Object newItem) {
        aList.add(aList.size(), newItem);
    }

    public Object dequeue() throws QueueException {
        if (!isEmpty()) {
            Object queueFront = aList.get(0);
            aList.remove(0);
            return queueFront;
        }
        else {
            throw new QueueException("QueueException on dequeue: queue empty");
        }
    }

    public void dequeueAll() {
        aList.removeAll();
    }

    public Object peek() throws QueueException {
        if (!isEmpty()) {
            return aList.get(0);
        }
        else {
            throw new QueueException("QueueException on peek: queue empty");
        }
    }
}
