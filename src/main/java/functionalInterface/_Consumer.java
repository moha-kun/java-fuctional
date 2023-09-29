package functionalInterface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {

    public static void main(String[] args) {
        Customer moha = new Customer("Moha", "0613456789");

        // Normal java function
        greetCustomer(moha);

        // Consumer Functional interface
        Consumer<Customer> greetCustomerConsumer =
                customer -> System.out.println("Hello " + customer.customerName +
                        " thanks for registration phone number " +
                        customer.customerPhoneNumber);
        greetCustomerConsumer.accept(moha);

        BiConsumer<Customer, Boolean> greetCustomerBiConsumer =
                (customer, showPhoneNumber) -> System.out.println("Hello " + customer.customerName +
                        " thanks for registration phone number " +
                        (showPhoneNumber ? customer.customerPhoneNumber : "0*********"));
        greetCustomerBiConsumer.accept(moha, false);

    }

    static void greetCustomer(Customer customer) {
        System.out.println("Hello " + customer.customerName + " thanks for registration phone number " + customer.customerPhoneNumber);
    }

    static class Customer {

        public Customer(String customerName, String customerPhoneNumber) {
            this.customerName = customerName;
            this.customerPhoneNumber = customerPhoneNumber;
        }

        private final String customerName;
        private final String customerPhoneNumber;
    }

}
