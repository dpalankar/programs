package stream.programs;

import java.util.*;
import java.util.stream.Collectors;

public class StudentStreamExample {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student(1, "Rohit", "Mall", 30, "Male", "Mechanical Engineering", 2015, "Mumbai", 122),
                new Student(2, "Pulkit", "Singh", 56, "Male", "Computer Engineering", 2018, "Delhi", 67),
                new Student(3, "Ankit", "Patil", 25, "Female", "Mechanical Engineering", 2019, "Kerala", 164),
                new Student(4, "Satish Ray", "Malaghan", 30, "Male", "Mechanical Engineering", 2014, "Kerala", 26),
                new Student(5, "Roshan", "Mukd", 23, "Male", "Biotech Engineering", 2022, "Mumbai", 12),
                new Student(6, "Chetan", "Star", 24, "Male", "Mechanical Engineering", 2023, "Karnataka", 90),
                new Student(7, "Arun", "Vittal", 26, "Male", "Electronics Engineering", 2014, "Karnataka", 324),
                new Student(8, "Nam", "Dev", 31, "Male", "Computer Engineering", 2014, "Karnataka", 433),
                new Student(9, "Sonu", "Shankar", 27, "Female", "Computer Engineering", 2018, "Karnataka", 7),
                new Student(10, "Shubham", "Pandey", 26, "Male", "Instrumentation Engineering", 2017, "Mumbai", 98));

        // 1- Find list of students whose first name starts with alphabet A
//        students.stream().filter(s->s.getFirstName().startsWith("A")).collect(Collectors.toList())
//                .forEach(System.out::println);

        // 2- Group The Student By Department Names
//        students.stream().collect(Collectors.groupingBy(s->s.getDepartmantName()))
//                .forEach((s,v)->System.out.println(s+":"+v));

        // 3- Find the total count of student using stream
//        System.out.println("Count of student :"+  students.stream().count());

        // 4- Find the max age of student
        Optional<Integer> maxAge2 = students.stream().map(Student::getAge).max(Comparator.naturalOrder());
        OptionalInt maxAge = students.stream().mapToInt(Student::getAge).max();
//        System.out.println("Max age of student : "+maxAge.getAsInt());

        // 5-Find all departments names
//        List<String> departments = students.stream().map(Student::getDepartmantName).distinct().collect(Collectors.toList());
//        System.out.println("Departments names :"+departments.toString());

        // 6- Find the count of student in each department
//        students.stream().collect(Collectors.groupingBy(s->s.getDepartmantName()))
//                .forEach((s,v)->System.out.println(s+":"+v.size()));
//        students.stream().collect(Collectors.groupingBy(s->s.getDepartmantName(),Collectors.counting()))
//                .forEach((s,v)->System.out.println(s+":"+v));

        // 7- Find the list of students whose age is less than 30
//        List<Student> lstStudent = students.stream().filter(dt -> dt.getAge() < 30).toList();
//        System.out.println("List of students whose age is less than 30 : "+lstStudent);

        // 8- Find the list of students whose rank is in between 50 and 100
//        students.stream().filter(dt -> dt.getRank()>=50 && dt.getRank()<=100).forEach(System.out::println);

        // 9- Find the average age of male and female students
//        System.out.println("average age of male and female students "+students.stream().mapToInt(Student::getAge).average());
//        Map<String,Double> mapAvgAge = students.stream().collect(Collectors.groupingBy(Student::getGender,Collectors.averagingInt(Student::getAge)));
//        Map<String,Double> mapAvgAge = students.stream().collect(Collectors.groupingBy(s->s.getGender(),Collectors.averagingInt(Student::getAge)));
//        System.out.println("Average age of male and female students : "+mapAvgAge);

        // 10- Find the department who is having maximum number of students
        Map<String, Long> mapDept =students.stream().collect(Collectors.groupingBy(Student::getDepartmantName, Collectors.counting()));
        Optional<Map.Entry<String, Long>> mapMaxAge  = mapDept.entrySet().stream().max(Map.Entry.comparingByValue());
//        Map.Entry<String, Long> mapMaxAge = students.stream()
//                .collect(Collectors.groupingBy(Student::getDepartmantName, Collectors.counting())).entrySet().stream()
//                .max(Map.Entry.comparingByValue()).get();
//        System.out.println("Department having maximum number of students : "+mapMaxAge.get());

        // 11- Find the Students who stays in Delhi and sort them by their names
//        List<Student> lstDelhistudent = students.stream().filter(s -> s.getCity().equals("Delhi")).sorted(Comparator.comparing(Student::getFirstName)).toList();
//        System.out.println("List of students who stays in Delhi and sort them by their names : "+lstDelhistudent);

        // 12- Find the average rank in all departments
//        Map<String, Double> depAvgRankMap = students.stream().collect(Collectors.groupingBy(Student::getDepartmantName,Collectors.averagingInt(Student::getRank)));
//        System.out.println("average rank in all departments : "+depAvgRankMap);

        // 13- Find the highest rank in each department)
//        Map<String, Optional<Student>> depHighRankMap = students.stream()
//                .collect(Collectors.groupingBy(Student::getDepartmantName,Collectors.minBy(Comparator.comparing(Student::getRank))));
//        System.out.println("highest rank in all departments : "+depHighRankMap);

        // 14- Find the list of students and sort them by their rank
//        List<Student> rankStudent = students.stream().sorted(Comparator.comparing(Student::getRank)).toList();
//        System.out.println("rankStudent : "+rankStudent);
        students.stream().sorted(Comparator.comparing(Student::getRank)).forEach(System.out::println);
//        students.stream().sorted(Comparator.comparing(Student::getRank).reversed()).forEach(System.out::println);

        // 15- Find the student who has second rank
        Student st = students.stream().sorted(Comparator.comparing(Student::getRank)).skip(1).findFirst().get();


        Optional<Student> secondRankStudent = students.stream().sorted(Comparator.comparing(Student::getRank)).limit(2).max(Comparator.comparing(Student::getRank));
        System.out.println("secondRankStudent : "+secondRankStudent);

        Student student = students.stream().sorted(Comparator.comparing(Student::getRank)).skip(3).findFirst().get();
        System.out.println("Second highest rank student  : "+student);
    }
}
