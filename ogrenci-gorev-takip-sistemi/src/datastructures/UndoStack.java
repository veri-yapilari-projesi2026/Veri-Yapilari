package datastructures;

public class UndoStack {
    private static class Node {
        String action;
        Node next;

        Node(String action) {
            this.action = action;
        }
    }

    private Node top;
    private int size = 0;

    public void push(String action) {
        Node newNode = new Node(action);
        newNode.next = top;
        top = newNode;
        size++;
    }

    public String pop() {
        if (isEmpty()) return null;
        String data = top.action;
        top = top.next;
        size--;
        return data;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public static void main(String[] args) {
        UndoStack undo = new UndoStack();
        undo.push("Gorev #1: Devam ediyor");
        undo.push("Gorev #1: Tamamlandı");

        System.out.println("Geri alinan islem: " + undo.pop());
    }
}
