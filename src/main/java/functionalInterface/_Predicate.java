package functionalInterface;

import java.util.function.Predicate;

public class _Predicate {

    public static void main(String[] args) {

        // Predicate Functional interface
        Predicate<String> isPhoneNumberValidPredicate =
                phoneNumber -> phoneNumber.startsWith("07") && phoneNumber.length() == 10;

        Predicate<String> containsNumber3Predicate =
                phoneNumber -> phoneNumber.contains("3");

        // BiPredicate Functional interface

        // Chain two Predicate objects
        System.out.println("Chain two Predicate objects \n" +
                "Is phone number valid and contain number 3");
        System.out.println(isPhoneNumberValidPredicate.and(containsNumber3Predicate)
                .test("0700000000"));
        System.out.println(isPhoneNumberValidPredicate.and(containsNumber3Predicate)
                .test("0700003000"));

        // with predicate
        System.out.println("Is phone number valid");
        System.out.println("With Predicate");
        System.out.println(isPhoneNumberValidPredicate.test("0700003000"));
        System.out.println(isPhoneNumberValidPredicate.test("070030000"));
        System.out.println(isPhoneNumberValidPredicate.test("0900030000"));

        // Normal java function
        System.out.println("Without Predicate");
        System.out.println(isPhoneNumberValid("0700030000"));
        System.out.println(isPhoneNumberValid("070003000"));
        System.out.println(isPhoneNumberValid("0903000000"));

    }

    static boolean isPhoneNumberValid(String phoneNumber) {
        return phoneNumber.startsWith("07") && phoneNumber.length() == 10;
    }

}
