package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        int myValue = 10000; //range is
        int myMinIntValue = Integer.MIN_VALUE; // min value of int is -2147483648
        int myMaxIntValue = Integer.MAX_VALUE; // max value of int is 2147483647
        byte minByteValue = Byte.MIN_VALUE;
        byte maxByteValue = Byte.MAX_VALUE;
        short minShortValue = Short.MIN_VALUE;
        short maxShortValue = Short.MAX_VALUE;
        long minLongValue = Long.MIN_VALUE;
        long maxLongValue = Long.MAX_VALUE;
        long myLongValue = 100L; // long type

        int myTotal = (myMinIntValue / 2);
        byte myNewByteValue = (byte)(minByteValue / 2);
        System.out.println("Integer Minimum Value = " + myMinIntValue);
        System.out.println("Integer Maximum Value = " + myMaxIntValue);
        System.out.println("busted max value = "+ (myMaxIntValue+1));
        System.out.println("busted min value = "+ (myMinIntValue-1));
        System.out.println("Min byte value: "+ minByteValue);
        System.out.println("max byte value: "+ maxByteValue);
        System.out.println("Min short value: "+ minShortValue);
        System.out.println("max short value: "+ maxShortValue);
        System.out.println("Min long value: "+ minLongValue);
        System.out.println("max long value: "+ maxLongValue);


    }
}
