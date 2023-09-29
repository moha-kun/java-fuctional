package functionalInterface;

import java.util.List;
import java.util.function.Supplier;

public class _Supplier {

    public static void main(String[] args) {

        Supplier<List<String>> getMySQLDBConnectionUrlsSupplier =
                () ->  List.of("jdbc:mysql://localhost:3306/test",
                                "jdbc:mysql://localhost:3306/user");

        System.out.println(getMySQLDBConnectionUrlsSupplier.get());

        System.out.println(getMySQLDBConnectionUrl());

    }

    static String getMySQLDBConnectionUrl() {
        return "jdbc:mysql://localhost:3306/test";
    }

}
