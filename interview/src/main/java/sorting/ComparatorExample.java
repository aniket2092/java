package sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class ComparatorExample {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("John", 20));
        students.add(new Student("Alice", 18));
        students.add(new Student("Bob", 22));

        // Create a comparator to sort students based on their names
        Comparator<Student> nameComparator = Comparator.comparing(Student::getName);

        // Sort the list of students based on their names
        students.sort(nameComparator);
        Collections.sort(students, nameComparator);
        // Print the sorted list
        for (Student student : students) {
            System.out.println(student.getName() + " - " + student.getAge());
        }
    }
}
