package Assignment5;

public class Item {
    String name;
    int priority;

    Item(String name, int priority) {
        this.name = name;
        this.priority = priority;
    }

    public String toString() {
        return "Item: " + name + ", Priority: " + priority;
    }
}