public class Main {
    public static void main(String[] args) {
        DoublyLinkedList<Integer> dll = new DoublyLinkedList<>();
        Node<Integer> node1 = dll.push(1);
        Node<Integer> node2 = dll.append(3);
        Node<Integer> node3 = dll.append(4);
        dll.append(5);
        
        dll.printList();
        dll.delete(1);
        dll.printList();
        
        
      
       
    }
}
