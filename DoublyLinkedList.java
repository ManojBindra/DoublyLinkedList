public class DoublyLinkedList<T> implements DoublyLinkedListInterface<T> {
    private Node<T> head;
    private Node<T> tail;
    private int size;

    @Override
    public int getSize(){
        return this.size;
    }

    @Override
    public boolean isEmpty(){
        if(size == 0)
            return true;
        return false;
    }
    @Override
    public Node<T> push(T value){
        Node<T> newNode = new Node<>(value);
        if(this.head == null){
            this.head = this.tail = newNode;
        }else{
            newNode.setNext(this.head);
            this.head.setPrev(newNode);
            this.head = newNode;
        }
        this.size++;
        return this.head;
    }

    @Override
    public Node<T> append(T value){
        Node<T> newNode = new Node<>(value);
        if(this.head == null){
            this.head = this.tail = newNode;
        }else{
            newNode.setPrev(this.tail);
            this.tail.setNext(newNode);
            this.tail = newNode;
        }
        this.size++;
        return this.tail;
    }
    
    @Override
    public void printList(){
        Node<T> head = this.head;
        if(this.size == 0){ 
            System.out.println("Empty List! Add items to print List");
            return;
        }
        while(head != null){
            System.out.print(head);
            head = head.getNext();
        }
        System.out.println("");

    }

    @Override
    public void clear(){
        this.head = this.tail = null;
        this.size = 0;
    }
}
