public interface DoublyLinkedListInterface<T> {
    int getSize();
    void clear();
    boolean isEmpty();
    Node<T> push(T value);
    // boolean contains(T value);
    Node<T> append(T value);
    // Node<T> insertAfter(Node<T> node, T value);
    // Node<T> insertBefore(Node<T> node, T value);
    // Node<T> delete(T value);
    // Node<T> search(T value);
    void printList();


}
