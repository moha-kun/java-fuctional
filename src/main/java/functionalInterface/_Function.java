package functionalInterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {

    public static void main(String[] args) {
        // Function takes 1 argument and produces 1 result
        Function<Integer, Integer> incrementByOneFunction =
                number -> number + 1;

        Function<Integer, Integer> multipleBy10Function =
                number -> number * 10;

        // BiFunction takes 2 arguments and produces 1 result
        BiFunction<Integer, Integer, Integer> incrementByOneAndMultiplyFunction =
                (numberToIncrementByOne, numberToMultiplyBy) -> (numberToIncrementByOne + 1) * numberToMultiplyBy;

        int increment = incrementByOne(1);
        System.out.println(increment);

        int incrementFunction = incrementByOneFunction.apply(1);
        System.out.println(incrementFunction);

        int multiply = multipleBy10Function.apply(incrementFunction);
        System.out.println(multiply);

        // Chain two Function object
        Function<Integer, Integer> incrementBy1AndThenMultiplyBy10Function =
                incrementByOneFunction.andThen(multipleBy10Function);
        System.out.println(incrementBy1AndThenMultiplyBy10Function.apply(4));

        System.out.println(incrementByOneAndMultiplyFunction.apply(4,10));
    }

    static int incrementByOne(int number) {
        return number + 1;
    }

    static int incrementByOneAndMultiply(int number, int numToMultiplyBy) {
        return (number + 1) * numToMultiplyBy;
    }

}
