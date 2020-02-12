package academy.learnprogramming;

public class Node {
    int value;
    String string;
    Node next;
    Node previous;

    public Node(){
    }
    public Node(int v) {
        value =v;
        next = null;
        previous = null;
        this.string = null;
    }

    public Node(String string){
        this.next = null;
        this.previous = null;
        this.string = string;
    }

    public void describeNode(){
        if (this.previous == null && this.next ==null) {
            System.out.println("Node {\n\tPrev: Null\n\tValue: " + this.value + "\n\tNext: Null\n}");
        } else if (this.next == null) {
            System.out.println("Node # {\n\tPrev: null\n\tValue: " + this.value + "\n\tNext: Null\n}");
        } else {
            System.out.println("Node  {\n\tPrev: null\n\tValue: " + this.value + "\n\tNext: "+this.next.value +"\n}");
        }
    }
}
