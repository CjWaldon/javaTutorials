package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        //challenge
        int intVal = 20;
        byte byteVal= 10;
        short shortVal= 50;
        long longVal = 50000L+(10L*(intVal+byteVal+shortVal));
        System.out.println("long value : "+ longVal);
    }
}
