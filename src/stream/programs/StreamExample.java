package stream.programs;

public class StreamExample {
    public static void main(String[] args) {
//        1) Given a list of integers, separate odd and even numbers
//        List<Integer> listOfIntegers = Arrays.asList(71, 18, 42, 21, 67, 32, 95, 14, 56, 87);
//        Map<Boolean,List<Integer>> map = listOfIntegers.stream().collect(Collectors.partitioningBy(i->i%2==0));
//        listOfIntegers.stream().collect(Collectors.partitioningBy(i -> i % 2 == 0)).forEach((k,v)-> { String s= k ?"EVEN":"ODD "; System.out.println(s+" : "+v);});

//        2) How do you remove duplicate elements from a list using Java 8 streams?
//        List<String> listOfStrings = Arrays.asList("Java", "Python", "C#", "Java", "Kotlin", "Python");
//        List<String> list = listOfStrings.stream().distinct().toList();
//        listOfStrings.stream().distinct().forEach(System.out::println);

//        3) How do you find frequency of each character in a string using Java 8 streams?
//        String inputString = "Java Concept Of The Day";
//        Stream.of(inputString.split(" ")).forEach(System.out::println);
//        Stream.of(inputString.split("")).collect(Collectors.groupingBy(s->s,Collectors.counting())).forEach((k, v)->System.out.println(k+" : "+v));
//
//        4) How do you find frequency of each element in an array or a list?

//        5) How do you sort the given list of decimals in reverse order?
//        List<Double> decimalList = Arrays.asList(12.45, 23.58, 17.13, 42.89, 33.78, 71.85, 56.98, 21.12);
//        List<Double> revsorted =decimalList.stream().sorted(Comparator.reverseOrder()).toList();
//        decimalList.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);

//        6) Given a list of strings, join the strings with ‘[‘ as prefix, ‘]’ as suffix and ‘,’ as delimiter?
//        List<String> listOfStrings = Arrays.asList("Facebook", "Twitter", "YouTube", "WhatsApp", "LinkedIn");
//        System.out.println("Joined String :"+listOfStrings.stream().collect(Collectors.joining(",","[","]")));

//        7) From the given list of integers, print the numbers which are multiples of 5?
//        List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
//        listOfIntegers.stream().filter(s->s%5==0).forEach(System.out::println);

//        8) Given a list of integers, find maximum and minimum of those numbers?
//        List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
//        System.out.println("Max :"+listOfIntegers.stream().max(Comparator.naturalOrder()));
//        System.out.println("Min :"+listOfIntegers.stream().min(Comparator.naturalOrder()));

//        9) How do you merge two unsorted arrays into single sorted array using Java 8 streams?
//        int[] a = new int[] {4, 2, 7, 1};
//        int[] b = new int[] {8, 3, 9, 5};
//        int[] c = IntStream.concat(Arrays.stream(a), Arrays.stream(b)).sorted().toArray();
//        System.out.println(Arrays.toString(c));

//        10) How do you merge two unsorted arrays into single sorted array without duplicates?
//        int[] a = new int[] {4, 2, 5, 1};
//        int[] b = new int[] {8, 1, 9, 5};
//        int[] d = IntStream.concat(Arrays.stream(a), Arrays.stream(b)).distinct().sorted().toArray();
//        System.out.println(Arrays.toString(d));

    }

}
