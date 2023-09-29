package combinatorPattern;

import java.time.LocalDate;

import static combinatorPattern.CustomerRegistrationValidator.*;

public class Main {

    public static void main(String[] args) {

        Customer customer = new Customer(
                "Moha",
                "moha@gmail.com",
                "+0123456789",
                LocalDate.of(2001, 7, 17)
        );

        //System.out.println(new CustomerValidatorService().isValid(customer));

        // Using combinator pattern
        ValidationResult result = isEmailValid()
                .and(isPhoneNumberValid())
                .and(isAdult())
                .apply(customer);

        System.out.println(result);

    }

}
