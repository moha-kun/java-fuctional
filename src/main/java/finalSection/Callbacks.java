package finalSection;

import java.util.function.Consumer;

public class Callbacks {

    public static void main(String[] args) {

        hello("Mohamed", null,
                value -> System.out.println("No lastName provided for " + value));

    }

    static void hello(String firstName, String lastName, Consumer<String> callback) {
        System.out.println(firstName);
        if (lastName != null)
            System.out.println(lastName);
        else
            callback.accept(firstName);
    }

//    function hello(firstName, lastName, callback) {
//        console.log(firstName);
//        if (lastName)
//            console.log(lastName);
//        else
//            callback();
//    }

}
