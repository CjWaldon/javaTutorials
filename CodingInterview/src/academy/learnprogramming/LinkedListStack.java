package academy.learnprogramming;

public class LinkedListStack {
    Node top;
    Node bottom;
    int length;

    public LinkedListStack(){
        this.top = null;
        this.bottom = null;
        this.length = 0;
    }

    public void peek(){
        if(this.top != null){
            System.out.println("Peeked value is: "+ this.top.string);
        }else{
            System.out.println("Stack is Empty");
        }
    }

    public void push(String string){
        Node newNode = new Node(string);
        if(this.bottom == null){
            this.bottom = newNode;
        }
        newNode.next=this.top;
        this.top = newNode;
        this.length++;

    }

    public String pop(){
        if(this.top == null){
            return null;
        }
        if(this.top == this.bottom){
            this.bottom = null;
        }
        String s = this.top.string;
        this.top = this.top.next;
        this.length--;
        return s;
    }

    public void describeStack(){
        Node currNode = this.top;
        int cnt=0;
        System.out.println("Describe Linked Lists:");
        while(currNode != null) {
            if (currNode == this.top) {
                System.out.println("Top Node #" + cnt + " {\n\tPrev: Null\n\tValue: " + currNode.string + "\n\tNext: " + currNode.next.string + "\n}");
            } else if (currNode == this.bottom) {
                System.out.println("Bottom Node #" + cnt + " {\n\tPrev: Null\n\tValue: " + currNode.string + "\n\tNext: Null\n}");
            } else {
                System.out.println("Node #" + cnt + " {\n\tPrev: Null\n\tValue: " + currNode.string + "\n\tNext: "+currNode.next.string +"\n}");
            }
            currNode = currNode.next;
            cnt++;
        }
    }

}
