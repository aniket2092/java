package sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableExample {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("John", 20));
        students.add(new Student("Alice", 18));
        students.add(new Student("Bob", 22));

        // Sort the list of students based on their age
        Collections.sort(students);

        // Print the sorted list
        for (Student student : students) {
            System.out.println(student.getName() + " - " + student.getAge());
        }
    }
}
