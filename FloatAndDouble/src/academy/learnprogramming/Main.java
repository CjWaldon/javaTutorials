package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        float myMinFloatVal = Float.MIN_VALUE;
        float myMaxFloatVal = Float.MAX_VALUE;
        System.out.println("Float minimum value = "+ myMinFloatVal);
        System.out.println("Float maximum value = "+ myMaxFloatVal);

        double myMinDoubleVal = Double.MIN_VALUE;
        double myMaxDoubleVal = Double.MAX_VALUE;
        System.out.println("Double minimum value = "+ myMinDoubleVal);
        System.out.println("Double maximum value = "+ myMaxDoubleVal);

        int myIntValue = 5;
        float myFloatValue = 5.25f;
        double myDoubleValue = 5d;

        double lbs = 200d;
        double kilos = lbs* .45359237;
        System.out.println(kilos);
    }
}
