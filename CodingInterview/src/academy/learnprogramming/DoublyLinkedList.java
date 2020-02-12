package academy.learnprogramming;

public class DoublyLinkedList {

    Node head;
    Node tail;
    int length;

    DoublyLinkedList() {
        this.head = null;
        this.tail = head;
        this.length = 0;
    }

    DoublyLinkedList(int value) {
        Node newNode = new Node(value);
        this.head = newNode;
        this.tail = this.head;
        this.length = 1;
    }

    public void append(int value) {
        Node newNode = new Node(value);
        if (this.head == null) {
            this.head = newNode;
            this.tail = head;
        } else {
            newNode.previous = this.head;
            this.tail.next = newNode;
            this.tail = newNode;
        }
        this.length++;
    }

    public void prepend(int value) {
        Node newNode = new Node(value);
        if (this.head != null) {
            newNode.next = this.head;
        }
        this.head.previous = newNode;
        this.head = newNode;
        this.length++;
    }

    public void insert(int index, int value) {
        if (index < 0 || index > this.length) {
            System.out.println("invalid index");
        } else {
            Node newNode = new Node(value);
            if (index == 0) {
                this.prepend(value);
            } else if (index == this.length) {
                this.append(value);
            } else {
                Node currNode = this.traverseToIndex(index - 1);
                newNode.previous= currNode;
                newNode.next = currNode.next;
                newNode.next.previous = newNode;
                currNode.next = newNode;
            }
        }
    }

    public void remove(int index) {
        if (index < 0 || index > this.length) {
            System.out.println("invalid index");
        } else if (index == 0) {
            if (this.head == null) {
                System.out.println("List is null");
            } else {
                this.head = this.head.next;
                this.length--;
            }
        } else {
            Node currNode = traverseToIndex(index - 1);

            if (currNode.next.next == null) {
                this.tail = currNode;
                currNode.next = null;
            } else {
                currNode.next = currNode.next.next;
                currNode.next.previous= currNode;
                currNode = currNode.next;
            }
            this.length--;
        }
    }

    public Node traverseToIndex(int index) {
        if (index == 0) {
            return this.head;
        }
        if (index == this.length - 1) {
            return this.tail;
        }
        Node currNode = this.head.next;
        for (int i = 1; i <= this.length - 1; i++) {
            if (i == index) {
                break;
            } else {
                currNode = currNode.next;
            }
        }
        return currNode;
    }

    public void describeList() {
        Node currNode = this.head;
        int cnt = 0;
        System.out.println("Describe Linked Lists:");
        while (currNode != null) {
            if (currNode == this.head) {
                System.out.println("Node #" + cnt + " {\n\tPrev: Null\n\tValue: " + currNode.value + "\n\tNext: " + currNode.next.value + "\n}");
            } else if (currNode == this.tail) {
                System.out.println("Node #" + cnt + " {\n\tPrev: " + currNode.previous.value +"\n\tValue: " + currNode.value + "\n\tNext: Null\n}");
            } else {
                System.out.println("Node #" + cnt + " {\n\tPrev: " + currNode.previous.value + "\n\tValue: " + currNode.value + "\n\tNext: " + currNode.next.value + "\n}");
            }
            currNode = currNode.next;
            cnt++;
        }
    }

    public void printList() {
        Node currNode = this.head;
        System.out.print("LinkedList: ");
        while (currNode != null) {
            System.out.print(currNode.value + " ");
            currNode = currNode.next;
        }
        System.out.println();
    }
}
