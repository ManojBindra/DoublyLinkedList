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
    public Node<T> insertAfter(Node<T> prevNode, T value){
        if(prevNode == this.tail)
            return(append(value));
        Node<T> newNode = new Node<>(value);
        newNode.setNext(prevNode.getNext());
        prevNode.setNext(newNode);
        newNode.setPrev(prevNode);
        newNode.getNext().setPrev(newNode);
        this.size++;
        return newNode;
    }

    @Override
    public Node<T> insertBefore(Node<T> nextNode, T value){
        if(nextNode == this.head)
            return push(value);
        Node<T> newNode = new Node<>(value);
        newNode.setPrev(nextNode.getPrev());
        newNode.setNext(nextNode);
        nextNode.setPrev(newNode);
        newNode.getPrev().setNext(newNode); 
        this.size++;
        return newNode;
    }

    @Override
    public Node<T> delete(T value){
        Node<T> delNode = search(value);
        if(delNode == null)
            return null;
        if(delNode == this.tail){
            this.tail = delNode.getPrev();
            this.tail.setNext(null);
        }
        else if(delNode == this.head){
            this.head = delNode.getNext();
            this.head.setPrev(null);
        }else{
            Node<T> temp = delNode.getPrev();
            delNode.getPrev().setNext(delNode.getNext());
            delNode.getNext().setPrev(temp);
        }
        return delNode;
    }

    @Override
    public Node<T> search(T value){
        Node<T> newNode = new Node<>(value);
        Node<T> head = this.head;
        while(head != null){
            if(head.equals(newNode))
                return head;
            head = head.getNext();
        }
        return null;
    }

    @Override
    public boolean contains(T value){
        Node<T> searchItem = search(value);
        return !(searchItem == null); 
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
