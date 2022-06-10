import java.util.HashSet;
import java.util.Set;

public class Course {
    private String name;
    private int hours;
    private Set<Student> students;

    public Course(String name, int time) {
        this.name = name;
        this.hours = time;
        this.students = new HashSet<>();
    }

    public String getName() {
        return name;
    }

    public int getHours() {
        return hours;
    }

    public Set<Student> getStudents() {
        return students;
    }

    public void addStudent(Student student) {
        this.students.add(student);
    }

    @Override
    public String toString() {
        return "Course { " +
                "Name = '" + name + '\'' +
                ", Hours = " + hours +
                ", Students = " + students +
                '}';
    }
}
