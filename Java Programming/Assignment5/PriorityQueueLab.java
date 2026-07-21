package Assignment5;
import java.util.PriorityQueue;
import java.util.Comparator;

public class PriorityQueueLab {
    public static void main(String[] args) {
        // Comparator defines sorting logic separately, without modifying Item.java
        Comparator<Item> priorityComparator = new Comparator<Item>() {
            public int compare(Item i1, Item i2) {
                return i1.priority - i2.priority; // ascending order of priority
            }
        };

        PriorityQueue<Item> pq = new PriorityQueue<>(priorityComparator);

        pq.add(new Item("Fix critical bug", 1));
        pq.add(new Item("Update documentation", 5));
        pq.add(new Item("Team meeting", 3));
        pq.add(new Item("Deploy release", 2));
        pq.add(new Item("Reply to emails", 4));

        System.out.println("Items in priority order (lowest number = highest priority):");
        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }
    }
}