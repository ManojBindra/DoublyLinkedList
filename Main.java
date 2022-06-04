public class Main {
    public static void main(String[] args) {
        DoublyLinkedList<Integer> dll = new DoublyLinkedList<>();
        dll.push(1);
        Node<Integer> prevNode = dll.append(3);
        dll.append(4);
        dll.insertBefore(prevNode, 2);

        dll.printList();
        
      
       
    }
}
