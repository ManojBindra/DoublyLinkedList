import java.util.Objects;

public class Node<T>{
    private T value;
    private Node<T> prev;
    private Node<T> next;

    public Node(T value) {
        this.value = value;
        this.prev = null;
        this.next = null;
    }

    public T getValue() {
        return this.value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public Node<T> getPrev() {
        return this.prev;
    }

    public void setPrev(Node<T> prev) {
        this.prev = prev;
    }

    public Node<T> getNext() {
        return this.next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "{" +
            " value='" + getValue() + "'" + "}";
    }

    @Override
    @SuppressWarnings("all")
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Node)) {
            return false;
        }
        Node<T> node = (Node<T>) o;
        return Objects.equals(value, node.value);
    }


}