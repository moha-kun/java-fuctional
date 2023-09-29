package finalSection;

import java.io.FilenameFilter;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Lambdas {

    public static void main(String[] args) {

        Function<String, String> upperCaseName = String::toUpperCase;
        List.of("Mohamed",
                "Yassine",
                "Youness",
                "Aicha",
                "Ali");

    }

}
