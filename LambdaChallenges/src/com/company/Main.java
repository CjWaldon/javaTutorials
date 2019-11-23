package com.company;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        // CHALLENGE 1
        //convert this code to a lambda expression
//        Runnable runnable = new Runnable() {
//            @Override
//            public void run() {
//                String myString = "Let's split this up into an array";
//                String[] parts = myString.split(" ");
//                for(String part: parts){
//                    System.out.println(part);
//                }
//            }
//        };

        Runnable runnable1 = () -> {
            String myString = "Let's split this up into an array";
            String[] parts = myString.split(" ");
            for (String part : parts) {
                System.out.println(part);
            }
        };

        // CHALLENGE 2
        //Convert this method to a lambda expression, don't worry about assigning it to anything
//    public static String everySecondChar(String source){
//        StringBuilder returnVal = new StringBuilder();
//        for(int i = 0; i < source.length(); i++){
//            if(i%2 ==1){
//                returnVal.append(source.charAt(i));
//            }
//        }
//        return returnVal.toString();
//    }

        Function<String, String> lambdaFunction = s -> {
            StringBuilder returnVal = new StringBuilder();
            for (int i = 0; i < s.length(); i++) {
                if (i % 2 == 1) {
                    returnVal.append(s.charAt(i));
                }
            }
            return returnVal.toString();
        };

        // CHALLENGE 3
        // write previous challenge so it will function with an argument of "1234567890"
        System.out.println(lambdaFunction.apply("1234567890"));

        // CHALLENGE 4
        // pass the created lambdaFunction to a method, write a method called everySecondCharacter that accepts the function as a prameter and executes it with the argument "1234567890"
        // do not hardcode the argument string within the method.

        // CHALLENGE 5
        //USING THE CHALLENGE 4 METHOD, CALL THE MTHOD WITH THE LAMBDAFUNCTION WE CREATED EARLIER AND THE STRING "1234567890" PRINT THE RESULT RETURNED FROM THE METHOD
        System.out.println(everySecondCharacter(lambdaFunction,"1234567890"));

        // CHALLENGE 6
        //write a lambda expression that maps to the java.util.supplier interface. this lambda should return the string " i love java" assign it to a variable called iLovejava
        Supplier<String> iLoveJava = ()->"I love Java!";
            //or
        Supplier<String> iLoveJava2 = () -> {
            return "I Love Java!";
        };

        // CHALLENGE 7
        //As with Function, the Supplier won't do anything until we use it. Use this supplier to assign the string "I love Java!" to a variable called supplierResult.
        // Then print the variable to the console
        String supplierResult = iLoveJava.get();
        System.out.println(supplierResult);

        // CHALLENGE 8
        // There are many interfaces in the java sdk, and sometimes we can use a lambda expression instead of creating an instance that implements the interface we want to use.
        // Given a specific interface, how can we tell whether we can map a lambda expression to it? What's the criteria that has to be met?
        // Challenge 8 ANSWER
        //          The interface has to be a functional interface. it can have only a single method that must be implemented.
        //          A functional interface can contain more than one method, but all the methods but one must have default implementations.
        //          Most of the time, the documentation for an interface wills tate whether it's a functional interface.
        // With that in mind, can we use a lambda expression to represent an instance of the java.util.concurrent.Callable interface?
        // Yes, the callable interface has only one method that must be implemented- the call() method, it is also labeled with @FunctionalInterface.

        // CHALLENGE 9
        //Write code to print the items in the lsit in sorted order, and with the first letter ine ach name upper-cased. The name "harry" should be printed as "Harry"
        // and should be print after "Emiliy" and before "Isla". Use lambda expressions wherever possible.

//            List<String> topNames2015 = Arrays.asList("Amelia", "Olivia", "emily", "Isla", "Ava", "oliver", "Jack", "Charlie", "harry", "jacob");
//            List<String> firstUpperCaseList = new ArrayList<>();
//            topNames2015.forEach(name -> firstUpperCaseList.add(name.substring(0,1).toUpperCase() + name.substring(1)));
//            firstUpperCaseList.sort((s1,s2)->s1.compareTo(s2));
//            firstUpperCaseList.forEach(s->System.out.println(s));

        // CHALLENGE 10
        // Change challenge 9 so that i uses method references. Remember that a method reference looks like Class::MethodName

//            List<String> topNames2015 = Arrays.asList("Amelia", "Olivia", "emily", "Isla", "Ava", "oliver", "Jack", "Charlie", "harry", "jacob");
//            List<String> firstUpperCaseList = new ArrayList<>();
//            topNames2015.forEach(name -> firstUpperCaseList.add(name.substring(0,1).toUpperCase() + name.substring(1)));
//            firstUpperCaseList.sort(String::compareTo);
//            firstUpperCaseList.forEach(System.out::println);

        // CHALLENGE 11
        //Now do the same thing(uppercase first letter, then sort and print the list) using a stream and a chain of stream operations

//        List<String> topNames2015 = Arrays.asList("Amelia", "Olivia", "emily", "Isla", "Ava", "oliver", "Jack", "Charlie", "harry", "jacob");
//        topNames2015.stream().map(name->name.substring(0,1).toUpperCase() + name.substring(1))
//                .sorted(String::compareTo)
//                .forEach(System.out::println);

        //Challenge 12
        // Instead of printing out the sorted names, print out how many names begin with the letter 'A' instead.
        //hint 1:  you'll have to modify the stream chain
        //hint 2: you'll have to add another statement to print the number of items

        List<String> topNames2015 = Arrays.asList("Amelia", "Olivia", "emily", "Isla", "Ava", "oliver", "Jack", "Charlie", "harry", "jacob");
//        topNames2015.stream().map(name->name.substring(0,1).toUpperCase() + name.substring(1))
//                .sorted(String::compareTo)
//                .forEach(System.out::println);
//        long namesBeginningWithA = topNames2015.stream().map(name -> name.substring(0,1).toUpperCase() + name.substring(1))
//                .filter(name -> name.startsWith("A"))
//                .count();
//        System.out.println("number of names beginning with a is: "+namesBeginningWithA);

        //Challenge 13, was a trick question..the point was..
        //Stream chains are evaluated lazily, no actions are performed until a terminal method is called in the stream chain.

        //Challenge 14
        // Add a terminal operation so the chain will execute
        topNames2015.stream()
                .map(name -> name.substring(0, 1).toUpperCase() + name.substring(1))
                .peek(System.out::println)
                .sorted(String::compareTo)
                .collect(Collectors.toList());

    }
    public static String everySecondCharacter(Function<String,String> func, String sourceString){
        return func.apply(sourceString);
    }
}
