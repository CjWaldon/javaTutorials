package academy.learnprogramming;

public class LinkedListQueue {
    Node first;
    Node last;
    int length;

    public LinkedListQueue(){
        this.first = null;
        this.last = null;
        this.length = 0;
    }

    public void peek(){
        if(this.first != null){
            System.out.println("Peeked value is: "+ this.first.string);
        }else{
            System.out.println("Stack is Empty");
        }
    }

    public void enqueue(String string){
        Node newNode = new Node(string);

        if(this.first == null){
            this.first = newNode;
            this.last = newNode;
        }else{
            this.last.next = newNode;
            this.last = newNode;
        }
        this.length++;
    }

    public String dequeue(){
        if(this.first == null){
            return null;
        }
        if(this.first == this.last){
            this.last = null;
        }
        String s = this.first.string;
        this.first = this.first.next;
        this.length--;
        return s;
    }

    public void describeQueue(){
        Node currNode = this.first;
        int cnt=0;
        System.out.println("Describe Linked Lists:");
        while(currNode != null) {
            if (currNode == this.first) {
                System.out.println("First Node #" + cnt + " {\n\tPrev: Null\n\tValue: " + currNode.string + "\n\tNext: " + currNode.next.string + "\n}");
            } else if (currNode == this.last) {
                System.out.println("Last Node #" + cnt + " {\n\tPrev: Null\n\tValue: " + currNode.string + "\n\tNext: Null\n}");
            } else {
                System.out.println("Node #" + cnt + " {\n\tPrev: Null\n\tValue: " + currNode.string + "\n\tNext: "+currNode.next.string +"\n}");
            }
            currNode = currNode.next;
            cnt++;
        }
    }
}
