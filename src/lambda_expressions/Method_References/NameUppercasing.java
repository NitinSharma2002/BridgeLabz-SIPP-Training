package lambda_expressions.Method_References;

import java.util.*;

public class NameUppercasing {
    public static void main(String[] args) {
        List<String> employees = Arrays.asList(
            "Arjun", "Neha", "Ravi", "Simran", "Karan"
        );

        System.out.println("=== Employee Names in Uppercase ===");
        employees.stream()
                 .map(String::toUpperCase) // method reference
                 .forEach(System.out::println);
    }
}

