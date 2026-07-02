class LinkedList {
    private Node head;
    private Node tail;
    private int size;

    public LinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public int get(int index) {
        if (index > size - 1 || index < 0) {
            return -1;
        }

        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.getNext();
        }

        return current.getVal();
    }

    public void insertHead(int val) {
        Node newNode = new Node(val, head);
        if (size == 0) {
            head = newNode;
            tail = newNode;
        } else {
            head = newNode;
        }

        size++;
    }

    public void insertTail(int val) {
        Node newNode = new Node(val, null);
        if (size == 0) {
            head = newNode;
            tail = newNode;
        } else {
            tail.setNext(newNode);
            tail = newNode;
        }
        
        size++;
    }

    public boolean remove(int index) {
        if (index > size - 1) {
            return false;
        }

        Node current = head;
        for (int i = 0; i < index - 1; i++) {
            current = current.getNext();
        }

        if (index == size - 1) {
            current.setNext(null);
            tail = current;
        } else if (index == 0) {
            head = head.getNext();
        } else {
            current.setNext(current.getNext().getNext());
        }

        size--;
        return true;
    }

    public ArrayList<Integer> getValues() {
        ArrayList<Integer> res = new ArrayList<>();

        Node current = head;
        for (int i = 0; i < size; i++) {
            res.add(current.getVal());
            current = current.getNext();
        }

        return res;
    }

    private class Node {
        private int val;
        private Node next;

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }

        public int getVal() {
            return val;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node node) {
            this.next = node;
        }
    }
}
