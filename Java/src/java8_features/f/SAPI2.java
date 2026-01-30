package streamapi.f;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class SAPI2 {

    public static void main(String[] args) {

        // ================= NUMBERS =================
        List<Integer> numbers = Arrays.asList(10, 15, 20, 25, 30, 15, 40, 50,50);

        System.out.println("Even numbers:");
        numbers.stream()
                .filter(n -> n % 2 == 0)
                .forEach(System.out::println);

        System.out.println("\nOdd numbers:");
        numbers.stream()
                .filter(n -> n % 2 != 0)
                .forEach(System.out::println);

        System.out.println("\nNumbers between 15 and 40:");
        numbers.stream()
                .filter(n -> n >= 15 && n <= 40)
                .forEach(System.out::println);

        System.out.println("\nDuplicate numbers:");
        numbers.stream()
                .filter(n -> Collections.frequency(numbers, n) > 1)
                .collect(Collectors.toSet())
                .forEach(System.out::println);


        System.out.println("\n Remove Duplicate numbers:");
      List<Integer> arr=  numbers.stream()
                .distinct()
                .collect(Collectors.toList());
System.out.println(arr);

        System.out.println("\n find Sum Of numbers:");
        int sum = numbers.stream()
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println(sum);

        System.out.println("\n Find Max OF numbers:");
        int max = numbers.stream()
                .mapToInt(Integer::intValue)
                .max()
                .getAsInt();
        System.out.println(max);

        System.out.println("\n Find Min Of numbers:");
        int min = numbers.stream()
                .mapToInt(Integer::intValue)
                .min()
                .getAsInt();

        System.out.println(min);
        System.out.println("\n Find Second Highest numbers:");
        Integer secondHighest = numbers.stream()
                .distinct()
                .sorted(Collections.reverseOrder())
                .skip(1)
                .findFirst()
                .orElse(null);

        System.out.println(secondHighest);
        System.out.println("\n average numbers:");
        double avg = numbers.stream().mapToInt(Integer::intValue).average().getAsDouble();
        System.out.println("Average: " + avg);

        System.out.println("\nSquare of Numbers:");
        numbers.stream()
                .map(n -> n * n)
                .forEach(System.out::println);

        System.out.println("\nSorted Numbers:");
        numbers.stream()
                .sorted()
                .forEach(System.out::println);

        System.out.println("\nReverse Sorted Numbers:");
        numbers.stream()
                .sorted(Collections.reverseOrder())
                .forEach(System.out::println);

        System.out.println("\nFirst 3 Numbers:");
        numbers.stream()
                .limit(3)
                .forEach(System.out::println);

        System.out.println("\nSkip First 2 Numbers:");
        numbers.stream()
                .skip(2)
                .forEach(System.out::println);

        long count =
                numbers.stream().count();
        System.out.println("\nCount: " + count);



        System.out.println("\nUnique numbers:");
        numbers.stream()
                .filter(n -> Collections.frequency(numbers, n) == 1)
                .forEach(System.out::println);

        // ================= STRINGS =================
        List<String> skills = Arrays.asList("Java", "Spring", "", "SQL", null, "API", "Java");

        System.out.println("\nNon-null strings:");
        skills.stream()
                .filter(Objects::nonNull)
                .forEach(System.out::println);

        System.out.println("\nNon-empty strings:");
        skills.stream()
                .filter(s -> s != null && !s.isEmpty())
                .forEach(System.out::println);

        System.out.println("\nStrings starting with 'S':");
        skills.stream()
                .filter(s -> s != null && s.startsWith("S"))
                .forEach(System.out::println);

        System.out.println("\nDistinct strings:");
        skills.stream()
                .filter(Objects::nonNull)
                .distinct()
                .forEach(System.out::println);


//******************************* Functional Interface ********************************
        // Supplier
System.out.println("\n  Supplier interface in stream api");
        Supplier<String> x=()-> "Sandesh Yadav";
        System.out.println(x.get());

// Consumer

        System.out.println("\n  Consumer interface in stream api");
        Consumer<String> consumer = s -> System.out.println(s);

        consumer.accept("Hello Java");
// consumer with stream api
        List<String> names = Arrays.asList("Java", "Spring", "Kafka");
        names.stream()
                .forEach(name -> System.out.println(name));

// Predicate simple example

        Predicate<Integer> predicate = z -> z > 10;

        System.out.println(predicate.test(20)); // true

        // predicate with stream api

        List<Integer> result = numbers.stream()
                .filter(n -> n > 15)
                .collect(Collectors.toList());

        System.out.println(result);

// Function

        Function<String, Integer> function = s -> s.length();

        System.out.println(function.apply("Java"));
// function with stream api

        // for string length
        List<Integer> slengths = names.stream()
                .map(s ->s.length())
                .collect(Collectors.toList());

        System.out.println(slengths);
// for integer length
        List<Integer> ilengths = numbers.stream()
                .map(n -> String.valueOf(n).length())
                .collect(Collectors.toList());

        System.out.println(ilengths);

        // foreach
        numbers.stream()
                .forEach(System.out::println);



        // ================= OBJECT FILTER =================
        List<Employee> employees = Arrays.asList(
                new Employee(1, "Amit", 28, "IT", 60000, LocalDate.of(2021, 5, 10)),
                new Employee(2, "Ravi", 24, "HR", 40000, LocalDate.of(2023, 1, 5)),
                new Employee(3, "Neha", 30, "IT", 75000, LocalDate.of(2020, 3, 15)),
                new Employee(4, "Pooja", 26, "Finance", 50000, LocalDate.of(2022, 7, 20))
        );

        System.out.println("\nEmployees with salary > 50000:");
        employees.stream()
                .filter(e -> e.getSalary() > 50000)
                .forEach(System.out::println);

        System.out.println("\nEmployees from IT department:");
        employees.stream()
                .filter(e -> e.getDept().equals("IT"))
                .forEach(System.out::println);

        System.out.println("\nEmployees age > 25 AND dept = IT:");
        employees.stream()
                .filter(e -> e.getAge() > 25 && e.getDept().equals("IT"))
                .forEach(System.out::println);

        System.out.println("\nEmployees joined in last 3 years:");
        employees.stream()
                .filter(e -> e.getJoiningDate().isAfter(LocalDate.now().minusYears(3)))
                .forEach(System.out::println);

        // ================= FILTER + MAP =================
        System.out.println("\nSalary doubled for IT employees:");
        employees.stream()
                .filter(e -> e.getDept().equals("IT"))
                .map(e -> e.getSalary() * 2)
                .forEach(System.out::println);

        // ================= CUSTOM PREDICATE =================
        Predicate<Employee> highSalary = e -> e.getSalary() > 60000;

        System.out.println("\nEmployees with high salary (custom predicate):");
        employees.stream()
                .filter(highSalary)
                .forEach(System.out::println);

        // ================= ANYMATCH / ALLMATCH =================
        boolean anyHighSalary =
                employees.stream().anyMatch(e -> e.getSalary() > 70000);
        System.out.println("\nAny employee salary > 70000: " + anyHighSalary);
        System.out.println("\nAny employee salary > 70000: " + anyHighSalary);

        boolean allAdults =
                employees.stream().allMatch(e -> e.getAge() > 18);
        System.out.println("All employees are adults: " + allAdults);
    }
}
