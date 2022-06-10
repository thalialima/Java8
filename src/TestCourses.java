import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class TestCourses {
    public static void main(String[] args) {
        Course course1 = new Course("Java Collections", 20);
        Course course2 = new Course("Git a GitHub", 12);
        Course course3 = new Course("AngularJS", 14);

        Student student1 = new Student(1, "Thalia", "thalia@email.com");
        Student student2 = new Student(2, "Maria", "maria@email.com");
        Student student3 = new Student(3, "Larissa", "larissa@email.com");

        course1.addStudent(student1);
        course1.addStudent(student2);
        course2.addStudent(student2);
        course2.addStudent(student3);
        course3.addStudent(student1);
        course3.addStudent(student3);

        List<Course> courses = Arrays.asList(course1, course2, course3);

        courses.sort(Comparator.comparing(Course::getHours));

        courses.forEach(c -> System.out.println(c.getName()));

        //now all collections has a method that is called stream()
        //this method return a sequence of objects
        //using stream has no side effects on original Collection
        courses.stream()
                .filter(course -> course.getHours() > 15)
                .forEach(System.out::println);

        System.out.println("map");
        courses.stream()
                .filter(course -> course.getHours() > 15)
                .map(Course::getStudents)
                .forEach(students -> students.forEach(student -> System.out.println(student.getName())));

        System.out.println("mapToInt");
        IntStream intStream = courses.stream()
                .mapToInt(Course::getHours);

        System.out.println(intStream.sum());

        //stream is not the same thing that collections


    }
}
