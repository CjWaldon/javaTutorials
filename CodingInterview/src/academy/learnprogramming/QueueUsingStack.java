package academy.learnprogramming;

import java.util.ArrayList;

public class QueueUsingStack {
    ArrayList<String> first;
    ArrayList<String> last;

    public QueueUsingStack(){
        this.first = new ArrayList<>();
        this.last = new ArrayList<>();
    }

    public void enqueue(String string){
        int length = this.first.size();
        for(int i = 0; i < length; i++){
            this.last.add(this.first.get(this.first.size()-1));
        }
        this.last.add(string);
    }

    public String dequeue(){
        int length = this.last.size();
        for(int i = 0; i < length; i++){
            this.first.add(this.last.get(this.last.size()-1));
        }
        String s = this.first.get(this.first.size()-1);
        this.first.remove(this.first.size()-1);
        return s;
    }

    public void peek(){
        if(this.last.size() > 0){
            System.out.println(this.last.get(0));
        }else if(this.first.size()>0){
            this.first.get(this.first.size()-1);
        }else{
            System.out.println("null");
        }
    }
}
