package sorting;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamSortExample {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("John", 20));
        students.add(new Student("Alice", 18));
        students.add(new Student("Bob", 22));

        // Sort the list of students based on their names using Java streams
        List<Student> sortedStudents = students.stream()
                .sorted(Comparator.comparing(Student::getName))
                .collect(Collectors.toList());

        // Print the sorted list
        for (Student student : sortedStudents) {
            System.out.println(student.getName() + " - " + student.getAge());
        }
    }
}
