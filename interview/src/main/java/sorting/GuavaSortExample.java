package sorting;
import com.google.common.collect.Ordering;

import java.util.ArrayList;
import java.util.List;


public class GuavaSortExample {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("John", 20));
        students.add(new Student("Alice", 18));
        students.add(new Student("Bob", 22));

        // Sort the list of students based on their names using Guava
        students.sort(
                Ordering.natural().onResultOf(Student::getName)
                        .compound(Ordering.natural().onResultOf(Student::getAge)));

        // Print the sorted list
        for (Student student : students) {
            System.out.println(student.getName() + " - " + student.getAge());
        }
    }
}
