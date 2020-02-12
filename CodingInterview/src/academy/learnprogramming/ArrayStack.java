package academy.learnprogramming;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ArrayStack {
    ArrayList<String> stack;

    public ArrayStack(){
        this.stack = new ArrayList<>();
    }

    public void peek(){
        if(stack.size() >0 && !this.stack.isEmpty()){
            System.out.println("Peeked value is: "+ this.stack.get(this.stack.size()-1));
        }else{
            System.out.println("Stack is Empty");
        }
    }

    public void push(String string){
        this.stack.add(string);
    }

    public String pop(){
       String s = this.stack.get(this.stack.size()-1);
       this.stack.remove(this.stack.size()-1);
       return s;
    }

    public void describeStack(){
       for(String s: this.stack){
           System.out.println(s);
        }
    }
}
